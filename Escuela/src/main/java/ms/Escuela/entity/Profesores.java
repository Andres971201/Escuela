package ms.Escuela.entity;

import javax.persistence.*;

@Entity
@Table(name = "profesores")
public class Profesores{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombres;
    @Column(name = "especialidad")
    private String especialidad;

    public Profesores() {
    }

    public Profesores(Long id, String nombres, String especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
