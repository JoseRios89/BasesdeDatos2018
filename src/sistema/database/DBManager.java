package sistema.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.scripts.DBScripts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jramos
 */
public class DBManager {
    private static DBManager databaseManager;
    private static DBConnector connector;

    public static DBConnector getConnector() {
        return connector;
    }

    public static void setConnector(DBConnector connector) {
        DBManager.connector = connector;
    }

    public DBManager() {

    }
    
    // Se se quiere usar una instancia de esta clase, se debe de
    // utilizar este metodo estatito. En lugar de iniciarlizar un objeto nuevo.
    // DBManager manager = DBManager.getInstance();
    //
    public static DBManager getInstance(){
        if(databaseManager == null){
            databaseManager = new DBManager();
            connector = new DBConnector();
        }
        connector.connect();
        return databaseManager;
    }
    
    public void executeUpdate(String query) {
        connector.executeUpdate(query);
    }
    
    public void executeQuery(String query) {
        ResultSet resultados = connector.executeQuery(query);
        try {
            List<String> results = new ArrayList<>();
            while(resultados.next()) {
                System.out.println(resultados.getString(1));
                results.add(resultados.getString(1));
            }
            System.out.println(results);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    
    @SuppressWarnings("null")
    public boolean createDB() {
        DBScripts scripts = new DBScripts();
        File file = scripts.readFileToCreateDataBase();
        boolean isScriptExecuted = false;

        try {
            StringBuilder query = new StringBuilder();
            try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                String linea;
                while ((linea = in.readLine()) != null) {
                    query.append(linea).append("\n");
                }
            }
            connector.executeUpdate(query.toString());
            isScriptExecuted = true;
        } catch (IOException e) {
            System.err.println("=== DBManager:CreateDB::Exception ===> " + e);
        }
        return isScriptExecuted;
    }
    
    @SuppressWarnings("null")
    public boolean createTables() {
        DBScripts scripts = new DBScripts();
        File file = scripts.readFileToCreateTables();
        boolean isScriptExecuted = false;

        try {
            StringBuilder query = new StringBuilder();
            try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                String linea;
                while ((linea = in.readLine()) != null) {
                    query.append(linea).append("\n");
                }
            }
            connector.executeUpdate(query.toString());
            isScriptExecuted = true;
        } catch (IOException e) {
            System.err.println("=== DBManager:CreateTables::Exception ===> " + e);
        }
        return isScriptExecuted;
    }
    
    // Metodo para salvar los datos de un objeto en la BD.
    public void salvarObjeto(Object objeto) {
        String nombreTabla = new StringBuilder().append("tbl_").
          append(objeto.getClass().getSimpleName().toLowerCase()).toString();
        String atributosObjeto = this.lineaDesdeArray(this.obtenerNombresDeAtributos(objeto));
        String valoresObjeto = this.lineaDesdeArray(this.obtenerValoresDeAtributos(objeto));

        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO ").append(nombreTabla);
        query.append(" (").append(atributosObjeto).append(")");
        query.append(" VALUES (").append(valoresObjeto).append(");");

        System.out.println(query.toString());
    }
    
    // Metodo para borrar los datos de la BD.
    public void destruirObjeto(Object objeto) {
        String nombreClase = objeto.getClass().getSimpleName();
        String nombreTabla = new StringBuilder().append("tbl_").
          append(nombreClase.toLowerCase()).toString();
        String llavePrimaria = new StringBuilder().append("codigo").append(nombreClase).toString();
        String valorLlavePrimaria = this.evaluarLlavePrimaria(objeto, llavePrimaria);

        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM ").append(nombreTabla);
        query.append(" WHERE ").append(llavePrimaria).append(" = ");
        query.append("'").append(valorLlavePrimaria).append("'").append(";");
        
        System.out.println(query.toString());
    }
    
    // Metodo para actualizar la información de la BD.
    public void actualizarObjeto(Object objeto) {
        String nombreClase = objeto.getClass().getSimpleName();
        String nombreTabla = new StringBuilder().append("tbl_").
          append(nombreClase.toLowerCase()).toString();
        String atributosObjeto = this.lineaDesdeArray(this.obtenerNombresDeAtributos(objeto));
        String llavePrimaria = new StringBuilder().append("codigo").append(nombreClase).toString();
        String valoresObjeto = this.lineaDesdeArray(this.obtenerValoresDeAtributos(objeto));
        String valorLlavePrimaria = this.evaluarLlavePrimaria(objeto, llavePrimaria);

        StringBuilder query = new StringBuilder();
        query.append("UPDATE ").append(nombreTabla);
        query.append(" SET ").append(valoresObjeto);
        query.append(" WHERE ").append(llavePrimaria).append(" = ");
        query.append("'").append(valorLlavePrimaria).append("'").append(";");

        System.out.println(query.toString());
    }
        
    // Cambiar el tipo de retorno del metodo al hacer el llamado a la BD.
    //public List<Object> obtenerLista(String nombreClase) {
    public void obtenerLista(String nombreClase) {
        String nombreTabla = new StringBuilder().append("tbl_").
          append(nombreClase.toLowerCase()).toString();
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM ").append(nombreTabla).append(";");

        ResultSet resultados = connector.executeQuery(query.toString());

        try {
            System.out.println(resultados.first());
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarConexion() {
        connector.close();
    }
    
    private List<String> obtenerNombresDeAtributos(Object objeto) {
        Class<?> clazz = objeto.getClass();
        List<String> atributosDeClase = new ArrayList<>();

        for(Field field : clazz.getDeclaredFields()) {
            StringBuilder atributoFormateado = new StringBuilder();
            //you can also use .toGenericString() instead of .getName(). This will
            //give you the type information as well.
            atributoFormateado.append("'").append(field.getName()).append("'");
            atributosDeClase.add(atributoFormateado.toString());
        }
        
        return atributosDeClase;
    }
    
    private List<String> obtenerValoresDeAtributos(Object objeto) {
        List<String> atributos = this.obtenerNombresDeAtributos(objeto);
        List<String> valores = new ArrayList<>();
        
        try {
            for (int contador = 0; contador < atributos.size(); contador++) {
                String nombreMetodo = "get" + StringUtils.capitalize(atributos.get(contador).replace("'", ""));
                Method metodo = objeto.getClass().getMethod(nombreMetodo);
                String valorMetodo = "'" + metodo.invoke(objeto).toString() + "'";
                valores.add(valorMetodo);
            }
        }
        catch(IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e){
           System.out.println(e);
        }

        return valores;
    }
    
    private String lineaDesdeArray(List<String> listaDatos) {
        List<String> listaDeDatos = new ArrayList<>(listaDatos);
        String linea = String.join(", ", listaDeDatos);
        return linea;
        
    }
    
    private String evaluarLlavePrimaria(Object objeto, String nombreLLavePrimaria) {
        String valor = new String();
        
        try {
            String nombreMetodo = "get" + StringUtils.capitalize(nombreLLavePrimaria.replace("'", ""));
            Method metodo = objeto.getClass().getMethod(nombreMetodo);
            valor = metodo.invoke(objeto).toString();
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println(e);
        }
        
        return valor;
    }
}
