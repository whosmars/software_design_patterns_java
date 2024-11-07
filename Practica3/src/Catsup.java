/**
 * Clase Decoradora de Baguette
 * @author Compunenes
 * @version 1.0
 */
public class Catsup extends IngredienteDecorador {
    
    Baguettes baguettes;

    public Catsup(Baguettes baguettes) {
	this.baguettes = baguettes;
    }

    
    /** 
     * @return String Descripcion del baguete concatenando "Catsup"
     */
    public String getDescripcion() {
	return baguettes.getDescripcion() + ", Catsup";
    }

    
    /** 
     * @return double Costo del Baguette + el costo de la Catsup
     */
    public double costo() {
	return .05 + baguettes.costo();
    }
    
}
