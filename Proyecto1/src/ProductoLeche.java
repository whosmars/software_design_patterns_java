/**
 * Clase que hereda de Producto
 */
public class ProductoLeche extends Producto {

  public ProductoLeche() {
    super.precio = 21.37;
    super.precioOriginal = super.precio;
  }
  /** 
	 * @return String nombre del producto
	 */
  @Override
  public String getNombreProducto() {
    return "Leche";
  }
  
  /** 
	 * @return String codigo de barras del producto
	 */
  @Override
  public String getCodigoBarras() {
    return "|| || ||||| ||| |||";
  }
  
  /** 
	 * @return String tipo de producto
	 */
  @Override
  public String getTipoProducto() {
    return "Despensa";
  }

}