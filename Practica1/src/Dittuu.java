
/**
 * Clase que define el comportamiento de Dittuu. Implementa Personaje
 */
public class Dittuu implements Personaje{

    private double salud = 100.00;

    private AtaqueDittuu ataque = new GolpeBajo();

    private Defensa defensa = new SinDefensa();

    private int cambiosRestantes = 3;

    private String NOMBRE_PERSONAJE = "Dittuu";

    
    /** 
     * @param nuevoAtaque
     * @return boolean
     */
    public boolean cambiarAtaque(AtaqueDittuu nuevoAtaque){
        if(cambiosRestantes <= 0)
            return false;
        this.ataque = nuevoAtaque;
        this.cambiosRestantes--;
        return true;
    }

    
    /** 
     * @param defensa
     */
    public void cambiarDefensa(Defensa defensa){
        this.defensa = defensa;
        return;
    }

    
    /** 
     * @param personaje
     */
    public void atacar(Personaje personaje){
        if(!this.estaVivo())
            return;
        double vidaDespuesAtaque = (personaje.getVida() - (this.getPuntosAtaque() / personaje.getPuntosDefensa()));
        personaje.setVida(vidaDespuesAtaque);
    }

    
    /** 
     * @return double
     */
    public double getVida(){
        return this.salud;
    }

    
    /** 
     * @param vida
     */
    public void setVida(double vida){
        this.salud = vida;
    }

    
    /** 
     * @return double
     */
    public double getPuntosAtaque(){
        return this.ataque.atacar();
    }

    
    /** 
     * @return double
     */
    public double getPuntosDefensa(){
        return this.defensa.defenderse();
    }

    
    /** 
     * @return String
     */
    public String getNombreAtaque(){
        return this.ataque.getNombreAtaque();
    }

    
    /** 
     * @return boolean
     */
    public boolean estaVivo(){
        return this.salud > 0;
    }

    
    /** 
     * @return String
     */
    public String getNombrePersonaje() {
        return NOMBRE_PERSONAJE;
    }

    
    /** 
     * @return String
     */
    public String getNombreDefensa(){
        return this.defensa.getNombre();
    }

    
    /** 
     * @param atacado
     * @return String
     */
    public String atacarToString(Personaje atacado){
        return "\n" + this.getNombrePersonaje() + " ha atacado con " + this.getNombreAtaque() + " (" + this.getPuntosAtaque()
                + " puntos de damage) a " + atacado.getNombrePersonaje() + ", " + atacado.getNombreDefensa() + ", que ahora tiene "
                + atacado.getVida() + "% de salud";
    }
    
    
    /** 
     * @param nombreDefensa - nombre que recibe la defensa a la que se cambio
     * @return String que informa sobre los cambios hechos en Defensa
     */
    public String cambioDefensaToString(String nombreDefensa){
        return "\n" + this.getNombrePersonaje() + " ha cambiado su defensa a: " + this.defensa.getNombre(); 
    }

    
    /** 
     * @param nombreAtaque - nombre del ataque al que se acaba de cambiar
     * @return String que informa sobre los cambios hechos en AtaqueDittuu
     */
    public String cambioAtaqueToString(String nombreAtaque){
        return "\n" + this.getNombrePersonaje() + " ha cambiado su ataque a: " + this.ataque.getNombreAtaque(); 
    }

    
    /** 
     * @return String que regresa los atributos del objeto de forma ordenada
     */
    @Override
    public String toString(){
        String carta = "\n--------------------------------\n";
        carta += "Nombre: " + getNombrePersonaje() + "\n"
                + "Barra de Vida: " + getVida() + "%\n"
                + "Poder Actual: " + getNombreAtaque() + " con " + this.ataque.atacar() + " puntos de damage \n"
                + "Defensa Actual: " + getNombreDefensa()
                + "\n--------------------------------";
        return carta;
    }

}

