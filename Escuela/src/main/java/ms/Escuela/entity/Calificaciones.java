package ms.Escuela.entity;

import javax.persistence.*;

@Entity
@Table(name = "calificaciones")
public class Calificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "estudiante_id")
    private Long estudianteId;
    @Column(name = "asignatura_id")
    private Long asignaturaId;
    @Column(name = "calificacion")
    private Double calificacion;

    public Calificaciones() {
    }

    public Calificaciones(Long id, Long estudianteId, Long asignaturaId, Double calificacion) {
        this.id = id;
        this.estudianteId = estudianteId;
        this.asignaturaId = asignaturaId;
        this.calificacion = calificacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Long estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Long getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(Long asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Calificaciones{" +
                "id=" + id +
                ", estudianteId=" + estudianteId +
                ", asignaturaId=" + asignaturaId +
                ", calificacion=" + calificacion +
                '}';
    }
}
