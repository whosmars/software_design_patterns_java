public class Iniciado implements Estado {
  private Evento evento;

  public Iniciado(Evento evento){
    this.evento = evento;
  }

  public void iniciado(){
    System.out.println("El evento ya ha sido creado");
  }

  public void cancelado(){
    System.out.println("El evento ha sido cancelado");
    evento.asignarNuevoEstado(evento.getCancelado());
  }

  public void enCurso(){
    System.out.println("El evento comenzara en estar en curso");
    evento.asignarNuevoEstado(evento.getEnCurso());
  }

  public void finalizado(){
    System.out.println("El evento no esta en curso si quiera");
  }
  
}