public interface ClienteInterface {
  
  public String getNombreUsuario();

  public String getContrasena();

  public String getNombre();

  public String getDireccion();

  public String getCuentaBancaria();

  public String getPaisOrigen();
  
  public void setBandeja(String mensaje);

  public double depositar(double dinero);

  public String getTelefono();
  
}