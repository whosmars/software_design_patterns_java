public class Combo2x1 implements AtaqueMeganMan{

    private final String  NOMBRE_ATAQUE = "Combo 2x1";
    private final double DAMAGE =  20.00;
    
    
    /** 
     * @return String del nombre del ataque
     */
    public String getNombreAtaque(){
        return NOMBRE_ATAQUE;
    }

    
    /** 
     * @return double del damage que causa este ataque
     */
    public double atacar(){
        return DAMAGE;
    }

}