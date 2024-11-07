/**
 * Clase que hereda de Hamburguesa. Termina de implementar Templeate asi como la iniciacion de sus atributos
 * @author Compunenes
 * @version 1.0
 */
public class HamburguesaPastor extends Hamburguesa{
    public HamburguesaPastor() {
        super(6,
	      "HamburguesaPastor",
                "Hamburquesa de pastor",
                150,
                true,
                false);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Se prepara el pastor");
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
