import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class EventoIterador implements Iterator<Evento>{

  private ArrayList<Evento> eventos;
  private Iterator<Evento> iterador;

  public EventoIterador(ArrayList<Evento> eventos){
    this.eventos = eventos;
    this.iterador = this.eventos.iterator();
  }

  
  /** 
   * @return boolean la estructura tiene elemento siguiente
   */
  @Override public boolean hasNext(){
    return this.iterador.hasNext();
  }

  
  /** 
   * @return Evento de la estructura
   */
  @Override public Evento next(){
    if(!this.hasNext())
      throw new NoSuchElementException();
    return this.iterador.next();
  }

  
  /** 
   * @param evento a eliminar
   * @return boolean se logro remover el Objeto de la estructura
   */
  public boolean remove(Evento evento){
    return this.eventos.remove(evento);
  }

  
  
}