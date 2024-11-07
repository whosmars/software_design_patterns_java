/**
 * Clase que hereda de Producto
 */
public class ProductoHuevo extends Producto {

  public ProductoHuevo(){
    super.precio = 38.99;
    super.precioOriginal = super.precio;
  }

    /** 
	 * @return String nombre del producto
	 */
  @Override
  public String getNombreProducto() {
    return "Carton de Huevo San Juan";
  }

  /** 
	 * @return String codigo de barras del producto
	 */
  @Override
  public String getCodigoBarras() {
    return "|| |||||| | ||| |||";
  }

  /** 
	 * @return String tipo de producto
	 */
  @Override
  public String getTipoProducto() {
    return "Despensa";
  }

}