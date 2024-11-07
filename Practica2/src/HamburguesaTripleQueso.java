/**
 * Clase que hereda de Hamburguesa. Termina de implementar Templeate asi como la iniciacion de sus atributos
 * @author Compunenes
 * @version 1.0
 */
public class HamburguesaTripleQueso extends Hamburguesa{
    public HamburguesaTripleQueso() {
        super(7,
	      "HamburguesaTripleQueso",
                "Hamburquesa con 3 tiras de Queso (Amarillo, blanco y mozarrella)",
                80,
                true,
                false);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Se prepara la carne");
    }

    @Override
    public void presentacionHamburguesa() {
        System.out.println("Se preparará tu hamburguesa: " +  super.nombreHamburguesa);
    }

    @Override
    public void ponerQueso(){
        if(super.tieneQueso)
            System.out.println("Se le ha puesto las 3 capas de queso");
        return;
    }

}