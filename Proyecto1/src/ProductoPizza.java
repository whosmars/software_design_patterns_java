/**
 * Clase que hereda de Producto
 */
public class ProductoPizza extends Producto {

  public ProductoPizza() {
    super.precio = 235.01;
    super.precioOriginal = super.precio;
  }

    /** 
	 * @return String nombre del producto
	 */
  @Override
  public String getNombreProducto() {
    return "Pizza Cuatro Quesos Orilla Rellena";
  }

  /** 
	 * @return String codigo de barras del producto
	 */
  @Override
  public String getCodigoBarras() {
    return "||| | | | | ||||";
  }

    /** 
	 * @return String tipo de producto
	 */
  @Override
  public String getTipoProducto() {
    return "Despensa";
  }

}