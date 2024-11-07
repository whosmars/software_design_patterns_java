import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class UsuarioIterador implements Iterator<Usuario> {

  private LinkedList<Usuario> lista;
  private Iterator<Usuario> iterador;

  public UsuarioIterador(LinkedList<Usuario> lista) {
    this.lista = lista;
    this.iterador = this.lista.iterator();
  }

  
  /** 
   * @return boolean la estructura contendra otro Usuaruo
   */
  @Override
  public boolean hasNext() {
    return this.iterador.hasNext();
  }

  
  /** 
   * @return Usuario en la estructura
   */
  @Override
  public Usuario next() {
    if (!this.hasNext())
      throw new NoSuchElementException();
    return this.iterador.next();
  }

}