/**
 * Clase hija de Pizzas. Instancia de manera particular a su clase padre
 * @author Compunenes
 * @version 1.0
 */
public class PizzaHawaiana extends Pizzas {

    public PizzaHawaiana(){
	    nombrePizza = "Pizza Hawaiana";
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
	    return "Jamon";
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
	    return 2.60;
    }
    
    
}
