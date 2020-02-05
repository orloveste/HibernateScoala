import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfesoriMaterie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idPredare;
    Integer idProfesor;
    Integer idMaterie;

    @Override
    public String toString() {
        return "joinProfesoriMaterie{" +
                "idPredare=" + idPredare +
                ", idProfesor=" + idProfesor +
                ", idMaterie=" + idMaterie +
                '}';
    }
}
