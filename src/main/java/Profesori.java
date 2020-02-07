import javax.persistence.*;

@Entity
public class Profesori {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*Integer idProfesor;*/ // ManyToOne from ProfesoriMaterie
    String numeProfesor;

    @ManyToOne
    @JoinColumn (name = "idProfesor")
    ProfesoriMaterie idProfesorFromProfesorMaterie;

    @Override
    public String toString() {
        return "Profesori{" +
                "numeProfesor='" + numeProfesor + '\'' +
                ", idProfesorFromProfesorMaterie=" + idProfesorFromProfesorMaterie.idProfesor +
                '}';
    }
}
