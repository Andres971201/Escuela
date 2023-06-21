package ms.Escuela.controller;

import ms.Escuela.entity.Asignaturas;
import ms.Escuela.entity.Estudiantes;
import ms.Escuela.entity.Profesores;
import ms.Escuela.service.AsignaturasService;
import ms.Escuela.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asignatura")
public class AsignaturasController {
    @Autowired
    AsignaturasService asignaturasService;

    @PostMapping("/guardarAsignaturas")
    public Asignaturas guardarAsignaturas(@RequestBody Asignaturas asignaturas){
        return asignaturasService.guardarAsignatura(asignaturas);
    }

    @GetMapping("/buscarAsignaturas")
    public List<Asignaturas> buscarAsignaturas(){
        return asignaturasService.buscarAsignaturas();
    }

    @GetMapping("/buscarId/{id}")
    public Optional<Asignaturas> buscarId(@PathVariable Long id){
        return asignaturasService.buscarId(id);
    }

    @GetMapping("/actualizar")
    public Asignaturas  actualizarAsignatura(@RequestBody Asignaturas asignaturas){
        return asignaturasService.actualizarAsignaturas(asignaturas);

    }

    @DeleteMapping("/eliminar")
    public void eliminarAsignatura(@PathVariable Long id ){
        asignaturasService.eliminarAsignaturas(id);
    }
}
