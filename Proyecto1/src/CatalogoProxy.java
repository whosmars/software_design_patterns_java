/**
 * Clase que simula el comportamiento de un CatalogoProxy
 */
public class CatalogoProxy implements CatalogoInterface {

  private Catalogo catalogoReal;

  public CatalogoProxy(Catalogo catalogo) {
    this.catalogoReal = catalogo;
  }

  /**
   * 
   * Metodo que muestra en terminal los productos del Catalogo
   */
  @Override
  public void mostrarProductos() {
    this.catalogoReal.mostrarProductos();
    return;
  }

  /**
   * @param producto producto que se agrega al cartio
   *                 Metodo que agrega un Producto al carrito de compras
   */
  @Override
  public void agregarProducto(Producto producto) {
    this.catalogoReal.agregarProducto(producto);
    return;
  }

  /**
   * @param producto Producto a remover
   *                 Metodo que remueve un Producto del carrito de compras
   */
  @Override
  public void removerProducto(Producto producto) {
    this.catalogoReal.removerProducto(producto);
  }

  /**
   * @param descuento Descuento a aplicar
   *                  Metodo que aplica el descuento a los productos del Catalogo
   */
  @Override
  public void aplicarDescuento(double descuento) {
    this.catalogoReal.aplicarDescuento(descuento);
  }

  /**
   * @return String nombres de los productos del Catalogo
   */
  public String enlistarNombresProductos() {
    return this.catalogoReal.enlistarNombresProductos();
  }

  /**
   * @return Producto del carrito de compras, si no existe regresa null
   */
  public Producto getProducto(Producto p) {
    return this.catalogoReal.getProducto(p);
  }

}