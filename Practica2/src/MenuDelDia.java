import java.util.ArrayList;
import java.util.Iterator;

public class MenuDelDia implements Menu{
    
    private ArrayList<Hamburguesa> hamburguesas;

    
    /** 
     * @return Iterator<Hamburguesa> Regresa el iterador por defecto de ArrayList<>
     */
    public Iterator<Hamburguesa> crearIterador(){
        return this.hamburguesas.iterator();
    }

    public MenuDelDia(){
        this.hamburguesas = new ArrayList<Hamburguesa>();
        this.hamburguesas.add(new HamburguesaTripleQueso());
        this.hamburguesas.add(new HamburguesaPatria());
        this.hamburguesas.add(new HamburguesaLuisMiguel());
    }


}