import java.util.ArrayList;

public abstract class Builder {

  public String nombreUsuario;
  public String bandeja;
  public String email;
  public String contrasena;
  public String numeroCuenta;
  public String facultad;
  public boolean tipoUsuario;
  public ArrayList<Evento> eventos;
  public ArrayList<Evento> misEventos;

  public abstract Usuario build();

  public abstract Builder nombreUsuario(String nombreUsuario);

  public abstract Builder bandeja(String bandeja);

  public abstract Builder email(String email);

  public abstract Builder contrasena(String contrasena);

  public abstract Builder numeroCuenta(String numeroCuenta);

  public abstract Builder facultad(String facultad);

  public abstract Builder eventos(ArrayList<Evento> eventos);

  public abstract Builder misEventos(ArrayList<Evento> misEventos);

}
