package alura.reto.forohub.Topico;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "forohub")
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechacreacion;
    private String status;
    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechacreacion = datosRegistroTopico.fechacreacion();
        this.status = datosRegistroTopico.status();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();

    }

    public void actualizarTopicos(DatosActualizarTopico datosActualizarTopico){
        if(datosActualizarTopico!=null) {
            if(datosActualizarTopico.titulo()!=null){
                this.titulo = datosActualizarTopico.titulo();
            }
            if(datosActualizarTopico.mensaje()!=null){
                this.mensaje = datosActualizarTopico.mensaje();
            }
            if(datosActualizarTopico.fechacreacion()!=null){
                this.fechacreacion = datosActualizarTopico.fechacreacion();
            }
            if(datosActualizarTopico.status()!=null){
                this.status = datosActualizarTopico.status();
            }
            if(datosActualizarTopico.autor()!=null){
                this.autor = datosActualizarTopico.autor();
            }
            if(datosActualizarTopico.curso()!=null){
                this.curso = datosActualizarTopico.curso();
            }
        }
    }
}
