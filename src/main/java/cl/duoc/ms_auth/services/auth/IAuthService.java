package cl.duoc.ms_auth.services.auth;

import cl.duoc.ms_auth.infastructure.dtos.auth.LoginRequest;
import cl.duoc.ms_auth.infastructure.dtos.auth.LoginResponse;

public interface IAuthService {
    LoginResponse login (LoginRequest request);
}
