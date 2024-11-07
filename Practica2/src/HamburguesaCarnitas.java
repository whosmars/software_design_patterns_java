/**
 * Clase que hereda de Hamburguesa. Termina de implementar Templeate asi como la iniciacion de sus atributos
 * @author Compunenes
 * @version 1.0
 */
public class HamburguesaCarnitas extends Hamburguesa{
    public HamburguesaCarnitas() {
        super(5,
	      "HamburguesaCarnitas",
                "Hamburquesa de carnitas",
                160,
                true,
                false);
    }

    @Override
    public void presentacionHamburguesa() {
        System.out.println("Se preparará tu hamburguesa: " +  super.nombreHamburguesa);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Se preparan las carnitas");
    }

    @Override
    public void ponerQueso(){
        if(super.tieneQueso)
            System.out.print("Se le ha puesto queso");
        return;
    }

}
