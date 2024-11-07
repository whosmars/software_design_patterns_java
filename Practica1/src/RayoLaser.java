public class RayoLaser implements AtaqueKorby{

    private final String  NOMBRE_ATAQUE = "Rayo Laser";
    private final double DAMAGE =  19.00;
    
    
    /** 
     * @return String del nombre del ataque
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