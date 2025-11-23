package cl.duoc.ms_auth.infastructure.dtos.auth;

import java.util.List;

public record LoginResponse(
        String username,
        List<String> roles
) {
}
