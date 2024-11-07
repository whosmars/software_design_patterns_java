import java.util.LinkedList;
import java.util.ArrayList;

public class UsuarioBuilder extends Builder {

    public UsuarioBuilder(String nombreUsuario,String bandeja, String email, String contrasena, 
       String numeroCuenta, String facultad) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.bandeja = bandeja;
        this.contrasena = contrasena;
        this.numeroCuenta = numeroCuenta;
        this.facultad = facultad;
        this.tipoUsuario = false;
        this.eventos = new ArrayList<>();
        this.misEventos = null;
    }

    
    /** 
     * @return Usuario usuario que se creara
     */
    @Override
    public Usuario build() {
        return new Usuario(this);
    }

    
    /** 
     * @param nombreUsuario nombre del usuario
     * @return UsuarioBuilder usuario
     */
    @Override
    public UsuarioBuilder nombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }



    
    /** 
     * @param bandeja bandeja del usuario
     * @return UsuarioBuilder usuario
     */
    @Override
    public UsuarioBuilder bandeja(String bandeja) {
        this.bandeja = bandeja;
        return this;
    }

    
    /** 
     * @param email email del usuario
     * @return UsuarioBuilder usuario
     */
    @Override
    public UsuarioBuilder email(String email) {
        this.email = email;
        return this;
    }

    
    /** 
     * @param contrasena contrasena del usuario
     * @return UsuarioBuilder usuario
     */
    @Override
    public UsuarioBuilder contrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    
    /** 
     * @param numeroCuenta numero de cuenta del usuario
     * @return UsuarioBuilder usuario
     */
    @Override
    public UsuarioBuilder numeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        return this;
    }

    
    /** 
     * @param facultad facultad del usuario
     * @return UsuarioBuilder usuario
     */
    @Override
    public UsuarioBuilder facultad(String facultad) {
        this.facultad = facultad;
        return this;
    }

    
    /** 
     * @param eventos eventos del usuario
     * @return UsuarioBuilder usuario
     */
    @Override
    public UsuarioBuilder eventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
        return this;
    }

    
    /** 
     * @param misEventos eventos del usuario
     * @return UsuarioBuilder usuario
     */
    @Override
    public UsuarioBuilder misEventos(ArrayList<Evento> misEventos) {
        this.eventos = misEventos;
        return this;
    }
}

