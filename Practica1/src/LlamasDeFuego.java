public class LlamasDeFuego implements AtaqueMeganMan{

    private final String  NOMBRE_ATAQUE = "Llamas de Fuego";
    private final double DAMAGE =  17.50;
    
    
    /** 
     * @return String nombre del ataque
     */
    public String getNombreAtaque(){
        return NOMBRE_ATAQUE;
    }

    
    /** 
     * @return double damage asocaiado al ataque
     */
    public double atacar(){
        return DAMAGE;
    }

}