package ms.Escuela.repository;

import ms.Escuela.entity.Calificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalificacionesRepository extends JpaRepository<Calificaciones,Long> {

}
