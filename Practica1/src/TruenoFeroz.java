public class TruenoFeroz implements AtaqueMeganMan{

    private final String  NOMBRE_ATAQUE = "Trueno Feroz";
    private final double DAMAGE =  32.50;
    
    
    /** 
     * @return String nombre del ataque
     */
    public String getNombreAtaque(){
        return NOMBRE_ATAQUE;
    }

    
    /** 
     * @return double asociado al damage del ataque
     */
    public double atacar(){
        return DAMAGE;
    }

}