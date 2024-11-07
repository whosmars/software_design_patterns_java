/**
 * Clase que implementa TiendaVirtual
 */
public class TiendaVirtualEspanol implements TiendaVirtualInterface {
  private String idTienda;
  private String name;
  private String paisOrigen;

  public TiendaVirtualEspanol() {
  }
  
  /** 
	 * @return String saludo en el idioma correspodiente
	 */
  public String saludar() {
    return "Welcome";
  }

    /** 
	 * @return String despido en el idioma correspodiente
	 */
  public String despedirse() {
    return "Gracias por comprar vuelva pronto!";
  }
  
  /** 
	 * @return String despido en el idioma correspodiente
	 */
  public String logout(){
    return "*********Cerrando sesion*********\n";
  }

    /** 
	 * @return String acaba con la compra en el idioma correspodiente
	 */
  public String complementarCompra() {
    return "Orden completada:";
  }
  
  /** 
	 * @return String muestara el menu en el idioma correspodiente
	 */
  public String mostrarMenuOpciones() {
    return ("Escriba el numero de la opcion deseada:" + "\n" +
        "1) ver catalogo" + "\n" +
        "2) comprar" + "\n" +
        "Otra opcion para cerrar sesion.");
  }
  
  /** 
	 * @return String fecha de envio en el idioma correspodiente
   * @param fecha del envio
	 */
  public String fechaEnvio(String fecha) {
    return ("La posible fecha de envio es el: " + fecha);
  }
  
  /** 
	 * @return String pagar cuenta en el idioma correspodiente
   * @param digitosCuenta numero de la cuenta bancaria
	 */
  public String pagarCuenta(String digitosCuenta) {
    return ("Procederemos a pagar con la tarjeta terminacion " + digitosCuenta + "\nIngresa tun numero de cuenta:");
  }

  /** 
	 * @return String costo total en el idioma correspodiente
	 */
  public String costoTotal(double costoTotal) {
    return ("El costo total del carrito de compras es : " + costoTotal);
  }
  
  /** 
	 * @return String presenta los productos en el idioma correspodiente
	 */
  public String presentarProductos() {
    return "Los siguientes son los articulos";
  }

    /** 
	 * @return String muestra el catalogo en el idioma correspodiente
   * @param catalogo Catalogo a imprimir
	 */
  public String mostrarCatalogo(Catalogo catalogo) {
    CatalogoProxy proxy = new CatalogoProxy(catalogo);
    return ("Seleccione la opcion del producto para subir al carrito:" + proxy.enlistarNombresProductos());
  }
  
  /** 
	 * @return String idioma correspodiente
	 */
  public String getIdTienda() {
    return "Se ha cambiado el idioma a: Español Latam";
  }
  
  /** 
	 * @return String despido del programa en el idioma correspodiente
   * @param index indice de la instruccion
	 */
  public String salir(int index){
    return (index + ") " + "Proceder con el pago");
  }
  
  /** 
	 * @return String remover del carrito en el idioma correspodiente
   * @param index indice de la instruccion
	 */
  public String removerCarrito(int index){
    return (index + ") " + "Remover articulos del carrito");
  }
  
  /** 
	 * @return String datos correctos en el idioma correspodiente
	 */
  public String datosCorrectos() {
    return "Ingreso de datos positivo";
  }
  
  /** 
	 * @return String datos incorrectos en el idioma correspodiente
	 */
  public String datosIncorrectos(){
    return "Ingreso de datos negativo";
  }
  
  /** 
	 * @return String fondos insuficientes en el idioma correspodiente
	 */
  public String fondosInsuficientes() {
    return "Tus fondos son insuficientes";
  }
  
}  
