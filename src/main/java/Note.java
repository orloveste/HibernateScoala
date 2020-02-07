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

     @OneToMany(mappedBy = "idPredareFromNota")
     List<ProfesoriMaterie> idProfesoriMaterieListByNote;

    @Override
    public String toString() {
        return "Note{" +
                "idNota=" + idNota +
                ", valoareNota=" + valoareNota +
                ", idElev=" + idElev +
                ", idPredare=" + idPredare +
                ", profesoriMaterieListByNote=" + idProfesoriMaterieListByNote +
                '}';
    }
}
