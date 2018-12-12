package unidad5_poo;

import java.util.Scanner;

/**
 * @author Mariana Dominguez
 */
public class Coche {

    private String matricula;
    private String marca;
    private int modelo;

    public Coche(){
        matricula = "";
        marca = "";
        modelo = 0;
    }
    
    public Coche(String matricula, String marca, int modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    //Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void ingresarCoche() {
        Scanner leerDatos = new Scanner(System.in);
        String matric, marc;
        int model;

        System.out.println("Ingrese los datos del coche");
        System.out.print("Matrícula: ");
        matric = leerDatos.nextLine();

        System.out.print("Marca: ");
        marc = leerDatos.nextLine();

        System.out.print("Modelo (año): ");
        model = leerDatos.nextInt();

        Coche coche = new Coche(matric, marc, model);
    }
    
    @Override
    public String toString(){
        return "Coche: " + "Matrícula " + matricula + "," + " Marca " + marca + "," + " Modelo " + modelo;
    }
    
}
