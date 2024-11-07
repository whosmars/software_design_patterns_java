/**
 * Clase Cliente. Contiene el comportamiento y las acciones de un cliente
 */
public class Cliente  implements ClienteInterface, Observador {

  public String nombre;
  public String nombreUsuario;
  public String contrasena;
  public String direccion;
  public String cuentaBancaria;
  public String paisOrigen;
  public String bandeja;
  public double fondosCuenta;
  public String telefono;
  public Server server;

  public Cliente(String nombre, String nombreUsuario, String contrasena, String direccion, String telefono, String cuentaBancaria,
      String paisOrigen, TiendaVirtualInterface tienda, double fondosCuenta, Server server) {
    this.nombre = nombre;
    this.nombreUsuario = nombreUsuario;
    this.contrasena = contrasena;
    this.direccion = direccion;
    this.telefono = telefono;
    this.cuentaBancaria = cuentaBancaria;
    this.paisOrigen = paisOrigen;
    this.bandeja = "";
    this.fondosCuenta = fondosCuenta;
    this.server = server;
  }
  
	/** 
	 * @return String nombre del cliente
	 */
  public String getNombre() {
    return this.nombre;
  }

  /** 
	 * @return String nombre de usuario del cliente
	 */
  public String getNombreUsuario() {
    return this.nombreUsuario;
  }

  /** 
	 * @return String contrasena del cliente
	 */
  public String getContrasena() {
    return this.contrasena;
  }

  /** 
	 * @return String direccion del cliente
	 */
  public String getDireccion() {
    return this.direccion;
  }

  /** 
	 * @return String cuenta bancaria del cliente
	 */
  public String getCuentaBancaria() {
    return this.cuentaBancaria;
  }

  /** 
	 * @return String pais de origen del cliente
	 */
  public String getPaisOrigen() {
    return this.paisOrigen;
  }

  /** 
	 * @param mensaje mensaje que se pondra en la bandeja del cliente
	 */
  public void setBandeja(String mensaje) {
    this.bandeja = bandeja + mensaje;
  }

  /** 
	 * @return double fondos de la cuenta
	 */
  public double getFondos(){
    return this.fondosCuenta;
  }

    /** 
	 * Ve los descuentos a los que el cliente puede acceder
	 */
  public void actualizar() {
     this.bandeja = "Se ha aplicado un descuento del " + ((1 - this.server.getDescuento())*100) + " por ciento a todos los productos de la tienda";
     this.verBandeja();
  }
  
    /** 
	 * Imprime los descuentos a los que el cliente puede acceder
	 */
  public void verBandeja(){
    System.out.println(this.bandeja); 
  }

    /** 
	 *Remueve al Cliente de la tienda
	 */
  public  void desuscribir(){
    server.remueveCliente(this.nombre);
  }
  
  /** 
	  * @return double el dinero que se agrego a la cuenta
    * @param dinero fondos de la cuenta que se agregaran
	  */
  public double depositar(double dinero){
    return this.fondosCuenta = fondosCuenta + dinero;
  }
  
  /** 
	 * @return String telefono del cliente
	 */
  public String getTelefono(){
    return this.telefono;
  }
  
}