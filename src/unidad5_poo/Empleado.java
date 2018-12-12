package unidad5_poo;

/**
 * @author Mariana Dominguez
 */
abstract public class Empleado {
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private int documento;
    private String direccion;
    private int antiguedad;
    private String telefono;
    private double salario;
    private Empleado supervisor;
    
    
    public Empleado(){
        antiguedad = 0;
    }

    public Empleado(String nombre, String apellido, String tipoDoc, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDoc = tipoDoc;
        this.documento = documento;
    }
    
    
    public Empleado(String nombre, String apellido, String tipoDoc, int documento, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSalario() {
        return salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
    
    public abstract void mostrarDatos();

    
    public void cambiarSupervisor(Empleado nvoSupervisor){
        supervisor = nvoSupervisor;
    }
    
    public abstract void incrementarSalario();
    
    public abstract void cambiarDeCoche();
              
    
}
