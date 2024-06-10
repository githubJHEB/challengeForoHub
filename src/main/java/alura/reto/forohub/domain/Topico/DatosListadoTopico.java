package alura.reto.forohub.domain.Topico;

public record DatosListadoTopico(Long id, String titulo, String mensaje, String fechacreacion, String status, String autor, String curso) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechacreacion(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso());
    }
}
