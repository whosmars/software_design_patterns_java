/**
 * Clase que implementa TiendaVirtual
 */
public class TiendaVirtualCastellano implements TiendaVirtualInterface {

  public TiendaVirtualCastellano() {
  }
  
  /** 
	 * @return String saludo en el idioma correspodiente
	 */
  public String saludar() {
    return "HOLA TIO";
  }

   /** 
	 * @return String despido en el idioma correspodiente
	 */
  public String despedirse() {
    return "Que tengas un buen dia!";
  }

  /** 
	 * @return String despido en el idioma correspodiente
	 */
  public String logout() {
    return "*********Saliendo de la sesion*********\n";
  }

    /** 
	 * @return String acaba con la compra en el idioma correspodiente
	 */
  public String complementarCompra() {
    return "FINALIZANDO PEDIDO";
  }

  /** 
	 * @return String muestara el menu en el idioma correspodiente
	 */
  public String mostrarMenuOpciones() {
    return ("Seleccione la opcion deseada:" + "\n" +
        "1) visualizar catalogo" + "\n" +
        "2) comprar articulos" + "\n" +
        "Cualquier otra para cerrar la sesion.");
  }

  /** 
	 * @return String fecha de envio en el idioma correspodiente
   * @param fecha del envio
	 */
  public String fechaEnvio(String fecha) {
    return ("La fecha de envio posiblemente sera el " + fecha);
  }

    /** 
	 * @return String pagar cuenta en el idioma correspodiente
   * @param digitosCuenta numero de la cuenta bancaria
	 */
  public String pagarCuenta(String digitosCuenta) {
    return ("Procederemos a realizar el pago con la tarjeta " + digitosCuenta + "\nEscribe abajo los digitos de tu numero de cuenta:");
  }

    /** 
	 * @return String costo total en el idioma correspodiente
	 */
  public String costoTotal(double costoTotal) {
    return ("El costo total de tus compras es: " + costoTotal);
  }

    /** 
	 * @return String presenta los productos en el idioma correspodiente
	 */
  public String presentarProductos() {
    return "A continuacion presentamos los articulos en existencia";
  }

  /** 
	 * @return String muestra el catalogo en el idioma correspodiente
   * @param catalogo Catalogo a imprimir
	 */
  public String mostrarCatalogo(Catalogo catalogo) {
    CatalogoProxy proxy = new CatalogoProxy(catalogo);
    return ("Escriba el numero del articulo que quiere agregar al carrito:" + proxy.enlistarNombresProductos());
  }

    /** 
	 * @return String idioma correspodiente
	 */
  public String getIdTienda() {
    return "Se ha cambiado el idioma a: Espanol Castellano";
  }

   /** 
	 * @return String despido del programa en el idioma correspodiente
   * @param index indice de la instruccion
	 */
  public String salir(int index) {
    return (index + ") " + "Proceder con el pago");
  }
  
  /** 
	 * @return String remover del carrito en el idioma correspodiente
   * @param index indice de la instruccion
	 */
  public String removerCarrito(int index) {
    return (index + ") " + "Vaciar carrito de compras");
  }

    /** 
	 * @return String datos correctos en el idioma correspodiente
	 */
  public String datosCorrectos() {
    return "Tus datos son correctos";
  }

    /** 
	 * @return String datos incorrectos en el idioma correspodiente
	 */
  public String datosIncorrectos(){
    return "Tus datos son incorrectos";
  }
  
   /** 
	 * @return String fondos insuficientes en el idioma correspodiente
	 */
  public String fondosInsuficientes() {
    return "Tus fondos no son los suficientes";
  }
  
}