public class proyectoObra {
    private int id;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    private double presupuesto;
    private String estado;
    private String fechaInicio;
    private String fechaFin;

    // ==== CONSTRUCTOR ====

    public proyectoObra(int id, String nombre, String descripcion, String ubicacion,
                            double presupuesto, String estado, String fechaInicio, String fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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
    // GET DESCRIPCION
    public String getDescripcion() {
        return descripcion;
    }
    // GET UBICACION
    public String getUbicacion() {
        return ubicacion;
    }
    // GET PRESUPUESTO
    public double getPresupuesto() {
        return presupuesto;
    }
    // GET ESTADO
    public String getEstado() {
        return estado;
    }
    // GET FECHA INICIO
    public String getFechaInicio() {
        return fechaInicio;
    }
    // GET FECHA FIN
    public String getFechaFin() {
        return fechaFin;
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
    // SET DESCRIPCION
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    // SET UBICACION
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    // SET PRESUPUESTO
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    // SET ESTADO
    public void setEstado(String estado) {
        this.estado = estado;
    }
    // SET FECHA INICIO
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    // SET FECHA FIN
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    // ==== toString ====
    @Override
    public String toString() {
        return "ProyectoObra {" + 
                "ID: " + id +
                "Nombre: " + nombre +
                "Descripcion: " + descripcion +
                "Presupuesto: $" + presupuesto +
                "Estado: " + estado +
                "Fecha Inicio: " + fechaInicio +
                "Fecha Fin: " + fechaFin;
    }
}
