import javax.persistence.*;
import java.util.List;

@Entity
public class ProfesoriMaterie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idPredare;
    Integer idProfesor;
    Integer idMaterie;
    /*@OneToMany(mappedBy = "idPredarePentruNota")
    List<Note> profesoriMaterieListByNote;*/
    //todo manyToOne many idPredate from idNota or something

    //todo rebuild toString
    /*@Override
    public String toString() {
        return "ProfesoriMaterie{" +
                "idPredare=" + idPredare +
                ", idProfesor=" + idProfesor +
                ", idMaterie=" + idMaterie +
                ", profesoriMaterieList=" + profesoriMaterieListByNote +
                '}';
    }*/
}
