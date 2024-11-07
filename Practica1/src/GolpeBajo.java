public class GolpeBajo implements AtaqueDittuu{

    private final String  NOMBRE_ATAQUE = "Golpe Bajo";
    private final double DAMAGE =  23.00;
    
    
    /** 
     * @return String que regresa el nombre del objeto
     */
    public String getNombreAtaque(){
        return NOMBRE_ATAQUE;
    }

    
    /** 
     * @return double que regresa el danio asociado a GolpeBajo
     */
    public double atacar(){
        return DAMAGE;
    }

}