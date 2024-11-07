public class BlindajeReforzado extends Blindaje{

    
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
        return "Blindaje de nave reforzado pensado para soportar impactos de misiles pequeños, soportar altas temperaturas";
    }

    
    /** 
     * @return double
     */
    @Override
    public double defensa() {
        return 10000;
    }

    
    /** 
     * @return double
     */
    @Override
    public double peso() {
        return 900;
    }

    
    /** 
     * @return double
     */
    @Override
    public double precio() {
        return 3000;
    }
    
}
