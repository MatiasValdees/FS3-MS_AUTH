package cl.duoc.ms_auth.infastructure.dtos.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.List;

public record UserCreateRequest(
        @NotBlank
        String username,
        @Pattern(
                regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]+$",
                message = "La contraseña debe contener al menos una mayúscula, una minúscula, un número y un carácter especial"
        )
        String password,
        List<Long>rolesId
) {
}
