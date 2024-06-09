package alura.reto.forohub.controller;


import alura.reto.forohub.Topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/topico")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;
    @PostMapping
    public void RegistrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
        System.out.println(datosRegistroTopico);
        topicoRepository.save((new Topico(datosRegistroTopico)));
    }
    @GetMapping
    public Page<DatosListadoTopico> listadoTopics(@PageableDefault(size = 2) Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(DatosListadoTopico::new);
    }

    @GetMapping("/{id}")
    public Optional<Topico> getOneTopic(@PathVariable @Valid Long id){
        return topicoRepository.findById(id);
    }

    @PutMapping("/{id}")
    @Transactional
    public void actualizarUnTopico(@PathVariable @Valid Long id, @RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(id);
        topico.actualizarTopicos(datosActualizarTopico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        if(topico!=null) {
            topicoRepository.delete(topico);
        }
    }

}
