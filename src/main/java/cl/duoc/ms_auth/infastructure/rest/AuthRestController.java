package cl.duoc.ms_auth.infastructure.rest;

import cl.duoc.ms_auth.infastructure.dtos.wrapper.WrapperResponse;
import cl.duoc.ms_auth.infastructure.dtos.auth.LoginRequest;
import cl.duoc.ms_auth.infastructure.dtos.auth.LoginResponse;
import cl.duoc.ms_auth.services.auth.IAuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class AuthRestController {
    private final IAuthService service;

    @PostMapping("/login")
    public WrapperResponse<LoginResponse> login (@Valid @RequestBody LoginRequest request){
        log.info("Solicitud de login");
        LoginResponse response = service.login(request);
        return new WrapperResponse<>(response);
    }
}
