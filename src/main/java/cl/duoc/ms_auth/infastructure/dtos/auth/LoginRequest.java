package cl.duoc.ms_auth.infastructure.dtos.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(
        @NotBlank
        String username,
        @NotBlank
        @Size(min = 5, max = 15)
        String password
) {
}
