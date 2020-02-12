import javax.persistence.*;
import java.util.List;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idNota;
    Integer valoareNota;
    Integer idElev;

//    Integer idPredare;
    @ManyToOne
    @JoinColumn (name = "idPredare")
    ProfesoriMaterie idPredareFromNote;

    @Override
    public String toString() {
        return "Note{" +
                "idNota=" + idNota +
                ", valoareNota=" + valoareNota +
                ", idElev=" + idElev +
                ", idPredareFromNote=" + idPredareFromNote.idProfesor +
                ", idPredareFromNote=" + idPredareFromNote.idMaterie +
                '}';
    }
//     @OneToMany(mappedBy = "idPredareFromNota")
//     List<ProfesoriMaterie> idProfesoriMaterieListByNote;

}
