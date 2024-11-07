/**
 * Clase Decoradora de Baguette
 * @author Compunenes
 * @version 1.0
 */
public class Mostaza extends IngredienteDecorador {
    
    Baguettes baguettes;

    public Mostaza(Baguettes baguettes) {
	    this.baguettes = baguettes;
    }

    
    /** 
     * @return String Descripcion del baguette concatenando "Mostaza"
     */
    public String getDescripcion() {
	    return baguettes.getDescripcion() + ", Mostaza";
    }

    
    /** 
     * @return double Costo del baguette + el cosoto de la Mostaza
     */
    public double costo() {
	    return .07 + baguettes.costo();
    }
    
}
