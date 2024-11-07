/**
 * Clase que hereda de Producto
 */
public class ProductoLlanta extends Producto{

  public ProductoLlanta(){
    super.precio = 950.36;
    super.precioOriginal = super.precio;
  }

    /** 
	 * @return String nombre del producto
	 */
  @Override
  public String getNombreProducto(){
    return "Llanta de Automovil";
  }
  
    /** 
	 * @return String codigo de barras del producto
	 */
  @Override
  public String getCodigoBarras(){
    return "|||| ||||| |||||| |||";
  }
  
    /** 
	 * @return String tipo de producto
	 */
  @Override
  public String getTipoProducto(){
    return "Refacciones";
  }
  
}