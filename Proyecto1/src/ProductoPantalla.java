/**
 * Clase que hereda de Producto
 */
public class ProductoPantalla extends Producto {

  public ProductoPantalla() {
    super.precio = 5199.99;
    super.precioOriginal = super.precio;
  }

  /**
   * @return String nombre del producto
   */
  @Override
  public String getNombreProducto() {
    return "Pantalla 55 Samsung 4k";
  }

  /**
   * @return String codigo de barras del producto
   */
  @Override
  public String getCodigoBarras() {
    return "||| || ||| || ||| ||";
  }

  /**
   * @return String tipo de producto
   */
  @Override
  public String getTipoProducto() {
    return "Electronica";
  }

}