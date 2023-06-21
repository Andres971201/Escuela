package ms.Escuela.entity;

import javax.persistence.*;

@Entity
@Table(name = "asignaturas")
public class Asignaturas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombres;

    @Column(name = "profesor_id")
    private Long profesorId;

    public Asignaturas() {
    }

    public Asignaturas(Long id, String nombres, Long profesorId) {
        this.id = id;
        this.nombres = nombres;
        this.profesorId = profesorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Long getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(Long profesorId) {
        this.profesorId = profesorId;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", profesorId=" + profesorId +
                '}';
    }
}

