package ms.Escuela.controller;

import ms.Escuela.entity.Estudiantes;
import ms.Escuela.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
    @Autowired
    EstudiantesService estudiantesService;

    @PostMapping("/guardarEstudiantes")
    public Estudiantes guardarEstudiantes(@RequestBody Estudiantes estudiantes){
        return estudiantesService.guardarEstudiante(estudiantes);
    }
}
