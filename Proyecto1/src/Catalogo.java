import java.util.LinkedList;

/**
 * Clase que simula el comportamiento de un Catalogo de Productos
 */
public class Catalogo implements CatalogoInterface {

  private LinkedList<Producto> productos;

  public Catalogo() {
    productos = new LinkedList<Producto>();
  }

  /**
   * 
   * Metodo que muestra en terminal los productos del Catalogo
   */
  public void mostrarProductos() {
    for (Producto producto : productos) {
      System.out.print(this.getLinea());
      System.out.println("\n" + producto.toString());
    }
  }

  /**
   * @param descuento Descuento a aplicar
   *                  Metodo que aplica el descuento a los productos del Catalogo
   */
  public void aplicarDescuento(double descuento) {
    for (Producto p : this.productos)
      p.setPrecio(descuento * p.getPrecioOriginal());
  }

  /**
   * @return String nombres de los productos del Catalogo
   */
  public String enlistarNombresProductos() {
    String nombresProductos = "\n";
    int posicion = 1;
    for (Producto p : this.productos) {
      nombresProductos += (posicion + ") " + p.getNombreProducto() + "\n");
      posicion++;
    }
    return nombresProductos;
  }

  /**
   * @return String nombres linea decoradora
   */
  private String getLinea() {
    return "\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n";
  }

  /**
   * @param producto producto que se agrega al cartio
   *                 Metodo que agrega un Producto al carrito de compras
   */
  public void agregarProducto(Producto producto) {
    productos.add(producto);
    return;
  }

  /**
   * @param producto Producto a remover
   *                 Metodo que remueve un Producto del carrito de compras
   */
  public void removerProducto(Producto producto) {
    productos.remove(producto);
    return;
  }

  /**
   * @return Producto del carrito de compras, si no existe regresa null
   */
  public Producto getProducto(Producto producto) {
    for (Producto p : this.productos) {
      if (p.getCodigoBarras().equalsIgnoreCase(producto.getCodigoBarras()))
        return p;
    }
    return null;
  }

}
