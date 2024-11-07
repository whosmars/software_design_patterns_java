public class ConDefensa implements Defensa{

    private String NOMBRE_DEFENSA = "DEFENSA ACTIVA";
    
    
    /** 
     * @return double del amortiguamiento del ataque
     */
    public double defenderse(){
        return 2;
    }

    
    /** 
     * @return String del nombre de la defensa
     */
    public String getNombre(){
        return NOMBRE_DEFENSA;
    }

}