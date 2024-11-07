import java.util.LinkedList;

/**
 * Clase que simula el comportamiento de un Carrito de compras
 */
public class CarritoDeCompras implements CatalogoInterface {

  private LinkedList<Producto> carrito;

  public CarritoDeCompras() {
    this.carrito = new LinkedList<Producto>();
  }

  /**
   * @param producto producto que se agrega al cartio
   *                 Metodo que agrega un Producto al carrito de compras
   */
  @Override
  public void agregarProducto(Producto producto) {
    this.carrito.add(producto);
  }

  /**
   * @param producto Producto a remover
   *                 Metodo que remueve un Producto del carrito de compras
   */
  @Override
  public void removerProducto(Producto producto) {
    this.carrito.remove(producto);
  }

  /**
   * Metodo que vacia el carrito de compras
   */
  public void removerProductos() {
    for (Producto p : this.carrito) {
      this.carrito.remove(p);
    }
  }

  /**
   * @return double costo total de los productos de carrito
   */
  public double costoTotalCarrito() {
    double costoTotal = 0.00;
    for (Producto producto : carrito)
      costoTotal += producto.getPrecio();
    return costoTotal;
  }

  /**
   * Metodo que muestra en terminal los productos del Carrito
   */
  @Override
  public void mostrarProductos() {
    for (Producto producto : carrito) {
      System.out.print(this.getLinea());
      System.out.println("\n" + producto.toString());
    }
  }

  /**
   * @param descuento Descuento a aplicar
   *                  Metodo que aplica el descuento a los productos del carrito
   */
  public void aplicarDescuento(double descuento) {
    for (Producto p : this.carrito)
      p.setPrecio(descuento);
  }

  /**
   * @return String nombres de los productos del carrito
   */
  public String enlistarNombresProductos() {
    String nombresProductos = "\n";
    int posicion = 1;
    for (Producto p : this.carrito) {
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
   * @return Producto del carrito de compras, si no existe regresa null
   */
  public Producto getProducto(Producto producto) {
    for (Producto p : this.carrito) {
      if (p.getCodigoBarras().equalsIgnoreCase(producto.getCodigoBarras()))
        return p;
    }
    return null;
  }

}