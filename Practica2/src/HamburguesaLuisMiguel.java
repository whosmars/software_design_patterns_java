/**
 * Clase que hereda de Hamburguesa. Termina de implementar Templeate asi como la iniciacion de sus atributos
 * @author Compunenes
 * @version 1.0
 */
public class HamburguesaLuisMiguel extends Hamburguesa{
    public HamburguesaLuisMiguel() {
        super(9,
	      "HamburguesaLuisMiguel",
                "Hamburquesa de estilo paps, rey",
                350,
                true,
                false);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Se esta preparando tu carne principe");
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