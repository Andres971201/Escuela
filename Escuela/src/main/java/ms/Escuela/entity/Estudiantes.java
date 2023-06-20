package ms.Escuela.entity;

import javax.persistence.*;

@Entity
@Table (name = "estudiantes")
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String  nombres;

    @Column (name = "edad")
    private Integer  edades;

    @Column (name = "grado")
    private String grados;

    public Estudiantes() {
    }

    public Estudiantes(Long id, String nombres, Integer edades, String grados) {
        this.id = id;
        this.nombres = nombres;
        this.edades = edades;
        this.grados = grados;
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

    public Integer getEdades() {
        return edades;
    }

    public void setEdades(Integer edades) {
        this.edades = edades;
    }

    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados = grados;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", edades=" + edades +
                ", grados='" + grados + '\'' +
                '}';
    }
}
