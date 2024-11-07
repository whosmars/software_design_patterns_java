import java.util.Iterator;
import java.util.NoSuchElementException;

public class RecintoMenuIterador implements Iterator<Recinto> {

  private Recinto[] recintos;
  private int index;

  public RecintoMenuIterador(Recinto[] recintos) {
    this.recintos = recintos;
    this.index = 0;
  }

  
  /** 
   * @return boolean la estructura contiene otro objeto
   */
  @Override
  public boolean hasNext() {
    return (this.recintos.length < this.index);
  }

  
  /** 
   * @return Recinto proximo recinto en la estructura
   */
  @Override
  public Recinto next() {
    if (!this.hasNext())
      throw new NoSuchElementException();
    this.index += 1;
    return this.recintos[index - 1];
  }
}