package unidad5_poo;

import java.util.ArrayList;

/**
 * @author Mariana Dominguez
 */
public class Unidad5_POO {

    public static void main(String[] args) {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new Secretario(123, 1152120101, "ROSANA", "TILLARD", "DNI", 38465878, "Independencia 750", "0351152135136", 15000));
        listaEmpleados.add(new Vendedor("351156111222", 10, 12, "GUILLERMO", "FUNES", "DNI", 40333555, "Chacabuco 231", "0351152626111", 22000));
        listaEmpleados.add(new JefeDeZona(20, "ESTEBAN", "QUITO", "DNI", 28000555, "Av. Libertador 156", "0351152626000", 45000));

        for (Empleado e : listaEmpleados) {
            e.mostrarDatos();
            e.incrementarSalario();
            e.cambiarDeCoche();
            System.out.println("****************************\n");
        }
        
    }

}
/*
CONSIGNA:

Se pretende desarrollar un conjunto de clases que representen, de forma
simplificada, a una hipotética empresa dedicada a vender un producto.
A continuación, se describen las características básicas de estas clases:
1. Empleado. Clase básica que describe a un empleado. Incluye sus
atributos : datos personales (nombre, apellidos, DNI, dirección) y
algunos datos tales como los años de antigüedad, teléfono de
contacto y su salario.
Incluye también información de quién es el empleado que lo supervisa
(Empleado *). Tendrá, al menos, las siguientes métodos:
Constructores para definir correctamente un empleado, a partir de sus
atributos , nombre, apellidos, DNI, dirección, teléfono y salario.
• Debe mostrar en la ejecución los datos.
• Cambiar supervisor
• Incrementar salario
2. Secretario. Tiene despacho, número de fax e incrementa su salario
un 5% anual. Tendrá, al menos, las siguientes métodos:
• Constructores (debe rellenar la información personal y los datos
principales)
• Debe mostrar en la ejecución sus datos personales y su puesto en la
empresa).
3. Vendedor. Tiene coche de la empresa (identificado por la matricula,
marca y modelo), teléfono móvil, área de venta, y porcentaje que se
lleva de las ventas en concepto de comisiones. Incrementa su salario
un 10% anual. Tendrá, al menos, las siguientes métodos:
Constructores (debe rellenar la información personal y los datos
principales)
• Debe mostrar en la ejecución sus datos personales y su puesto en la
empresa).
• Cambiar de coche
4-Jefe de zona. Tiene despacho, tiene un secretario a su cargo, una lista de
vendedores a su cargo y tiene coche de la empresa (identificado por la
matrícula, marca y modelo). Incrementa su salario un 20% anual. Tendrá, al
menos, las siguientes métodos:
• Constructores (debe rellenar la información personal y los datos
principales)
• Debe mostrar en la ejecución sus datos personales y su puesto en la
empresa).
• Cambiar de secretario.
• Cambiar de coche.
• Dar de alta y de baja un nuevo vendedor en su zona.
Todos los empleados son vendedores, jefes de zona o secretarios. Hacer un
programa de prueba que muestre como funciona. Probar, especialmente,
que el método incrementar salario se comparta bien, según el empleado.
*/