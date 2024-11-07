/**
 * Clase Decoradora de Baguette
 * @author Compunenes
 * @version 1.0
 */
public class Jitomate extends IngredienteDecorador {
    
    Baguettes baguettes;

    public Jitomate(Baguettes baguettes) {
	    this.baguettes = baguettes;
    }

    
    /** 
     * @return String Descripcion del baguette concatenando "Jitomate"
     */
    public String getDescripcion() {
	    return baguettes.getDescripcion() + ", Jitomate";
    }

    
    /** 
     * @return double Costo del baguette + el precio del Jitomate
     */
    public double costo() {
	    return .12 + baguettes.costo();
    }
    
}
