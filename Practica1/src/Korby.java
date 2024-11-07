/**
 * Clase que define el comportamiento de Korby. Implementa Personaje
 */
public class Korby implements Personaje{

    private double salud = 100.00;

    private AtaqueKorby ataque = new PatadaNinja();

    private Defensa defensa = new SinDefensa();

    private int cambiosRestantes = 3;

    private String NOMBRE_PERSONAJE = "Korby";

    
    /** 
     * @param nuevoAtaque - ataque que sera asignado al atributo ataque
     * @return boolean que nos dira su fue posible realizar el cambio
     */
    public boolean cambiarAtaque(AtaqueKorby nuevoAtaque){
        if(cambiosRestantes <= 0)
            return false;
        this.ataque = nuevoAtaque;
        this.cambiosRestantes--;
        return true;
    }

    
    /** 
     * @param defensa - defensa que reemplazara a la instanciada en this.defensa
     */
    public void cambiarDefensa(Defensa defensa){
        this.defensa = defensa;
        return;
    }

    
    /** 
     * @param personaje - persona que atacara nuestro objeto
     */
    public void atacar(Personaje personaje){
        if(!this.estaVivo())
            return;
        double vidaDespuesAtaque = (personaje.getVida() - (this.getPuntosAtaque() / personaje.getPuntosDefensa()));
        personaje.setVida(vidaDespuesAtaque);
    }

    
    /** 
     * @return double asignado al atributo vida
     */
    public double getVida(){
        return this.salud;
    }

    
    /** 
     * @param vida - instanciara al atributo salud
     */
    public void setVida(double vida){
        this.salud = vida;
    }
    
    
    /** 
     * @return double asingado a los puntos de defensa de this.defensa
     */
    public double getPuntosDefensa(){
        return this.defensa.defenderse();
    }

    
    /** 
     * @return double asignado a los puntos de ataque de this.ataque
     */
    public double getPuntosAtaque(){
        return this.ataque.atacar();
    }

    
    /** 
     * @return String del nombre del ataque
     */
    public String getNombreAtaque(){
        return this.ataque.getNombreAtaque();
    }

    
    /** 
     * @return boolean sobre si sigue vivo el personaje (salud > 0)
     */
    public boolean estaVivo(){
        return this.salud > 0;
    }

    
    /** 
     * @return String nombre del Personaje
     */
    public String getNombrePersonaje(){
        return NOMBRE_PERSONAJE;
    }

    
    /** 
     * @return String nombre que recibe la defensa
     */
    public String getNombreDefensa(){
        return this.defensa.getNombre();
    }

    
    /** 
     * @param atacado - Personaje al cual atacara nuestro personaje .this, se le restaran puntos en atacado.getVida()
     * @return String sobre lo que ocurre mientras atacado recibe damage
     */
    public String atacarToString(Personaje atacado){
        return "\n" + this.getNombrePersonaje() + " ha atacado con " + this.getNombreAtaque() + " (" + this.getPuntosAtaque()
                + " puntos de damage) a " + atacado.getNombrePersonaje() + ", " + atacado.getNombreDefensa() + ", que ahora tiene "
                + atacado.getVida() + "% de salud";
    }

    
    /** 
     * @param nombreDefensa - nombre de la nueva defensa
     * @return String sobre como quedara nuestra defensa despues del cambio
     */
    public String cambioDefensaToString(String nombreDefensa){
        return "\n" + this.getNombrePersonaje() + " ha cambiado su defensa a: " + this.defensa.getNombre(); 
    }

    
    /** 
     * @param nombreAtaque - nomnbre del nuevo ataque
     * @return String sobre como quedara nuestro ataque despues del cambio
     */
    public String cambioAtaqueToString(String nombreAtaque){
        return "\n" + this.getNombrePersonaje() + " ha cambiado su ataque a: " + this.ataque.getNombreAtaque(); 
    }

    
    /** 
     * @return String que regresa los atributos del objeto
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

