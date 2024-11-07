/**
 * Clase que hereda de Producto
 */
public class ProductoFreidora extends Producto {

  public ProductoFreidora() {
    super.precio = 1056.60;
    super.precioOriginal = super.precio;
  }

  /**
   * @return String nombre del producto
   */
  @Override
  public String getNombreProducto() {
    return "Freidora de Aire v2.3";
  }

  /**
   * @return String codigo de barras del producto
   */
  @Override
  public String getCodigoBarras() {
    return "| ||| | || |||||||| ||";
  }

  /**
   * @return String tipo de producto
   */
  @Override
  public String getTipoProducto() {
    return "Electrodomestico";
  }

}