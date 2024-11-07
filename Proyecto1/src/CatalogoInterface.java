public interface CatalogoInterface{
  
  public void  mostrarProductos();
  
  public void agregarProducto(Producto producto);

  public void removerProducto(Producto producto);

  public void aplicarDescuento(double descuento);

  public String enlistarNombresProductos();

  public Producto getProducto(Producto p);
  
}