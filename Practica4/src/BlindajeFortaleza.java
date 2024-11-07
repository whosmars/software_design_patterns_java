public class BlindajeFortaleza extends Blindaje{

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre() {
        return "Blindaje Reforzado";
    }

    
    /** 
     * @return double ataque del componente
     */
    @Override
    public double ataque() {
        return 0;
    }

    
    /** 
     * @return double velocidad del componente
     */
    @Override
    public double velocidad() {
        return 0;
    }

    
    /** 
     * @return String descripcion del componente
     */
    @Override
    public String descripcion() {
        return "Blindaje de nave de grado militar. Soporta ataques de laseres, misiles de plasma y pequeñas explosiones solares";
    }

    
    /** 
     * @return double defensa del componente
     */
    @Override
    public double defensa() {
        return 100000;
    }

    
    /** 
     * @return double peso del componente
     */
    @Override
    public double peso() {
        return 1500;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio() {
        return 6000;
    }
    
}
