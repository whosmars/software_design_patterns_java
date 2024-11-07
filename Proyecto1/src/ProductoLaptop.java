/**
 * Clase que hereda de Producto
 */
public class ProductoLaptop extends Producto {

  public ProductoLaptop() {
    super.precio = 12469.50;
    super.precioOriginal = super.precio;
  }

  /**
   * @return String nombre del producto
   */
  @Override
  public String getNombreProducto() {
    return "Laptop Huawei D15 Ryzen7 3500U";
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
    return "Electronica";
  }

}