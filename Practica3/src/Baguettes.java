/**
 * Clase Abstracta Baguette. Contiene los comportamientos deseados de un baguette
 * @author Compunenes
 * @version 1.0
 */
public abstract class Baguettes {

    String descripcion = "Baguette desconocida";
    
    /** 
     * @return String Descripcion del Baguette
     */
    public String getDescripcion() {
	    return descripcion;
    }

    public abstract double costo();
}
