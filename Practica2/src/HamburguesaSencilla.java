/**
 * Clase que hereda de Hamburguesa. Termina de implementar Templeate asi como la iniciacion de sus atributos
 * @author Compunenes
 * @version 1.0
 */
public class HamburguesaSencilla extends Hamburguesa{

    public HamburguesaSencilla() {
        super(1,
            "Sencilla",
            "Hamburquesa sencilla",
            50,
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
            System.out.println("Se le ha puesto queso");
        return;
    }
    
}
