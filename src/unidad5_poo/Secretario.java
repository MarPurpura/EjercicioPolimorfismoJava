package unidad5_poo;

/**
 * @author Mariana Dominguez
 */
public class Secretario extends Empleado {
    private int despacho;
    private int nroFax;

    public Secretario (String nombre, String apellido, String tipoDoc, int documento){
        super(nombre, apellido, tipoDoc, documento);
    }
    
    public Secretario(int despacho, int nroFax, String nombre, String apellido, String tipoDoc, int documento, String direccion, String telefono, double salario) {
        super(nombre, apellido, tipoDoc, documento, direccion, telefono, salario);
        this.despacho = despacho;
        this.nroFax = nroFax;
    }

    //Getters
    public int getDespacho() {
        return despacho;
    }

    public int getNroFax() {
        return nroFax;
    }
    
    //Setters

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public void setNroFax(int nroFax) {
        this.nroFax = nroFax;
    }
    
    //Métodos
    @Override
    public void mostrarDatos(){
        
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("Puesto: SECRETARIO");
        System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido());
        System.out.println("Tipo y Nro. de Documento: " + getTipoDoc() + " " + getDocumento());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Antiguedad: " + getAntiguedad());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Salario: $" + getSalario());
        System.out.println("Supervisor: " + getSupervisor());
        //Datos propios del Secretario
        System.out.println("Despacho Nro: " + despacho);
        System.out.println("Nro. de FAX: " + nroFax);
    }
    
    @Override
    public void incrementarSalario(){
        double incremento = 0.05;
        setSalario(getSalario() * (1 + incremento));
        System.out.println("\nSu nuevo sueldo es de $" + Math.round(getSalario()));
        
    }
    
    @Override
    public void cambiarDeCoche(){
        System.out.println("Los secretarios no poseen coche");
    }
}


