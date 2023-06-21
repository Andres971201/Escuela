package ms.Escuela.service;

import ms.Escuela.entity.Asignaturas;
import ms.Escuela.entity.Calificaciones;
import ms.Escuela.entity.Profesores;
import ms.Escuela.repository.CalificacionesRepository;
import ms.Escuela.repository.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesoresService {
    @Autowired
    ProfesoresRepository profesoresRepository;
    @Autowired
    CalificacionesRepository calificacionesRepository;

    public Profesores guardarProfesores(Profesores profesores){
        return profesoresRepository.save(profesores);
    }

    public List<Profesores> buscarprofesores(){
        return profesoresRepository.findAll();
    }

    public Optional<Profesores> buscarById(Long id){
          return profesoresRepository.findById(id);
    }

    public Profesores editarProfesor(Profesores profesores){
        Optional<Profesores> artOpt=profesoresRepository.findById(profesores.getId());
        if(artOpt.isPresent()){
            return profesoresRepository.save(profesores);
        }else{
            return null;
        }

    }
    public String eliminarProfesor(Long id) {
        Optional<Profesores> profesores = profesoresRepository.findById(id);
        if (profesores.isPresent()) {
            profesoresRepository.deleteById(id);
            return "El profesor con ID " + id + " ha sido eliminado exitosamente.";
        } else {
            return "No se encontró un profesor con ID " + id + ".";
        }
    }
    public String promedioByProfesor(Long id){
          Optional<Profesores> cIfPexist=profesoresRepository.findById(id);
          if(cIfPexist.isPresent()){
              Long idAsinatura=cIfPexist.get().getId();
              List<Calificaciones> listcali=calificacionesRepository.findByAsignaturaId(idAsinatura);
              for (Calificaciones calificaciones:listcali) {
                 Double calificacion=calificaciones.getCalificacion();
              }
              return ""+cal+"";
          }else {
              return null;
          }
    }
}
