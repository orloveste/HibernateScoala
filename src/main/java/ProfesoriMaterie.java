import javax.persistence.*;
import java.util.List;

@Entity
public class ProfesoriMaterie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*Integer idPredare;*/ //ManyToOne
    Integer idProfesor;
    Integer idMaterie;

    @ManyToOne
    @JoinColumn (name = "idPredare")
    Note idPredarePentruNota;

    @Override
    public String toString() {
        return "ProfesoriMaterie{" +
                "idProfesor=" + idProfesor +
                ", idMaterie=" + idMaterie +
                ", idPredarePentruNota=" + idPredarePentruNota.idPredare +
                '}';
    }
}
