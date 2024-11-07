import java.util.LinkedList;

/**
 * Clase Arena: Esta clase sera la encargada de implementar Sujeto por lo que tendra control en el manejo de los Observers
 */
public class Arena implements Sujeto{

    private LinkedList<Espectador> espectadores = new LinkedList<Espectador>();

    private String sucesosArena;

    
    /** 
     * @param espectador - Espectador que sera removido de la lista
     */
    public void remover(Espectador espectador){
        this.espectadores.remove(espectador);
        return;
    }

    
    /** 
     * @param espectador - Espectador que sera agregado a la lista
     */
    public void agregar(Espectador espectador){
        this.espectadores.add(espectador);
        return;
    }

    public void comunicarEspectador(){
        if(espectadores.size() < 0)
            return;
        for(Espectador espectador : this.espectadores){
            espectador.update();
        }
        return;
    }

    
    /** 
     * @return String de los sucesos de la arena
     */
    public String getSucesos(){
        return this.sucesosArena;
    }

    
    /** 
     * @param sucesos - instanciara la variable sucesosArena
     */
    public void setSucesos(String sucesos){
        this.sucesosArena = sucesos;
        return;
    }

    
    /** 
     * @return LinkedList<Espectador> que es la lista de espectadores
     */
    public LinkedList<Espectador> getEspectadores(){
        return this.espectadores;
    }

}
