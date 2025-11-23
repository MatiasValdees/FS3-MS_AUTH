package cl.duoc.ms_auth.domain.exceptions;

public class PasswordInvalidRegexException extends RuntimeException {
    public PasswordInvalidRegexException() {
        super("La contraseña debe tener entre 8 y 20 caracteres, incluir mayúsculas, minúsculas, números y caracteres especiales");
    }
}
