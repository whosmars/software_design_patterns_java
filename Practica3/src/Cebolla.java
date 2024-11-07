/**
 * Clase Decoradora de Baguette
 * @author Compunenes
 * @version 1.0
 */
public class Cebolla extends IngredienteDecorador {
    
    Baguettes baguettes;

    public Cebolla(Baguettes baguettes) {
	    this.baguettes = baguettes;
    }

    
    /** 
     * @return String Descripcion del baguete concatenando "Cebolla"
     */
    public String getDescripcion() {
	    return baguettes.getDescripcion() + ", Cebolla";
    }

    
    /** 
     * @return double Costo del baguette + el costo de la Cebolla
     */
    public double costo() {
	    return .10 + baguettes.costo();
    }
    
}
