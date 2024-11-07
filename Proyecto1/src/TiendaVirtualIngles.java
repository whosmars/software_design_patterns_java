/**
 * Clase que implementa TiendaVirtual
 */
public class TiendaVirtualIngles implements TiendaVirtualInterface {

  public TiendaVirtualIngles() {
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
    return "Have a nice day!";
  }

    /** 
	 * @return String despido en el idioma correspodiente
	 */
  public String logout() {
    return "*********Signing off*********\n";
  }

    /** 
	 * @return String acaba con la compra en el idioma correspodiente
	 */
  public String complementarCompra() {
    return "Order Completed:";
  }

    /** 
	 * @return String muestara el menu en el idioma correspodiente
	 */
  public String mostrarMenuOpciones() {
    return ("Choose an option:" + "\n" +
        "1) see catalog" + "\n" +
        "2) buy" + "\n" +
        "Other option to sign off.");
  }

    /** 
	 * @return String fecha de envio en el idioma correspodiente
   * @param fecha del envio
	 */
  public String fechaEnvio(String fecha) {
    return (" The possible delivery date is " + fecha);
  }

    /** 
	 * @return String pagar cuenta en el idioma correspodiente
   * @param digitosCuenta numero de la cuenta bancaria
	 */
  public String pagarCuenta(String digitosCuenta) {
    return ("We will proceed to pay with the termination " + digitosCuenta + "\nInsert your account number below:");
  }

  /** 
	 * @return String costo total en el idioma correspodiente
	 */
  public String costoTotal(double costoTotal) {
    return ("Total cost of your purchases is: " + costoTotal);
  }

    /** 
	 * @return String presenta los productos en el idioma correspodiente
	 */
  public String presentarProductos() {
    return "The following are the products";
  }

  /** 
	 * @return String muestra el catalogo en el idioma correspodiente
   * @param catalogo Catalogo a imprimir
	 */
  public String mostrarCatalogo(Catalogo catalogo) {
    CatalogoProxy proxy = new CatalogoProxy(catalogo);
    return ("Choose articles to buy:" + proxy.enlistarNombresProductos());
  }
  /** 
	 * @return String idioma correspodiente
	 */
  public String getIdTienda() {
    return "The language has been changed to: English";
  }
  
 /** 
	 * @return String despido del programa en el idioma correspodiente
   * @param index indice de la instruccion
	 */
  public String salir(int index) {
    return (index + ") " + "Proceed with the payment");
  }
  
  /** 
	 * @return String remover del carrito en el idioma correspodiente
   * @param index indice de la instruccion
	 */
  public String removerCarrito(int index) {
    return (index + ") " + "Remove items from shopping cart");
  }
  
 /** 
	 * @return String datos correctos en el idioma correspodiente
	 */
  public String datosCorrectos() {
    return "Your data is correct";
  }
  
  /** 
	 * @return String datos incorrectos en el idioma correspodiente
	 */
  public String datosIncorrectos() {
    return "Your data is incorrect";
  }

    /** 
	 * @return String fondos insuficientes en el idioma correspodiente
	 */
  public String fondosInsuficientes() {
    return "Your funds are insufficient";
  }

}