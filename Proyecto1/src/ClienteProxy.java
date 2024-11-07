import java.io.Serializable;
/**
 * Clase ClienteProxy. Contiene el comportamiento y las acciones de un clienteproxy
 */
public class ClienteProxy implements ClienteInterface {

  private Cliente clienteReal;
  private double fondosCuenta;

  public ClienteProxy(Cliente cliente) {
    this.clienteReal = cliente;
    this.fondosCuenta = cliente.getFondos();
  }
  
  /** 
	 * @return String nombre de usuario del cliente
	 */
  public String getNombreUsuario() {
    return this.clienteReal.getNombreUsuario();
  }

    /** 
	 * @return String contrasena del cliente
	 */
  public String getContrasena() {
    return this.clienteReal.getContrasena();
  }
  
	/** 
	 * @return String nombre del cliente
	 */
  public String getNombre() {
    return this.clienteReal.getNombre();
  }
  
  /** 
	 * @return String direccion del cliente
	 */
  public String getDireccion() {
    return this.clienteReal.getDireccion();
  }
  
  /** 
	 * @return String cuenta bancaria del cliente
	 */
  public String getCuentaBancaria() {
    return this.clienteReal.getCuentaBancaria();
  }
  
  /** 
	 * @return String pais de origen del cliente
	 */
  public String getPaisOrigen() {
    return this.clienteReal.getPaisOrigen();
  }
  
  /** 
	 * @param mensaje mensaje que se pondra en la bandeja del cliente
	 */
  public void setBandeja(String mensaje){
    this.clienteReal.setBandeja(mensaje);
  }
  
  /** 
	  * @return double el dinero que se agrego a la cuenta
    * @param dinero fondos de la cuenta que se agregaran
	  */
  public double depositar(double dinero){
    return this.clienteReal.depositar(dinero);
  }
  
  /** 
	 * @return double fondos de la cuenta
	 */
  public double getFondos(){
    return this.clienteReal.getFondos();
  }
  
  /** 
	 * @return String telefono del cliente
	 */
  public String getTelefono(){
    return this.clienteReal.getTelefono();
  }
  /** 
	 * @return boolean igualdad de las cuentas
   *@param cuentaBancaria numero de cuenta bancaria
	 */
  public boolean compararCuentas(String cuentaBancaria){
    if(this.clienteReal.getCuentaBancaria().equals(cuentaBancaria)){
      return true;
    }
    return false;
  }

}