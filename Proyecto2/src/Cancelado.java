public class Cancelado implements Estado {
  private Evento evento;

  public Cancelado(Evento evento) {
    this.evento = evento;
  }

  public void iniciado() {
    System.out.println("El evento ha sido cancelado");
  }

  public void cancelado() {
    System.out.println("El evento ha sido cancelado");
  }

  public void enCurso() {
    System.out.println("El evento ha sido cancelado");
  }

  public void finalizado() {
    System.out.println("***FINALIZANDO EVENTO***");
    evento.asignarNuevoEstado(evento.getFinalizado());
  }

}