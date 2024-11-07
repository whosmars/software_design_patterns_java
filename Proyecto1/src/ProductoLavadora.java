/**
 * Clase que hereda de Producto
 */
public class ProductoLavadora extends Producto{

  public ProductoLavadora(){
    super.precio = 3167.00;
    super.precioOriginal = super.precio;
  }

  /** 
	 * @return String nombre del producto
	 */
  @Override
  public String getNombreProducto(){
    return "Lavadora de Ropa";
  }

  /** 
	 * @return String codigo de barras del producto
	 */
  @Override
  public String getCodigoBarras(){
    return "| | | | ||||| |||||";
  }

    /** 
	 * @return String tipo de producto
	 */
  @Override
  public String getTipoProducto(){
    return "Electrodomestico";
  }
  
}