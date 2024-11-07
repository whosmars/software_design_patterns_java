public class SinDefensa implements Defensa{

    private String NOMBRE_DEFENSA = "SIN DEFENSA";
    
    
    /** 
     * @return double regresa el amortiguamiento que tendra la defensa al recibir un ataque
     */
    public double defenderse(){
        return 1;
    }

    
    /** 
     * @return String nombre asociado al tipo de defensa
     */
    public String getNombre(){
        return NOMBRE_DEFENSA;
    }

}