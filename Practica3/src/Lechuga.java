/**
 * Clase Decoradora de Baguette
 * @author Compunenes
 * @version 1.0
 */
public class Lechuga extends IngredienteDecorador {
    
    Baguettes baguettes;

    public Lechuga(Baguettes baguettes) {
	    this.baguettes = baguettes;
    }

    
    /** 
     * @return String Descripcion del baguette concatenando "Lechuga"
     */
    public String getDescripcion() {
	    return baguettes.getDescripcion() + ", Lechuga";
    }

    
    /** 
     * @return double Costo del baguette + el costo de la Lechuga
     */
    public double costo() {
	    return .15 + baguettes.costo();
    }
    
}
