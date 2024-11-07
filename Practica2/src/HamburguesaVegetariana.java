/**
 * Clase que hereda de Hamburguesa. Termina de implementar Templeate asi como la iniciacion de sus atributos
 * @author Compunenes
 * @version 1.0
 */
public class HamburguesaVegetariana extends Hamburguesa{
    public HamburguesaVegetariana() {
        super(4,
	      "HamburguesaVegetariana",
                "Hamburquesa Vegetariana",
                130,
                false,
                true);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Se prepara la carne de soya");
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
