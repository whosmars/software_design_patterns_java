public class PatadaNinja implements AtaqueKorby{

    private final String  NOMBRE_ATAQUE = "Patada Ninja";
    private final double DAMAGE =  27.00;
    
    
    /** 
     * @return String del nombre del ataque
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