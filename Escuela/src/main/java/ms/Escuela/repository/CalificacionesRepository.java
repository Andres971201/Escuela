package ms.Escuela.repository;

import ms.Escuela.entity.Calificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalificacionesRepository extends JpaRepository<Calificaciones,Long> {

    List<Calificaciones> findByAsignaturaId(Long idAsinatura);

    List<Calificaciones> findByEstudianteId(Long estudianteId);
}
