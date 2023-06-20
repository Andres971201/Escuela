package ms.Escuela.service;

import ms.Escuela.entity.Estudiantes;
import ms.Escuela.repository.EstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesService {
    @Autowired
    EstudiantesRepository estudiantesRepository;

    public Estudiantes guardarEstudiante(Estudiantes estudiantes){
        return estudiantesRepository.save(estudiantes);
    }

}
