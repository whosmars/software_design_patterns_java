/**
 * Clase Decoradora de Baguette
 * @author Compunenes
 * @version 1.0
 */
public class Pepperoni extends IngredienteDecorador {
    
    Baguettes baguettes;

    public Pepperoni(Baguettes baguettes) {
	    this.baguettes = baguettes;
    }

    
    /** 
     * @return String Descripcion del baguette concatenando "Pepperoni"
     */
    public String getDescripcion() {
	    return baguettes.getDescripcion() + ", Pepperoni";
    }

    
    /** 
     * @return double Costo del bagutte + el costo del Pepperoni
     */
    public double costo() {
	    return .27 + baguettes.costo();
    }
    
}
