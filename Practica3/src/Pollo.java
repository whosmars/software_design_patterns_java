/**
 * Clase Decoradora de Baguette
 * @author Compunenes
 * @version 1.0
 */
public class Pollo extends IngredienteDecorador {
    
    Baguettes baguettes;

    public Pollo(Baguettes baguettes) {
	    this.baguettes = baguettes;
    }

    
    /** 
     * @return String Descripcion del baguette concatenando "Pollo"
     */
    public String getDescripcion() {
	    return baguettes.getDescripcion() + ", Pollo";
    }

    
    /** 
     * @return double Costo del baguette + el costo del Pollo
     */
    public double costo() {
	    return .30 + baguettes.costo();
    }
    
}
