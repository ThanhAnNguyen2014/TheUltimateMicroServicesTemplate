package micro.usuarios.publico.services.interfaces;

import dto.main.Respuesta;
import modelo.auth.usuarios.publicos.UsuarioPublico;

public interface IEmailService {

    Respuesta<Boolean> registro(String[] correos, String[] bcc,String[] cc, String subject, UsuarioPublico usuario, String urlToSend);
    Respuesta<Boolean> cambiarPassword(String[] correos, String[] bcc,String[] cc, String subject, UsuarioPublico usuario, String passwordTemp);
     
    
}
