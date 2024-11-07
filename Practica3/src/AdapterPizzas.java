/**
 * Clase que implementa el Patron de Disenio Adapter. Define todas las "acciones" que deberia realizar. Sirve de Intermediario entre Pizzas y Baguettes
 * @author Compunenes
 * @version 1.0
 */
public class AdapterPizzas extends Baguettes {
    
    Pizzas pizzas;
    
    public AdapterPizzas(Pizzas pizzas){
	    super();
	    this.pizzas = pizzas;
	    descripcion = pizzas.getNombrePizza() + ". \nIngredientes pizza: " + pizzas.TipoQueso() + ", " + pizzas.TipoCarne() + ", " + pizzas.TipoMasa();
    }

    
    /** 
     * @return double costo de la pizza
     */
    public double costo(){
	    return pizzas.precio();
    } 
    
}
