import java.util.LinkedList;
import java.util.ArrayList;

public class UsuarioHostBuilder extends Builder{
  
    public UsuarioHostBuilder(String nombreUsuario, String bandeja, String email, String contrasena, String numeroCuenta, String facultad) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.bandeja = bandeja;
        this.contrasena = contrasena;
        this.numeroCuenta = numeroCuenta;
        this.facultad = facultad;
        this.tipoUsuario = true;
        this.eventos = new ArrayList<>();
        if (tipoUsuario)
          this.misEventos = new  ArrayList<>();
    }

    
    /** 
     * @return Usuario creador del host
     */
    @Override
    public Usuario build() {
        return new Usuario(this);
    }

    
    /** 
     * @param nombreUsuario nombre del usuario
     * @return Builder builder con nombre de usuario
     */
    @Override
    public Builder nombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }

    
    /** 
     * @param bandeja bandeja que sera del usuario
     * @return Builder builder con bandeja
     */
    @Override
    public Builder bandeja(String bandeja) {
        this.bandeja = bandeja;
        return this;
    }

    
    /** 
     * @param email email del usuario
     * @return Builder builder con email
     */
    @Override
    public Builder email(String email) {
        this.email = email;
        return this;
    }

    
    /** 
     * @param contrasena contrasena del usuario
     * @return Builder builder con contrasena
     */
    @Override
    public Builder contrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    
    /** 
     * @param numeroCuenta numero de cuenta dle usuario
     * @return Builder builder con numero de cuenta
     */
    @Override
    public Builder numeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        return this;
    }

    
    /** 
     * @param facultad facultad del usuario
     * @return Builder builder con facultad
     */
    @Override
    public Builder facultad(String facultad) {
        this.facultad = facultad;
        return this;
    }

    
    /** 
     * @param eventos lista de eventos que tendra el soporte dle sistema
     * @return Builder los eventos del sistema
     */
    @Override
    public Builder eventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
        return this;
    }

    
    /** 
     * @param misEventos lista de eventos que tendra el usuario
     * @return Builder los eventos del usuario
     */ 
    @Override
    public Builder misEventos(ArrayList<Evento> misEventos) {
        this.eventos = misEventos;
        return this;
    }
}
