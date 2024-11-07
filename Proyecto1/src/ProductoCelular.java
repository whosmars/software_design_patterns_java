/**
 * Clase que hereda de Producto
 */
public class ProductoCelular extends Producto {

  public ProductoCelular() {
    super.precio = 7112.50;
    super.precioOriginal = super.precio;
  }

  /**
   * @return String nombre del producto
   */
  @Override
  public String getNombreProducto() {
    return "Celular Xiaomi Redmi Note 11 5G PRO";
  }

  /**
   * @return String codigo de barras del producto
   */
  public String getCodigoBarras() {
    return "| || ||| |||| ||||||";
  }

  /**
   * @return String tipo de producto
   */
  @Override
  public String getTipoProducto() {
    return "Electronica";
  }

}
