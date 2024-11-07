/**
 * Clase Hamburguesa. Define los atributos de una ademas de un metodo Template referente a su elaboracion.
 * @author Compunenes
 * @version 1.0
 */
public abstract class Hamburguesa {

    private int id;

    protected String nombreHamburguesa;

    protected String descripcion;

    protected double precio;

    protected boolean tieneQueso;

    protected boolean esVegana;

    protected double puntosDeCocinaCarne = 0;

    public Hamburguesa(String nombreHamburguesa){}

    public Hamburguesa(int id,
                       String nombreHamburguesa,
                       String descripcion,
                       double precio,
                       boolean tieneQueso,
                       boolean esVegana)
    {
        this.id = id;
        this.nombreHamburguesa = nombreHamburguesa;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
        this.esVegana = esVegana;
    }

    
    /** 
     * @return String Atributos del objeto visto en cadena de String
     */
    public String toString(){
        return ("-------------------------------------"
                + "\nNombre: " +  this.nombreHamburguesa
                + "\nId :" + this.id
                + "\nDescripcion: " + this.descripcion
                + "\nPrecio: " + this.precio
                + "\nContiene Queso? " + this.tieneQueso
                + "\nEs vegana? " + this.esVegana);
    }

    /** 
     *Metodo Template. Define el esqueleto del algoritmo al momento de preparar cualquier Hamburguesa
     */
    public void preparacion(){
        this.presentacionHamburguesa();
        this.ponerPan();
        this.ponerMayonesa();
        this.ponerMostaza();
        this.prepararCarne();
        this.ponerCarne();
        this.ponerQueso();
        this.ponerVegetales();
        this.ponerCatsup();
        this.ponerPan();
        this.presentacionHamburguesaFinal();
        return;
    }

    abstract void presentacionHamburguesa();

    public void ponerPan(){
        System.out.println("---Se le ha puesto pan a la hamburguesa---");
        return;
    }

    public void ponerMayonesa(){
        System.out.println("---Se le ha puesto mayonesa (Helmans) a la mayonesa---");
        return;
    }

    public void ponerMostaza(){
        System.out.println("---Se le ha puesto mostaza a la hamburguesa---");
        return;
    }

    abstract void prepararCarne();

    public void ponerCarne(){
        System.out.println("---Se le ha puesto la carne a la hamburguesa---");
        return;
    }

    abstract void ponerQueso();

    public void ponerVegetales(){
        System.out.println("---Se le han puesto los vegetales a la hamburguesa---");
        return;
    }

    public void ponerCatsup(){
        System.out.println("---Se le ha puesto catsup (Heins) a la hamburguesa---");
        return;
    }

    public void presentacionHamburguesaFinal(){
        System.out.println("---Su Hamburguesa esta lista---");
        return;
    }

    
    /** 
     * @return double El valor de puntosCocinaCirna
     */
    public double cocinandoCarne(){
        this.puntosDeCocinaCarne += 25 ;
        return this.puntosDeCocinaCarne;
    }

    
    /** 
     * @return int El valor del id
     */
    public int getID(){
        return this.id;
    }

    
    /** 
     * @return String El nombre de la hamburguesa o de la clase
     */
    public String getNombre(){
        return this.nombreHamburguesa;
    }

}
