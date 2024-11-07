import java.util.Iterator;
import java.util.Set;
import java.util.Hashtable;

public class MenuDeLujoIterador implements Iterator<Hamburguesa>{
    
    private Hashtable<Integer, Hamburguesa> hamburguesas;
    
    private Set<Integer> llaves;
    
    private Iterator<Integer> iterador;

    public MenuDeLujoIterador(Hashtable<Integer, Hamburguesa> hamburguesas){
        this.hamburguesas = hamburguesas;
        this.llaves = hamburguesas.keySet();
        this.iterador = llaves.iterator();
    }

    
    /** 
     * @return boolean
     */
    public boolean hasNext(){
        return this.iterador.hasNext();
    }

    
    /** 
     * @return Hamburguesa
     */
    public Hamburguesa next(){
        Hamburguesa h = this.hamburguesas.get(iterador.next());
        return h;
    }


}
