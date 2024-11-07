/**
 * Clase Sujeto. Modela el comportamiento de cualquier clase que la implemente. Pertence al patron Observer
 */
public interface Sujeto {
  
  /**
   * @param cliente cliente a agregar
   * Metodo que agrega un cliente al Server
   */
  public void agregaCliente(Cliente cliente);
  
  /**
   * @param cliente cliente a remover
   * Metodo que remueve un cliente del Server
   */
  public void remueveCliente(Cliente cliente);
  
  /**
   * Metodo que notifica a todos los clientes sobre las ofertas de la tienda
   */
  public void notificar();
  
}
