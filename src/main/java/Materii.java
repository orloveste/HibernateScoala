import javax.persistence.*;

@Entity
public class Materii {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Integer idMaterie;
    String numeMaterie;

    @ManyToOne
    @JoinColumn (name = "idMaterie")
    ProfesoriMaterie idMaterieFromProfesorMaterie;

    @Override
    public String toString() {
        return "Materii{" +
                "numeMaterie='" + numeMaterie + '\'' +
                ", idMaterieFromProfesorMaterie=" + idMaterieFromProfesorMaterie.idMaterie +
                '}';
    }
}
