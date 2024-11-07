public interface Personaje{

    public void atacar(Personaje personaje);

    public double getVida();
    
    public void setVida(double vida);

    public double getPuntosAtaque();

    public double getPuntosDefensa();

    public String getNombreAtaque();

    public boolean estaVivo();

    public String getNombreDefensa();

    public String getNombrePersonaje();

    public String toString();

    public String atacarToString(Personaje personaje);

    public String cambioDefensaToString(String nombreDefensa);

    public String cambioAtaqueToString(String nombreAtaque);

}