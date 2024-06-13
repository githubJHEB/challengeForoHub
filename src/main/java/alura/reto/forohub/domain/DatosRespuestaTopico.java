package alura.reto.forohub.domain;

public record DatosRespuestaTopico(
        Long Id,
        String titulo,
        String mensaje,
        String fechacreacion,
        String status,
        String autor,
        String curso
) {
}
