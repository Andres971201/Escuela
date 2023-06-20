package ms.Escuela.controller;

import ms.Escuela.entity.Profesores;
import ms.Escuela.service.ProfesoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profesores")
public class ProfesoresController {
    @Autowired
    ProfesoresService profesoresService;

    @PostMapping("/guardarProfesores")
    public Profesores guardarProfesores(@RequestBody Profesores profesores){
        return profesoresService.guardarProfesores(profesores);
    }

}
