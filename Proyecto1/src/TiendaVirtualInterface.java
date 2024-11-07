/**
 * Clase TiendaVirtual que condiciona el comportamiento de cualquier clase que
 * la implemente. Regresa Strings con frases en diferentes idiomas. Parte del
 * patron Strategy
 */
public interface TiendaVirtualInterface {

  /**
   * @return String saludo en el idioma correspodiente
   */
  public String saludar();

  /**
   * @return String despido en el idioma correspodiente
   */
  public String despedirse();

  /**
   * @return String despido en el idioma correspodiente
   */
  public String logout();

  /**
   * @return String acaba con la compra en el idioma correspodiente
   */
  public String complementarCompra();

  /**
   * @return String muestara el menu en el idioma correspodiente
   */
  public String mostrarMenuOpciones();

  /**
   * @return String fecha de envio en el idioma correspodiente
   * @param fecha del envio
   */
  public String fechaEnvio(String fecha);

  /**
   * @return String pagar cuenta en el idioma correspodiente
   * @param digitosCuenta numero de la cuenta bancaria
   */
  public String pagarCuenta(String digitosCuenta);

  /**
   * @return String costo total en el idioma correspodiente
   */
  public String costoTotal(double costoTotal);

  /**
   * @return String presenta los productos en el idioma correspodiente
   */
  public String presentarProductos();

  /**
   * @return String muestra el catalogo en el idioma correspodiente
   * @param catalogo Catalogo a imprimir
   */
  public String mostrarCatalogo(Catalogo catalogo);

  /**
   * @return String idioma correspodiente
   */
  public String getIdTienda();

  /**
   * @return String despido del programa en el idioma correspodiente
   * @param index indice de la instruccion
   */
  public String salir(int index);

  /**
   * @return String remover del carrito en el idioma correspodiente
   * @param index indice de la instruccion
   */
  public String removerCarrito(int index);

  /**
   * @return String datos correctos en el idioma correspodiente
   */
  public String datosCorrectos();

  /**
   * @return String datos incorrectos en el idioma correspodiente
   */
  public String datosIncorrectos();

  /**
   * @return String fondos insuficientes
   */
  public String fondosInsuficientes();
  
}