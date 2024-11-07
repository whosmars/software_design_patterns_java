public class MaldicionEterna implements AtaqueKorby{

    private final String  NOMBRE_ATAQUE = "Maldicion Eterna";
    private final double DAMAGE =  24.00;
    
    
    /** 
     * @return String del nombre asociado al ataque
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