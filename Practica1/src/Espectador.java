import java.util.Random;
import java.util.Objects;
/**
 * clase que define el comportamiento de un espectador de la partida. Implementa Observer
 */
public class Espectador implements Observer {
    
    private String nombre;

    private int id;

    private String peleadorFavorito;

    private String sucesosPelea;

    private String identificadorArchivo;

    private Arena arena;

    private Bitacora bitacora = new Bitacora();

    public Espectador(String nombre, String peleadorFavorito, Arena arena){
        this.nombre = nombre;
        this.peleadorFavorito = peleadorFavorito;
        this.arena = arena;
        Random generarNumero = new Random();
        this.id = generarNumero.nextInt(10000);
        this.identificadorArchivo = nombre + id + ".txt";
        this.bitacora.crearArchivo(this.identificadorArchivo, nombre, peleadorFavorito);
    }

    public void update(){
        this.sucesosPelea = arena.getSucesos();
        this.bitacora.grabar(this.identificadorArchivo, sucesosPelea);
        return;
    }

    
    /** 
     * @param ganador - ganador del combate. Se comparara con la eleccion de cad Espectador
     */
    public void ganador(String ganador){
        if(Objects.equals(this.getPeleadorFavorito(), ganador)){
            this.bitacora.grabar(this.identificadorArchivo, "\nHA GANADO " + this.getPeleadorFavorito() +", TU PELEADOR FAVORITO!!");
            return;
        }
        this.bitacora.grabar(this.identificadorArchivo,"\nNO HA GANADO " + this.getPeleadorFavorito() +", TU PELEADOR FAVORITO. Ha ganado " + ganador + "!!");
        return;
    }

    
    /** 
     * @return String que regresa el Personaje favorito del Espectador
     */
    public String getPeleadorFavorito(){
        return this.peleadorFavorito;
    }

}
