import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idNota;
    Integer valoareNota;
    Integer idElev;
    Integer idPredare;

    @Override
    public String toString() {
        return "Note{" +
                "idNota=" + idNota +
                ", valoareNota=" + valoareNota +
                ", idElev=" + idElev +
                ", idPredare=" + idPredare +
                '}';
    }
}
