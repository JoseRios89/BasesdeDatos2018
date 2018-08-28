package sistema.modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Login {
    private int codigoLogin;
    private String password;
    private String username;
    private Date fechaIngreso;

    public Login(int codigoLogin, String password, String username, String fechaIngreso) {
        this.codigoLogin = codigoLogin;
        this.password = password;
        this.username = username;
        this.fechaIngreso = this.parseFechaIngreso(fechaIngreso);
    }

    public int getCodigoLogin() {
        return codigoLogin;
    }

    public void setCodigoLogin(int codigoLogin) {
        this.codigoLogin = codigoLogin;
    }

    public void setCodigoLogin(String codigoLogin) {
        this.codigoLogin = Integer.parseInt(codigoLogin);
    }    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    private Date parseFechaIngreso(String fechaIngreso) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = formatter.parse(fechaIngreso);
        } catch (ParseException ex) {
            System.out.print("=== RegistroLogin:ParseFechaIngreso:ParseException" + ex);
        }
        return date;
    }

   
}
