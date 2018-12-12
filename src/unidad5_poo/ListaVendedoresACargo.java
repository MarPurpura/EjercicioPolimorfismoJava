package unidad5_poo;
import java.util.ArrayList;
/**
* @author Mariana Dominguez
 */
public class ListaVendedoresACargo {
    private ArrayList<Vendedor>listaVendedores;

    //Contructores
    public ListaVendedoresACargo(){
        listaVendedores = new ArrayList<Vendedor>();
    }
    
    public ListaVendedoresACargo(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }
    
    //Métodos
    public void altaVendedor(Vendedor nuevoVendedor){
        listaVendedores.add(nuevoVendedor);
    }
    
    public void bajaVendedor(Vendedor vendedorDadoDeBaja){
        listaVendedores.remove(vendedorDadoDeBaja);
    }
    
    public void mostrarListaVendedores(){
        System.out.println("Lista de vendedores a cargo:");
        for(Vendedor vendedor: listaVendedores)
            vendedor.mostrarDatos();
    }
    
}
