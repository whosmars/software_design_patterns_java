import java.util.ArrayList;
import java.util.LinkedList;

public class Recursos {

  public ArrayList<Evento> eventos;
  public LinkedList<Usuario> usuarios;
  public Recinto[] recintos;

  public Recursos() {
    this.eventos = new ArrayList<>();
    this.usuarios = new LinkedList<>();
    this.recintos = new Recinto[3];
    /* AGREGAMOS LOS USUARIOS DE PRUEBA */
    this.agregaUsuarios();
    /* AGREGAMOS LOS RECINTOS */
     this.agregaRecintos();
    /* AGREGAMOS LOS EVENTOS */
    this.agregaEventos();
  }

  public void agregaRecintos() {
    this.recintos[0] = new Recinto("1","Auditorio Alberto Baraja",
        "Investigación Científica, C.U., Coyoacán, 04510 Ciudad de México, CDMX",
        "200");

    this.recintos[1] = new Recinto("2","Fronton Cerrado CU",
        "C.U., Coyoacán, 04510 Ciudad de México, CDMX",
        "1000");

    this.recintos[2] = new Recinto("3","Islas CU",
        "Av Cd Universitaria 3000, Coyoacán, 04510 Ciudad de México, CDMX",
        "350");

  }

  public void agregaEventos() {
    this.eventos.add(new Evento("1",
        "Presentación Coro",
        "Evento donde puedes disfrutar el coro de la Facultad de Ciencias",
        this.recintos[0],
        this.usuarios));
    this.eventos.add(new Evento("2",
        "Juegos InterFacultades 2022",
        "Evento donde puedes disfrutar de ver a los mejores atletas universitarios en cada uno de sus disciplinas",
        this.recintos[1],
        this.usuarios));
    this.eventos.add(new Evento("3",
        "Torneo Decembrino de Ajedrez 2022",
        "Evento al aire libre de categoria libre donde podras competir contra los mejores jugadores de Ajedrez de Mexico",
        this.recintos[2],
        this.usuarios));
  }

  public void agregaUsuarios() {
    Builder builder = null;
    Usuario usuario = null;
    builder = new UsuarioBuilder("Juan Manuel",
        "",
        "juanito@marques.com.mx",
        "juan1234",
        "1234",
        "Fac ciencias");
    usuario = builder.build();
    usuario.setEventos(this.eventos);
    this.usuarios.add(usuario);
    builder = new UsuarioHostBuilder("Ricardo Jimenez",
        "",
        "rick@ciencias.unam.mx",
        "rick1234",
        "56789",
        "Fac de ciencias");
    usuario = builder.build();
    usuario.setEventos(this.eventos);
    this.usuarios.add(usuario);
    
    builder = new UsuarioHostBuilder("Antonio Valencia",
        "",
        "ant.val@ciencias.unam.mx",
        "ant",
        "1111",
        "Fac de ciencias");
    
    usuario = builder.build();
    usuario.setEventos(this.eventos);
    this.usuarios.add(usuario);
  }

}