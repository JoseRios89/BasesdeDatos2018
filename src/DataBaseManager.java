import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jramos
 */
public class DataBaseManager {

    public DataBaseManager() {
        // El constructor de este objeto debe de cargar la conexión a la base de datos.
        // Esta clase podría ser un singleton para evitar abrir varias instancias de la
        // conexión a la base de datos.
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
        catch(Exception e){
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
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return valor;
    }
}
