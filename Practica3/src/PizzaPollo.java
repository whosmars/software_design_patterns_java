/**
 * Clase hija de Pizzas. Instancia de manera particular a su clase padre
 * @author Compunenes
 * @version 1.0
 */
public class PizzaPollo extends Pizzas {

    public PizzaPollo(){
	    nombrePizza = "Pizza de Pollo";
    }

    
    /** 
     * @return String Tipo de Queso de la Pizza
     */
    public String TipoQueso() {
	    return "Queso Manchego";
    }

    
    /** 
     * @return String Tipo de Carne de la Pizza
     */
    public String TipoCarne() {
	    return "Pollo";
    }

    
    /** 
     * @return String Tipo de Masa de la Pizza
     */
    public String TipoMasa() {
	    return "Masa Delgada";
    }

    
    /** 
     * @return double Precio de la Pizza
     */
    public double precio(){
	    return 2.70;
    }
        
}
