import javax.persistence.*;
import java.util.List;

@Entity
public class ProfesoriMaterie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*Integer idPredare;*/ //ManyToOne from Note
    Integer idProfesor;
    Integer idMaterie;

    //todo manyToMany note profesoriMaterie
    @ManyToOne
    @JoinColumn (name = "idPredare")
    Note idPredareFromNota;

    @OneToMany (mappedBy = "idProfesorFromProfesorMaterie")
    List<Profesori> profesoriListByProfesoriMaterie;


    @Override
    public String toString() {
        return "ProfesoriMaterie{" +
                "idProfesor=" + idProfesor +
                ", idMaterie=" + idMaterie +
                ", idPredarePentruNota=" + idPredareFromNota.idPredare +
                '}';
    }
}
