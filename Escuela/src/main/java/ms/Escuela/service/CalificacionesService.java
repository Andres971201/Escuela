package ms.Escuela.service;

import ms.Escuela.entity.Calificaciones;
import ms.Escuela.entity.Profesores;
import ms.Escuela.repository.CalificacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionesService {
    @Autowired
    CalificacionesRepository calificacionesRepository;

    public Calificaciones guardarCalificaciones(Calificaciones calificaciones){
        return calificacionesRepository.save(calificaciones);
    }

    public List<Calificaciones> buscarCalificaciones(){
        return calificacionesRepository.findAll();
    }

    public Optional<Calificaciones> buscarById(Long id){
        return calificacionesRepository.findById(id);
    }

    public Calificaciones editarCalificacion(Calificaciones calificaciones){
        Optional<Calificaciones> artOpt=calificacionesRepository.findById(calificaciones.getId());
        if(artOpt.isPresent()){
            return calificacionesRepository.save(calificaciones);
        }else{
            return null;
        }

    }
    public String eliminarcalificacion(Long id) {
        Optional<Calificaciones> calificaciones = calificacionesRepository.findById(id);
        if (calificaciones.isPresent()) {
            calificacionesRepository.deleteById(id);
            return "La calificacion con ID " + id + " ha sido eliminado exitosamente.";
        } else {
            return "No se encontró la calificacion con ID " + id + ".";
        }

    }
}
