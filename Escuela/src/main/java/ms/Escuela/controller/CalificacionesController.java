package ms.Escuela.controller;

import ms.Escuela.entity.Calificaciones;
import ms.Escuela.entity.Profesores;
import ms.Escuela.service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionesController {
    @Autowired
    CalificacionesService calificacionesService;

    @PostMapping("/guardarCalificacion")
    public Calificaciones guardarCalificacion(@RequestBody Calificaciones calificaciones){
        return calificacionesService.guardarCalificaciones(calificaciones);
    }
    @GetMapping("/buscarProfesores")
    public List<Calificaciones> buscarCalificaciones(){
        return calificacionesService.buscarCalificaciones();
    }
    @GetMapping("/buscaId/{id}")
    public Optional<Calificaciones> buscarById(@PathVariable Long id){
        return calificacionesService.buscarById(id);
    }

    @PutMapping("/actualizar")
    public Calificaciones editarCalificacion(@RequestBody Calificaciones calificaciones){
        return calificacionesService.editarCalificacion(calificaciones);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarCalificacion(@PathVariable Long id) {
        return calificacionesService.eliminarcalificacion(id);
    }
}
