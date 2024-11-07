public class Finalizado implements Estado {
  private Evento evento;

  public Finalizado(Evento evento){
    this.evento = evento;
  }

  public void iniciado(){
    System.out.println("El evento ya ha terminado");
  }

  public void cancelado(){
    System.out.println("El evento ya ha terminado");
  }

  public void enCurso(){
    System.out.println("El evento ya ha terminado");
  }

  public void finalizado(){
    System.out.println("El evento ya ha terminado");
  }
  
}