import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Controlador {

  private ArrayList<Evento> eventos;
  private EventoIterador eventoIterador;
  private LinkedList<Usuario> usuarios;
  private UsuarioIterador usuarioIterador;
  private Recinto[] recintos;
  private RecintoMenuIterador recintoIterador;
  private Recursos recursos;

  public Vista vista;

  public Controlador(Vista vista) {
    /* CREAMOS LOS RECURSOS QUE VAMOS A OCUPAR */
    this.recursos = new Recursos();
    /* NOS TRAEMOS LOS USAURIOS, EVENTOS Y RECINTOS DE NUESTROS RECURSOS */
    this.eventos = recursos.eventos;
    this.usuarios = recursos.usuarios;
    this.recintos = recursos.recintos;
    this.vista = vista;
  }
  
  /** 
   * @param numero_cuenta numero de cuenta del usuario a logear
   * @param contrasena contrasena del usuario a logear
   */
  public void login(String numero_cuenta, String contrasena) {
    Usuario usuario = this.getUsuario(numero_cuenta);
    if (usuario == null) {
      // En este caso se equivoco el usuario
      vista.showMensaje("Ocurrio un error ingresando el número de cuenta, intenta de nuevo");
      vista.login();
    } else {
      /* EN ESTE CASO SI ENCONTRAMOS EL USUARIO Y CHECAMOS SU CONTRASEÑA */
      if (usuario.getContrasena().equals(contrasena)) {
        if (usuario.getTipoUsuario()) {
          // SI ES UN USUARIO HOST LO MANDAMOS AL MENU DE HOST
          mostrarMenuHost(usuario);
        } else {
          // SI ES UN USUARIO NORMAL LO MANDAMOS A LA PANTALLA DE USUARIO NORMAL
          muestraMenu(usuario);
        }
      } else {
        // SI SU CONTRASEÑA ES ERRONEA LO MANDAMOS A LA PANTALLA DE LOGIN
        vista.showMensaje("tu contraseña es erronea,logeate de nuevo ");
        vista.login();
      }
    }
  }

  
  /** 
   * @param usuario mostrara el Menu en referencia al este usuario
   */
  public void mostrarMenuHost(Usuario usuario) {
    vista.mensajeBienvenida(usuario.getNombreUsuario());
    vista.showMensaje("A continuacion se muesta el menu, ingrese el numero correspondiente a la opcion: ");
    vista.showMensaje("1)Ver mis eveventos");
    vista.showMensaje("2)Ver todos los eventos");
    vista.showMensaje("3) Suscribir a un evento");
    vista.showMensaje("4) Crear  un evento");
    vista.showMensaje("5) Cancelar  evento");
    vista.showMensaje("6) Salir ");

    int opcion = vista.leerEntradaEntero();
    switch (opcion) {
      case 1:
        verMisEventos(usuario);
        break;
      case 2:
        verTodosLosEventos(usuario);
        break;
      case 3:
        sucribirEvento(usuario);
        break;

      case 4:
        crearEvento(usuario);
        break;
      case 5:
        cancelarEvento(usuario);
        break;

      case 6:
        vista.logOut();
        break;
    }

  }

  
  /** 
   * @param usuario mostrara el Menu en referencia al este usuario
   */
  private void muestraMenu(Usuario usuario) {
    vista.mensajeBienvenida(usuario.getNombreUsuario());
    vista.showMensaje("Ingrese el numero correspondiente a la opcion: ");
    vista.showMensaje("1)Ver mis eventos");
    vista.showMensaje("2)Ver todos los eventos");
    vista.showMensaje("3) Suscribir a un evento");
    vista.showMensaje("4) Salir ");
    int opcion = vista.leerEntradaEntero();
    switch (opcion) {
      case 1:
        verMisEventos(usuario);
        break;
      case 2:
        verTodosLosEventos(usuario);
        break;
      case 3:
        sucribirEvento(usuario);
        break;
      case 4:
        vista.logOut();
        break;

    }

  }

  
  /** 
   * @param user mostrara un menu interactivo en funcion del usuario
   */
  private void checkOption(Usuario user) {
    this.vista.showMensaje("¿Que desea hacer?");
    this.vista.showMensaje("Ingrese el numero correspondiente a la opcion: ");
    this.vista.showMensaje("1) Regresar al Menu");
    this.vista.showMensaje("2) Salir");
    int opcion = vista.leerEntradaEntero();
    switch (opcion) {
      case 1:
        if (user.getTipoUsuario()) {
          mostrarMenuHost(user);
        } else {
          muestraMenu(user);
        }
        break;

      case 2:
        vista.logOut();
        break;

    }
  }

  
  /** 
   * @param usuario creara un evento para el usuario
   */
  public void crearEvento(Usuario usuario) {
    this.vista.showMensaje("A continuación vas a crear un evento: " + "\n");

    int id = this.eventos.size() + 1;
    String idEvento = Integer.toString(id);

    // PEDIMOS EL NOMBRE
    vista.showMensaje("Ingresa el nombre del evento: " + "\n");
    String nombre_evento = this.vista.leerEntradaString();

    // PEDIMOS la descripcion
    vista.showMensaje("Describe tu evento \n");
    String decripcion = this.vista.leerEntradaString();

    // MOSTRAMOS LOS RECINTOS Y PEDIMOS QUE INGRESE EL ID
    vista.showMensaje("\n A continuación  semuestran los recintos disponibles: \n");
    verTodosLosRecintos();

    vista.showMensaje("\nIngresa el ID del recinto donde se realizará el evento: \n");

    int idRecinto = vista.leerEntradaEntero() - 1;

    Recinto miRecinto = recintos[idRecinto];
    vista.showMensaje(miRecinto.toString());

    LinkedList<Usuario> usuariosEvento = new LinkedList<Usuario>();

    Evento e = new Evento(idEvento,
        nombre_evento,
        decripcion,
        miRecinto,
        usuariosEvento);
    eventos.add(e);

    this.vista.showMensaje("Se creo el evento: " + e.getNombreEvento() + "\n");
    this.checkOption(usuario);

  }

  
  /** 
   * @param usuario cancelara un evento del usuario
   */
  public void cancelarEvento(Usuario usuario) {
    vista.showMensaje("A continuación se muestran todos los eventos:");
    this.verTodosLosEventos();
    vista.showMensaje("Ingresa el id del evento que deseas cancelar:");
    String idEvento = Integer.toString(vista.leerEntradaEntero());
    Evento e = this.getEvento(idEvento);
    this.eliminaEvento(e);
    vista.showMensaje("\n" + "El evento fue eliminado" + "\n");
    this.checkOption(usuario);
  }

  
  /** 
   * @param usuario suscribira a un evento al usuario
   */
  private void sucribirEvento(Usuario usuario) {
    vista.showMensaje("A continuación se muestran todos los eventos:");
    this.verTodosLosEventos();
    vista.showMensaje("Ingresa el id del evento que deseas asistir:");
    String idEvento = Integer.toString(vista.leerEntradaEntero());
    Evento e = this.getEvento(idEvento);
    if (usuario.asistirEvento(e)) {
      vista.showMensaje("Se agrego con éxito el evento:  '" + e.getNombreEvento() + "'" + "\n");
    }
    this.checkOption(usuario);
  }

  private void verTodosLosEventos() {
    for (Evento e : this.eventos) {
      vista.showMensaje(e.toString());

    }
  }

  private void verTodosLosRecintos() {
    for (Recinto r : this.recintos) {
      vista.showMensaje(r.toString());
    }
  }

  
  /** 
   * @param usuario mostrara todos los eventos al usuario
   */
  private void verTodosLosEventos(Usuario usuario) {
    for (Evento e : this.eventos) {
      vista.showMensaje(e.toString());
    }
    this.checkOption(usuario);
  }

  
  /** 
   * @param usuario mostrara los eventos a los que pertenece el usuario
   */
  private void verMisEventos(Usuario usuario) {
    for (Evento e : usuario.getEventos()) {
      vista.showMensaje(e.toString());
    }
    this.checkOption(usuario);
  }

  
  /** 
   * @param e elimina un evento e
   */
  public void eliminaEvento(Evento e) {
    this.eventoIterador = new EventoIterador(this.eventos);
    this.eventoIterador.remove(e);
  }

  
  /** 
   * @param usuario usaurio a devolver
   * @return Usuario usuario en sistema
   */
  public Usuario getUsuario(Usuario usuario) {
    this.usuarioIterador = new UsuarioIterador(this.usuarios);
    Usuario usuarioEnSistema = null;
    while (this.usuarioIterador.hasNext()) {
      usuarioEnSistema = (Usuario) usuarioIterador.next();
      if (usuarioEnSistema.getNumeroCuenta().equalsIgnoreCase(usuario.getNumeroCuenta()))
        return usuarioEnSistema;
    }
    return usuarioEnSistema;
  }

  
  /** 
   * @param numeroDeCuenta numero de cuenta de un usuario en sistema
   * @return Usuario cuenta asociada al numero de cuenta
   */
  public Usuario getUsuario(String numeroDeCuenta) {
    this.usuarioIterador = new UsuarioIterador(this.usuarios);
    Usuario usuarioEnSistema = null;
    while (this.usuarioIterador.hasNext()) {
      usuarioEnSistema = (Usuario) usuarioIterador.next();
      if (usuarioEnSistema.getNumeroCuenta().equalsIgnoreCase(numeroDeCuenta))
        return usuarioEnSistema;
    }
    return usuarioEnSistema;
  }

  
  /** 
   * @param idRecinto id asociado a un recinto
   * @return Recinto asociado al id
   */
  public Recinto getRecinto(String idRecinto) {
    this.recintoIterador = new RecintoMenuIterador(this.recintos);
    Recinto recintoEnSistema = null;

    while (this.recintoIterador.hasNext()) {
      recintoEnSistema = (Recinto) recintoIterador.next();

      if (recintoEnSistema.getIdRecinto().equalsIgnoreCase(idRecinto))
        return recintoEnSistema;
    }
    return recintoEnSistema;
  }

  
  /** 
   * @param evento evento que se comparara con los encontrados en el banco de datos
   * @return Evento encontrado en el banco de datos
   */
  public Evento getEvento(Evento evento) {
    this.eventoIterador = new EventoIterador(this.eventos);
    Evento eventoEnSistema = null;
    while (this.eventoIterador.hasNext()) {
      eventoEnSistema = (Evento) eventoIterador.next();
      if (eventoEnSistema.getIdEvento().equalsIgnoreCase(evento.getIdEvento()))
        return eventoEnSistema;
    }
    return eventoEnSistema;
  }

  
  /** 
   * @param idEvento id relacionado a un evento en sistema
   * @return Evento objeto asociado al banco de datos
   */
  public Evento getEvento(String idEvento) {
    this.eventoIterador = new EventoIterador(this.eventos);
    Evento eventoEnSistema = null;
    while (this.eventoIterador.hasNext()) {

      eventoEnSistema = (Evento) eventoIterador.next();
      if (eventoEnSistema.getIdEvento().equalsIgnoreCase(idEvento))
        return eventoEnSistema;
    }
    return eventoEnSistema;
  }

}
