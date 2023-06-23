package ms.Escuela.service;

import ms.Escuela.entity.Asignaturas;
import ms.Escuela.entity.Calificaciones;
import ms.Escuela.entity.Estudiantes;
import ms.Escuela.entity.Profesores;
import ms.Escuela.repository.CalificacionesRepository;
import ms.Escuela.repository.EstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class EstudiantesService {
    @Autowired
    EstudiantesRepository estudiantesRepository;
    @Autowired
    CalificacionesRepository calificacionesRepository;

    public Estudiantes guardarEstudiante(Estudiantes estudiantes) {
        return estudiantesRepository.save(estudiantes);
    }

    public List<Estudiantes> buscarEstudiantes() {
        return estudiantesRepository.findAll();
    }

    public Optional<Estudiantes> buscarId(Long id) {
        return estudiantesRepository.findById(id);
    }

    public Estudiantes actualizarEstudiantes(Estudiantes estudiantes) {
        Optional<Estudiantes> verificarEstudiantes = estudiantesRepository.findById(estudiantes.getId());

        if (verificarEstudiantes.isPresent()) {
            return estudiantesRepository.save(estudiantes);
        } else {
            return null;
        }
    }

    public void eliminarEstudiante(Long id) {
        Optional<Estudiantes> confirmarEliminacion = estudiantesRepository.findById(id);
        if (confirmarEliminacion.isPresent()) {
            estudiantesRepository.deleteById(id);
        }
    }

    public String promedioByGrado(String grados) {
        List<Estudiantes> cIfPexist = estudiantesRepository.findByGrados(grados);
        List<Double> promediosIndividuales = new ArrayList<>();
        Double promedioGeneral = 0.0;

        if (cIfPexist != null) {
            for (Estudiantes estudiante : cIfPexist) {
                Long estudianteId = estudiante.getId();
                List<Calificaciones> calificaciones = calificacionesRepository.findByEstudianteId(estudianteId);
                Double sumaCalificaciones = 0.0;

                for (Calificaciones calificacion : calificaciones) {
                    sumaCalificaciones += calificacion.getCalificacion();
                }

                Double promedioEstudiante = calificaciones.isEmpty() ? 0.0 : sumaCalificaciones / calificaciones.size();
                promediosIndividuales.add(promedioEstudiante);
            }

            Double sumaPromedios = 0.0;
            for (Double promedio : promediosIndividuales) {
                sumaPromedios += promedio;
            }

            promedioGeneral = promediosIndividuales.isEmpty() ? 0.0 : sumaPromedios / promediosIndividuales.size();
        } else {
            return null;
        }

        return "El promedio del grupo " + grados + " es de " + promedioGeneral;
    }}