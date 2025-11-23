package cl.duoc.ms_auth.domain.exceptions;

public class InvalidCredentialException extends RuntimeException {
    public InvalidCredentialException() {
        super("Credenciales incorrectas");
    }
}
