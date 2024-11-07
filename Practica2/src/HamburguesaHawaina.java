/**
 * Clase que hereda de Hamburguesa. Termina de implementar Templeate asi como la iniciacion de sus atributos
 * @author Compunenes
 * @version 1.0
 */
public class HamburguesaHawaina extends Hamburguesa{
    public HamburguesaHawaina() {
        super(3,
                "HamburguesaHawaina",
                "Hamburquesa Hawaina",
                100,
                true,
                false);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Se preparan la carne con pina");
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
