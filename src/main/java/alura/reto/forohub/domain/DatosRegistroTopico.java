package alura.reto.forohub.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}")
        String fechacreacion,
        @NotBlank
        String status,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {

}
