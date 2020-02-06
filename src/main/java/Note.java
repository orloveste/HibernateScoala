import javax.persistence.*;
import java.util.List;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idNota;
    Integer valoareNota;
    Integer idElev;
    Integer idPredare;

     @OneToMany(mappedBy = "idPredarePentruNota")
     List<ProfesoriMaterie> profesoriMaterieListByNote;

    @Override
    public String toString() {
        return "Note{" +
                "idNota=" + idNota +
                ", valoareNota=" + valoareNota +
                ", idElev=" + idElev +
                ", idPredare=" + idPredare +
                ", profesoriMaterieListByNote=" + profesoriMaterieListByNote +
                '}';
    }
}
