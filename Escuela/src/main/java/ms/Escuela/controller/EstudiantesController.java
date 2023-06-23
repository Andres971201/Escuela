package ms.Escuela.controller;

import ms.Escuela.entity.Asignaturas;
import ms.Escuela.entity.Estudiantes;
import ms.Escuela.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
    @Autowired
    EstudiantesService estudiantesService;

    @PostMapping("/guardarEstudiantes")
    public Estudiantes guardarEstudiantes(@RequestBody Estudiantes estudiantes){
        return estudiantesService.guardarEstudiante(estudiantes);
    }

    @GetMapping("/buscarEstudiantes")
    public List<Estudiantes> buscarAsignaturas(){
        return estudiantesService.buscarEstudiantes();
    }

    @GetMapping("/buscarId/{id}")
    public Optional<Estudiantes> buscarId(@PathVariable Long id){
        return estudiantesService.buscarId(id);
    }

    @GetMapping("/actualizar")
    public Estudiantes  actualizarEstudiante(@RequestBody Estudiantes estudiantes){
        return estudiantesService.actualizarEstudiantes(estudiantes);

    }

    @DeleteMapping("/eliminar")
    public void eliminarEstudiante(@PathVariable Long id ){
        estudiantesService.eliminarEstudiante(id);
    }

    @GetMapping("/promedioByGrado/{grados}")
   public String promedioByGrado(@PathVariable String grados) {

        return estudiantesService.promedioByGrado(grados);
    }

}