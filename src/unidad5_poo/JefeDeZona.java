package unidad5_poo;

import java.util.Scanner;

/**
 * @author Mariana Dominguez
 */
public class JefeDeZona extends Empleado {

    private int despacho;
    private Secretario secretarioACargo;
    private ListaVendedoresACargo vendedoresACargo;
    private Coche coche;

    public JefeDeZona() {

    }

    public JefeDeZona(int despacho, String nombre, String apellido, String tipoDoc, int documento, String direccion, String telefono, double salario) {
        super(nombre, apellido, tipoDoc, documento, direccion, telefono, salario);
        this.despacho = despacho;

    }

    //Getters
    public int getDespacho() {
        return despacho;
    }

    public Secretario getSecretarioACargo() {
        return secretarioACargo;
    }

    public ListaVendedoresACargo getVendedoresACargo() {
        return vendedoresACargo;
    }

    public Coche getCoche() {
        return coche;
    }

    //Setters
    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public void setSecretarioACargo(Secretario secretarioACargo) {
        this.secretarioACargo = secretarioACargo;
    }

    public void setVendedoresACargo(ListaVendedoresACargo vendedoresACargo) {
        this.vendedoresACargo = vendedoresACargo;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    //Métodos
    @Override
    public void mostrarDatos() {
        
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("Puesto: JEFE DE ZONA");
        System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido());
        System.out.println("Tipo y Nro. de Documento: " + getTipoDoc() + " " + getDocumento());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Antiguedad: " + getAntiguedad());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Salario: $" + getSalario());
        //Datos propios del Jefe de Zona
        System.out.println("Despacho: " + despacho);
        System.out.println("Secretario a cargo: " + secretarioACargo); 
        System.out.println("Vendedores a cargo: " + vendedoresACargo); 
        System.out.println("Coche: " + coche); 
    }

    public void cambiarSecretario() {
        Scanner leerDato = new Scanner(System.in);

        System.out.println("\n¿Desea cambiar el secretario?");
        String rta = leerDato.nextLine();
        if (rta.equalsIgnoreCase("SI")) {

            System.out.println("Ingrese NOMBRE:");
            String nom = leerDato.nextLine();

            System.out.println("Ingrese APELLIDO:");
            String ape = leerDato.nextLine();

            System.out.println("Ingrese TIPO de DOCUMENTO:");
            String tipoDoc = leerDato.nextLine();

            System.out.println("Ingrese DOCUMENTO:");
            int doc = leerDato.nextInt();

            Secretario secretarioNuevo = new Secretario(nom, ape, tipoDoc, doc);
            this.secretarioACargo = secretarioNuevo;
            
            System.out.println("\nEl nuevo secretario a cargo es: ");
            secretarioNuevo.mostrarDatos();
        }

    }
    @Override
    public void incrementarSalario() {
        double incremento = 0.20;
        setSalario(getSalario() * (1 + incremento));
        System.out.println("\nSu nuevo sueldo es de $" + Math.round(getSalario()));
    }
    
    @Override
    public void cambiarDeCoche() {
        Scanner respuesta = new Scanner(System.in);

        System.out.println("¿Desea cambiar el coche " + "del JEFE DE ZONA " + getNombre() + " " + getApellido() + " ? (SI ó NO)");
        String rta = respuesta.nextLine();
        if (rta.equalsIgnoreCase("SI")) {
            Coche c = new Coche();
            c.ingresarCoche();
        }
    }
}
