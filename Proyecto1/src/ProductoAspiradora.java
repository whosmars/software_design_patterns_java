/**
 * Clase que hereda de Producto
 */
public class ProductoAspiradora extends Producto {

  public ProductoAspiradora() {
    super.precio = 2111.50;
    super.precioOriginal = super.precio;
  }

  /*
   * @return String nombre del producto
   */
  @Override
  public String getNombreProducto() {
    return "Aspiradora Koblenz 3 velocidad multiusos";
  }

  /**
   * @return String codigo de barras del producto
   */
  @Override
  public String getCodigoBarras() {
    return "||| |||| | || ||||| ||| |";
  }

  /**
   * @return String tipo de producto
   */
  @Override
  public String getTipoProducto() {
    return "Electrodomestico";
  }

}