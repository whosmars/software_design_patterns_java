/**
 * Clase Abstracta Pizzas. Contiene los comportamientos deseados de una pizza
 * @author Compunenes
 * @version 1.0
 */
public abstract class Pizzas {

    String nombrePizza = "Pizza desconocida";

    /** 
     * @return String Nombre de la pizza
     */
    public String getNombrePizza(){
	    return nombrePizza;
    }

    public abstract String TipoQueso();

    public abstract String TipoCarne();

    public abstract String TipoMasa();

    public abstract double precio();

}
