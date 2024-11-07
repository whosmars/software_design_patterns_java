public class Recinto {

    public String idRecinto;
    public String nombreRecinto ;
    public String direccion;
    public String capacidad;

    public Recinto(String idRecinto,String nombreRecinto, String direccion, String capacidad) {
        this.idRecinto = idRecinto;
        this.nombreRecinto = nombreRecinto;
        this.direccion = direccion;
        this.capacidad = capacidad;
        
    }
    
    /** 
     * @return String id del recinto
     */
    public String getIdRecinto(){
      return this.idRecinto;
    }

    /** 
     * @return String nombre del recinto
     */
    public String getNombreRecinto() {
        return nombreRecinto;
    }
    
    /** 
     * @param nombreRecinto nombre que recibira el recinto
     */
    public void setNombreRecinto(String nombreRecinto) {
        this.nombreRecinto = nombreRecinto;
    }
    
    /** 
     * @return String descripcion del recinto
     */
    public String getDireccion() {
        return direccion;
    }

   /** 
    * @return String forma acomodada de acomodar a un recinto
    */
   public String toString(){
     return "ID Recinto: "+ idRecinto+ "\n"+
            "nombre recinto: " + this.nombreRecinto + "\n"+
            "Direccion: " + this.direccion + "\n"+
            "Capacidad: " + this.direccion + "\n";
       
   }

    /** 
     * @param direccion direccion que tendra el recinto
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    /** 
     * @return String capacidad del recinto
     */
    public String getCapacidad() {
        return capacidad;
    }

    
    /** 
     * @param capacidad capacidad que tendra el recinto
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    /** 
     * @param e evento a agregar al sistema
     * @return boolean se logro agregar a la estructura
     */
    public boolean agregarEvento(Evento e){
        return true;
    }

    
    /** 
     * @param e evento a eliminar del sistema
     * @return boolean se logro eliminar de la estructura
     */
    public boolean eliminarEvento(Evento e){
        return true;
    }
}
