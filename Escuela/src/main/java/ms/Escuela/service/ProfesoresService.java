package ms.Escuela.service;

import ms.Escuela.entity.Profesores;
import ms.Escuela.repository.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesoresService {
    @Autowired
    ProfesoresRepository profesoresRepository;

    public Profesores guardarProfesores(Profesores profesores){
        return profesoresRepository.save(profesores);
    }
}
