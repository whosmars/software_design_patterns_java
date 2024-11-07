import java.util.Iterator;

public class MenuGeneral implements Menu{

    private final int NUMERO_HAMBURGUESAS_MENU = 3;
    
    private Hamburguesa [] hamburguesas;
 
    /** 
     * @return Iterator<Hamburguesa> Regresa un iterador para Hamburguesa []
     */
    public Iterator<Hamburguesa> crearIterador(){
        return new MenuGeneralIterador(this.hamburguesas);
    }

    public MenuGeneral() {
        this.hamburguesas = new Hamburguesa[NUMERO_HAMBURGUESAS_MENU];
        this.hamburguesas[0] = new HamburguesaSencilla();
        this.hamburguesas[1] = new HamburguesaDoble();
        this.hamburguesas[2] = new HamburguesaHawaina();

    }
}