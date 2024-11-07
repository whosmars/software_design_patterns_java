/**
 * Clase que hereda de Hamburguesa. Termina de implementar Templeate asi como la iniciacion de sus atributos
 * @author Compunenes
 * @version 1.0
 */
public class HamburguesaDoble extends  Hamburguesa{
    public HamburguesaDoble() {
        super(2,
            "HamburguesaDoble",
            "Hamburquesa Doble",
            100,
                true,
            false);

    }

    @Override
    public void prepararCarne() {
        System.out.println("Se preparan las dos carnes");
    }

    @Override
    public void presentacionHamburguesa() {
        System.out.println("Se preparará tu hamburguesa: " +  super.nombreHamburguesa);
    }

    @Override
    public void ponerQueso(){
        if(super.tieneQueso)
            System.out.println("Se le ha puesto queso");
        return;
    }

}
