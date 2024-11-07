/**
 * Clase que hereda de Producto
 */
public class ProductoEstufa extends Producto {

  public ProductoEstufa() {
    super.precio = 2993.20;
    super.precioOriginal = super.precio;
  }

  /**
   * @return String nombre del producto
   */
  @Override
  public String getNombreProducto() {
    return "Estufa Whirpool 2,0";
  }

  /**
   * @return String codigo de barras del producto
   */
  @Override
  public String getCodigoBarras() {
    return "|| || || || ||| |||||";
  }

  /**
   * @return String tipo de producto
   */
  @Override
  public String getTipoProducto() {
    return "Electrodomestico";
  }

}