package sistema.modelos;

public class Credenciales {

    private String contraseña;
    private String usuario;

    public Credenciales(String contraseña, String usuario) {
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    public Credenciales() {
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
}
