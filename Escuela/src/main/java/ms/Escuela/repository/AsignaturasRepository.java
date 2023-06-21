package ms.Escuela.repository;

import ms.Escuela.entity.Asignaturas;
import ms.Escuela.entity.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturasRepository extends JpaRepository<Asignaturas, Long> {


}
