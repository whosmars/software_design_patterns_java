import java.util.Iterator;

public class MenuGeneralIterador implements Iterator<Hamburguesa>{
    
    private Hamburguesa [] hamburguesas;
    private int posicion;

    public MenuGeneralIterador(Hamburguesa [] hamburguesas){
        this.hamburguesas = hamburguesas;
        this.posicion = 0;
    }

    
    /** 
     * @return boolean
     */
    public boolean hasNext(){
        if(this.posicion < this.hamburguesas.length)
            return true;
        return false;
    }

    
    /** 
     * @return Hamburguesa
     */
    public Hamburguesa next(){
        Hamburguesa apuntador = this.hamburguesas[this.posicion];
        this.posicion = this.posicion + 1;
        return apuntador;
    }


}