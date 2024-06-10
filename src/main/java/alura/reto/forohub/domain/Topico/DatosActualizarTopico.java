package alura.reto.forohub.domain.Topico;

public record DatosActualizarTopico(
        Long Id,
        String titulo,
        String mensaje,
        String fechacreacion,
        String status,
        String autor,
        String curso) {

}
