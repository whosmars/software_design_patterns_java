/**
 * Clase que hereda de Hamburguesa. Termina de implementar Templeate asi como la iniciacion de sus atributos
 * @author Compunenes
 * @version 1.0
 */
public class HamburguesaPatria extends Hamburguesa{
    public HamburguesaPatria() {
        super(8,
	      "HamburguesaPatria",
                "Hamburquesa de estilo 100 por ciento mexicano",
                75,
                false,
                false);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Se prepara la carnilla de origen Oaxaquenio");
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