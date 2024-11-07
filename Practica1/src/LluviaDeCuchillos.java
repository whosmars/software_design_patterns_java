public class LluviaDeCuchillos implements AtaqueDittuu{

    private final String  NOMBRE_ATAQUE = "Lluvia de Cuchillos";
    private final double DAMAGE =  31.00;
    
    
    /** 
     * @return String nombre del ataque
     */
    public String getNombreAtaque(){
        return NOMBRE_ATAQUE;
    }

    
    /** 
     * @return double del damage asociado al ataque
     */
    public double atacar(){
        return DAMAGE;
    }

}