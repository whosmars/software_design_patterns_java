public class PalmadaAtomica implements AtaqueDittuu{

    private final String  NOMBRE_ATAQUE = "Palmada Atomica";
    private final double DAMAGE =  29.00;
    
    
    /** 
     * @return String nombre del ataque
     */
    public String getNombreAtaque(){
        return NOMBRE_ATAQUE;
    }

    
    /** 
     * @return double asociado al damage de el ataque
     */
    public double atacar(){
        return DAMAGE;
    }

}