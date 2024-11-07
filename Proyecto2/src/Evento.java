import java.util.LinkedList;

public class Evento implements Sujeto {

  private String idEvento;
  private String nombreEvento;
  private String descripcionEvento;
  public Recinto recinto;
  private LinkedList<Usuario> usuarios;
  private String notificaciones;
  private Estado estadoActual;
  private Estado iniciado;
  private Estado cancelado;
  private Estado enCurso;
  private Estado finalizado;

  public Evento(String idEvento, String nombreEvento, String descripcionEvento, Recinto recinto,
      LinkedList<Usuario> usuarios) {
    this.idEvento = idEvento;
    this.nombreEvento = nombreEvento;
    this.descripcionEvento = descripcionEvento;
    this.recinto = recinto;
    this.usuarios = usuarios;
    this.notificaciones = "";
    this.iniciado = new Iniciado(this);
    this.cancelado = new Cancelado(this);
    this.enCurso = new EnCurso(this);
    this.finalizado = new Finalizado(this);
    this.estadoActual = this.iniciado;
  }

  
  /** 
   * @return String notificaciones del usuario
   */
  public String getNotificaciones() {
    return this.notificaciones;
  }

  
  /** 
   * @param mensaje notificacion que se apilara a las notis que ha recibido el usuario
   */
  public void setNotificaciones(String mensaje) {
    this.notificaciones += mensaje;
    return;
  }

  
  /** 
   * @return String nombre del evento
   */
  public String getNombreEvento() {
    return nombreEvento;
  }

  
  /** 
   * @return String id del evento
   */
  public String getIdEvento() {
    return this.idEvento;
  }

  
  /** 
   * @param nombreEvento nombre que recibira el evento
   */
  public void setNombreEvento(String nombreEvento) {
    this.nombreEvento = nombreEvento;
  }

  
  /** 
   * @return String descripcion del evento
   */
  public String getDescripcionEvento() {
    return descripcionEvento;
  }

  
  /** 
   * @param descripcionEvento descripcion que tendra el evento
   */
  public void setDescripcionEvento(String descripcionEvento) {
    this.descripcionEvento = descripcionEvento;
  }

  
  /** 
   * @return Recinto recinto del evento
   */
  public Recinto getRecinto() {
    return recinto;
  }

  
  /** 
   * @param recinto recinto que sera asociado al Evento
   */
  public void setRecinto(Recinto recinto) {
    this.recinto = recinto;
  }

  
  /** 
   * @return LinkedList<Usuario> lista de usuarios en sistema
   */
  public LinkedList<Usuario> getUsuarios() {
    return usuarios;
  }

  
  /** 
   * @param usuarios lista de los futuros usuarios
   */
  public void setUsuarios(LinkedList<Usuario> usuarios) {
    this.usuarios = usuarios;
  }

  public void iniciado() {
    this.estadoActual.iniciado();
    return;
  }

  public void cancelado() {
    this.estadoActual.cancelado();
    return;
  }

  public void enCurso() {
    this.estadoActual.enCurso();
    return;
  }

  public void finalizado() {
    this.estadoActual.finalizado();
    return;
  }

  
  /** 
   * @param estadoNuevo nuevo Estado que tendra el sistema 
   */
  public void asignarNuevoEstado(Estado estadoNuevo) {
    this.estadoActual = estadoNuevo;
    return;
  }

  
  /** 
   * @return Estado iniciado
   */
  public Estado getIniciado() {
    return iniciado;
  }

  
  /** 
   * @return Estado cancelado
   */
  public Estado getCancelado() {
    return cancelado;
  }

  
  /** 
   * @return Estado en curso
   */
  public Estado getEnCurso() {
    return enCurso;
  }

  
  /** 
   * @return Estado finalizado
   */
  public Estado getFinalizado() {
    return finalizado;
  }

  
  /** 
   * @param usuario usuario a agregar
   * @return boolean si se logro agregar al usuario a sistema
   */
  @Override
  public boolean agregaUsuario(Usuario usuario) {
    return this.usuarios.add(usuario);
  }

  
  /** 
   * @param usuario usuario a remover
   * @return boolean si se logro remover al usuario de sistema
   */
  @Override
  public boolean remueveUsuario(Usuario usuario) {
    return this.usuarios.remove(usuario);
  }

  @Override
  public void notificarUsuarios() {
    for (Usuario usuario : this.usuarios)
      usuario.actualizar();
  }

  
  /** 
   * @return String forma acomodada de representar al objeto en Strings
   */
  @Override
  public String toString() {
    return "ID evento:"+ this.idEvento + "\n"
           +"nombreEvento: '" + nombreEvento + '\n' +
           "descripcionEvento: '" + descripcionEvento + '\n' +
           "recinto:" + recinto + "\n";
  }

  
  /** 
   * @param i indice de iteracion
   * @return String forma acomodada de representar al objeto en Strings
   */
  public String toStringIndex(int i) {

    return i + ") " + "Evento{" +
        "nombreEvento='" + nombreEvento + '\'' +
        ", descripcionEvento='" + descripcionEvento + '\'' +
        ", recinto=" + recinto +
        '}';
  }

}
