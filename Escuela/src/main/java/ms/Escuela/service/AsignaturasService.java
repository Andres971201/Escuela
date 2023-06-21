package ms.Escuela.service;
import ms.Escuela.entity.Asignaturas;
import ms.Escuela.repository.AsignaturasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturasService {
    @Autowired
    AsignaturasRepository asignaturasRepository;

    public Asignaturas guardarAsignatura(Asignaturas asignaturas) {
        return asignaturasRepository.save(asignaturas);
    }

    public List<Asignaturas> buscarAsignaturas() {
        return asignaturasRepository.findAll();
    }

    public Optional<Asignaturas> buscarId(Long id) {
        return asignaturasRepository.findById(id);
    }

    public Asignaturas actualizarAsignaturas(Asignaturas asignaturas) {
        Optional<Asignaturas> verificarAsignatura = asignaturasRepository.findById(asignaturas.getId());

        if (verificarAsignatura.isPresent()) {
            return asignaturasRepository.save(asignaturas);
        } else {
            return null;
        }
    }

    public void eliminarAsignaturas(Long id) {
        Optional<Asignaturas> confirmarEliminacion = asignaturasRepository.findById(id);
        if (confirmarEliminacion.isPresent()) {
            asignaturasRepository.deleteById(id);
        }
    }
}