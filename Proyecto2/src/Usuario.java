import java.util.LinkedList;
import java.util.ArrayList;

public class Usuario implements Observador {

  private String nombreUsuario;
  private String bandeja;
  private String email;
  private String contrasena;
  private String numeroCuenta;
  private String facultad;
  private boolean tipoUsuario;
  public ArrayList<Evento> eventos;
  public ArrayList<Evento> misEventos;

  public Usuario(Builder builder) {

    this.nombreUsuario = builder.nombreUsuario;
    this.email = builder.email;
    this.bandeja = builder.bandeja;
    this.contrasena = builder.contrasena;
    this.numeroCuenta = builder.numeroCuenta;
    this.facultad = builder.facultad;
    this.eventos = builder.eventos;
    this.misEventos = builder.misEventos;
    this.tipoUsuario = builder.tipoUsuario;

  }

  
  /** 
   * @return String nombre del usuario
   */
  public String getNombreUsuario() {
    return nombreUsuario;
  }

  
  /** 
   * @param nombreUsuario nombre que tendra el usuario
   */
  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  
  /** 
   * @return String bandeja del usuario en sistema
   */
  public String getBandeja() {
    return bandeja;
  }

  
  /** 
   * @param bandeja bandeja que tendra el usuario en sistena
   */
  public void setBandeja(String bandeja) {
    this.bandeja = bandeja;
  }

  
  /** 
   * @return String email del usuario
   */
  public String getEmail() {
    return email;
  }

  
  /** 
   * @param email email que tendra como registro el usuario
   */
  public void setEmail(String email) {
    this.email = email;
  }

  
  /** 
   * @return String contrasena del usuario
   */
  public String getContrasena() {
    return contrasena;
  }

  
  /** 
   * @param contrasena contrasena que se asociara a un usuario
   */
  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  
  /** 
   * @return String numero de cuenta
   */
  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  
  /** 
   * @param numeroCuenta nombre de cuenta que tendra el usuario
   */
  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  
  /** 
   * @return String facultad del usuario
   */
  public String getFacultad() {
    return facultad;
  }

  
  /** 
   * @return boolean tipo de usuario
   */
  public boolean getTipoUsuario() {
    return this.tipoUsuario;
  }

  
  /** 
   * @param facultad facultad que tendra el usuario
   */
  public void setFacultad(String facultad) {
    this.facultad = facultad;
  }

  
  /** 
   * @return ArrayList<Evento> lista de eventos posibles
   */
  public ArrayList<Evento> getEventos() {
    return eventos;
  }

  
  /** 
   * @param e Evento al que se asistira
   * @return boolean es posible inscribir un evento
   */
  public boolean asistirEvento(Evento e){

    this.eventos.add(e);
    return true;
  }

  
  /** 
   * @param eventos eventos que tendra el usuario como disponibles
   */
  public void setEventos(ArrayList<Evento> eventos) {
    this.eventos = eventos;
  }

  
  /** 
   * @return ArrayList<Evento> eventos a los que asistiran
   */
  public ArrayList<Evento> getMisEventos() {
    return misEventos;
  }

  
  /** 
   * @param misEventos eventos a los que asistira al usuario
   */
  public void setMisEventos(ArrayList<Evento> misEventos) {
    this.misEventos = misEventos;
  }

  @Override
  public void actualizar() {
    for (Evento evento : this.misEventos)
      this.setBandeja(evento.getNotificaciones());
  }

}
