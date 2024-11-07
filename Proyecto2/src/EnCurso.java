public class EnCurso implements Estado {
  private Evento evento;

  public EnCurso(Evento evento){
    this.evento = evento;
  }

  public void iniciado(){
    System.out.println("El evento ya esta en curso");
  }

  public void cancelado(){
    System.out.println("El evento ha sido cancelado");
    evento.asignarNuevoEstado(evento.getCancelado());
  }

  public void enCurso(){
    System.out.println("El evento ya se encuentra en curso");
  }

  public void finalizado(){
    System.out.println("Gracias por asistir!!!");
    evento.asignarNuevoEstado(evento.getFinalizado());
  }
  
}