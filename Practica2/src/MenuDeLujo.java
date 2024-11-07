import java.util.Iterator;
import java.util.Hashtable;

public class MenuDeLujo implements Menu{
    
    private Hashtable<Integer, Hamburguesa> hamburguesas = new Hashtable<>();

    
    /** 
     * @return Iterator<Hamburguesa> Regresa un Iterador para Hashtable<Integer,Hamburguesa>
     */
    public Iterator<Hamburguesa> crearIterador(){
        return new MenuDeLujoIterador(this.hamburguesas);
    }

    public MenuDeLujo(){
	    HamburguesaVegetariana hamburguesaVegetariana = new HamburguesaVegetariana();
	    HamburguesaCarnitas hamburguesaCarnitas = new HamburguesaCarnitas();
	    HamburguesaPastor hamburguesaPastor = new HamburguesaPastor();
	    hamburguesas.put(1, hamburguesaVegetariana);
	    hamburguesas.put(2, hamburguesaCarnitas);
	    hamburguesas.put(3, hamburguesaPastor);
    }

}
