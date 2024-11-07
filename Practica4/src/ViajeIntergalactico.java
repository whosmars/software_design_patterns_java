public class ViajeIntergalactico extends SistemaDePropulsion {

    
    /** 
     * @return String nombre del componente
     */
    @Override
    public String nombre() {
        return "Viaje Intergalactico";
    }

    
    /** 
     * @return double ataque del componente
     */
    @Override
    public double ataque() {
        return 0;
    }

    
    /** 
     * @return double defensa del componente
     */
    @Override
    public double defensa() {
        return 0;
    }

    
    /** 
     * @return String descripcion del componente
     */
    @Override
    public String descripcion() {
        return "Sistema de propulsion planeado para realizar viajes entre galaxias";
    }

    
    /** 
     * @return double velocidad del componente
     */
    @Override
    public double velocidad() {
        return 1000000;
    }

    
    /** 
     * @return double peso del componente
     */
    @Override
    public double peso() {
        return 4500;
    }

    
    /** 
     * @return double precio del componente
     */
    @Override
    public double precio() {
        return 100000;
    }
    
}
