/**
 * Clase Decoradora de Baguette
 * @author Compunenes
 * @version 1.0
 */
public class Mayonesa extends IngredienteDecorador {
    
    Baguettes baguettes;

    public Mayonesa(Baguettes baguettes) {
	    this.baguettes = baguettes;
    }

    
    /** 
     * @return String Descripcion del baguette concatenando "Mayonesa"
     */
    public String getDescripcion() {
	    return baguettes.getDescripcion() + ", Mayonesa";
    }

    
    /** 
     * @return double Costo del baguette + el costo de la Mayonesa
     */
    public double costo() {
	    return .06 + baguettes.costo();
    }
    
}
