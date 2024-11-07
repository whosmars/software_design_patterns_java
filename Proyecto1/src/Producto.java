/**
 * Clase Producto. Modela el comportamiento de cualquier subclase Producto
 */
public abstract class Producto {

  protected double precio = 0.00;
  
  protected double precioOriginal = 0.00;
  
	/** 
	 * @return String nombre del Producto
	 */
  public abstract String getNombreProducto();

  /** 
	 * @return double precio del producto
	 */
  public double getPrecio() {
    return this.precio;
  }

   /** 
	 * @return double precio sin descuentos del producto
	 */
  public double getPrecioOriginal() {
    return this.precioOriginal;
  }
  /** 
	 * Establece el precio del producto
	 */
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  /** 
	 * @return String codigo de barras del producto
	 */
  public abstract String getCodigoBarras();

  /** 
	 * @return String tipo de producto
	 */
  public abstract String getTipoProducto();

  /** 
	 * @return String presentacion del producto
	 */
  public String toString() {
    return this.getSeparador() + "\n" + this.getNombreProducto() + ".\n" + this.getPrecioOriginal()
        + ".\n" + this.getCodigoBarras() + ".\n" + this.getTipoProducto();
  }
  
  /** 
	 * @return String separador de productos en terminal
	 */
  private String getSeparador() {
    return "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n";
  }

}