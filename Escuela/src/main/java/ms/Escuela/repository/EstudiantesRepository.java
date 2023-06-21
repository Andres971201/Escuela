package ms.Escuela.repository;

import ms.Escuela.entity.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EstudiantesRepository extends JpaRepository <Estudiantes, Long>{


    List<Estudiantes> findByGrados(String grados);
}
