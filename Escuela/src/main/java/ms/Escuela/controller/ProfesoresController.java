package ms.Escuela.controller;

import ms.Escuela.entity.Profesores;
import ms.Escuela.service.ProfesoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profesores")
public class ProfesoresController {
    @Autowired
    ProfesoresService profesoresService;

    @PostMapping("/guardarProfesores")
    public Profesores guardarProfesores(@RequestBody Profesores profesores){
        return profesoresService.guardarProfesores(profesores);
    }
    @GetMapping("/buscarProfesores")
    public List<Profesores> buscarProfesores(){
        return profesoresService.buscarprofesores();
    }
    @GetMapping("/buscaId/{id}")
    public Optional<Profesores> buscarById(@PathVariable Long id){
        return profesoresService.buscarById(id);
    }

    @PutMapping("/actualizar")
    public Profesores editarProfesor(@RequestBody Profesores profesores){
        return profesoresService.editarProfesor(profesores);
    }
    @DeleteMapping("/eliminar/{id}")
    public String eliminarProfesor(@PathVariable Long id) {
        return profesoresService.eliminarProfesor(id);
    }
    @GetMapping("/promedioByProfesor/{id}")
    public String promedioAlumnosByProfesor(@PathVariable Long id){

        return profesoresService.promedioByProfesor(id);
    }
}
