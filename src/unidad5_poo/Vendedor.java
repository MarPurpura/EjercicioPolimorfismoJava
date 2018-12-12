package unidad5_poo;

import java.util.Scanner;

/**
 * @author Mariana Dominguez
 */
public class Vendedor extends Empleado {

    private Coche coche;
    private String celular;
    private int areaDeVenta;
    private double comision;

    public Vendedor(String celular, int areaDeVenta, double comision, String nombre, String apellido, String tipoDoc, int documento, String direccion, String telefono, double salario) {
        super(nombre, apellido, tipoDoc, documento, direccion, telefono, salario);
        this.celular = celular;
        this.areaDeVenta = areaDeVenta;
        this.comision = comision;
    }

    //Getters
    public Coche getCoche() {
        return coche;
    }

    public String getCelular() {
        return celular;
    }

    public int getAreaDeVenta() {
        return areaDeVenta;
    }

    public double getComision() {
        return comision;
    }

    //Setters
    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setAreaDeVenta(int areaDeVenta) {
        this.areaDeVenta = areaDeVenta;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    //Métodos
    @Override
    public void mostrarDatos() {

        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("Puesto: VENDEDOR");
        System.out.println("Puesto: SECRETARIO");
        System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido());
        System.out.println("Tipo y Nro. de Documento: " + getTipoDoc() + " " + getDocumento());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Antiguedad: " + getAntiguedad());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Salario: $" + getSalario());
        System.out.println("Supervisor: " + getSupervisor());
        //Datos propios del Vendedor        
        System.out.println("Celular: " + celular);
        System.out.println("Area de Venta: " + areaDeVenta);
        System.out.println("Comisión: " + comision);

    }

    @Override
    public void incrementarSalario() {
        double incremento = 0.10;
        setSalario(getSalario() * (1 + incremento));
        System.out.println("\nSu nuevo sueldo es de $" + Math.round(getSalario()));
    }
    
    @Override
    public void cambiarDeCoche(){
        Scanner respuesta = new Scanner(System.in);

        System.out.println("¿Desea cambiar el coche " + "del VENDEDOR " + getNombre() + " " + getApellido() + " ? (SI ó NO)");
        String rta = respuesta.nextLine();
        if (rta.equalsIgnoreCase("SI")) {
            Coche c = new Coche();
            c.ingresarCoche();
        }
    }
}
