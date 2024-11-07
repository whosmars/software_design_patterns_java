/**
 * Clase hija de Pizzas. Instancia de manera particular a su clase padre
 * @author Compunenes
 * @version 1.0
 */
public class PizzaPepperoni extends Pizzas {

    public PizzaPepperoni(){
	    nombrePizza = "Pizza de Pepperoni";
    }

    
    /** 
     * @return String Tipo de Queso de la Pizza
     */
    public String TipoQueso() {
	    return "Queso Cheddar";
    }

    
    /** 
     * @return String Tipo de Carne de la Pizza
     */
    public String TipoCarne() {
	    return "Jamon";
    }

    
    /** 
     * @return String Tipo de Masa de la Pizza
     */
    public String TipoMasa() {
	    return "Masa Gruesa";
    }

    
    /** 
     * @return double Precio de la Pizza
     */
    public double precio(){
	    return 2.50;
    }
    
    
}
