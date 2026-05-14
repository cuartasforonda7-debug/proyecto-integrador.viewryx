public class Usuario {
    int id;
    String nombre;
    String correo;
    String password;
    String rol;

    public Usuario(int id, String nombre, String correo, String password, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }

    // ==== GETTERS ====

    // GET ID
    public int getId() {
        return id;
    }
    // GET NOMBRE
    public String getNombre() {
        return nombre;
    }
    // GET CORREO
    public String getCorreo() {
        return correo;
    }
    // GET PASSWORD
    public String getPassword() {
        return password;
    }
    // GET ROL
    public String getRol() {
        return rol;
    }

    // ==== SETTERS ====

    // SET ID
    public void setId(int id) {
        this.id = id;
    }
    // SET NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // SET CORREO
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    // SET PASSWORD
    public void setPassword(String password) {
        this.password = password;
    }
    // SET ROL
    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                "Nombre: " + nombre +
                "Correo: " + correo +
                "Password: " + password +
                "Rol: " + rol;
    }
}   

