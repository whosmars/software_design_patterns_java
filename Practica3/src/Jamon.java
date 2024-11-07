/**
 * Clase Decoradora de Baguette
 * @author Compunenes
 * @version 1.0
 */
public class Jamon extends IngredienteDecorador {
    
    Baguettes baguettes;

    public Jamon(Baguettes baguettes) {
	    this.baguettes = baguettes;
    }

    
    /** 
     * @return String Descripcion del baguette concatenando "Jamon"
     */
    public String getDescripcion(){
	    return baguettes.getDescripcion() + ", Jamon";
    }

    
    /** 
     * @return double Costo del baguette + el costo del Jamon
     */
    public double costo(){
	    return .33 + baguettes.costo();
    }
    
}
