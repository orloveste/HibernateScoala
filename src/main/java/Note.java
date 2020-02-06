import javax.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idNota;
    Integer valoareNota;
    Integer idElev;
    /*Integer idPredare;*/ //rebuild for map

    /*@ManyToOne
    @JoinColumn (name = "idPredare")
    ProfesoriMaterie idPredarePentruNota;*/
    //todo one to many idNota-idPredare

    //todo rebuild toString
    /*@Override
    public String toString() {
        return "Note{" +
                "idNota=" + idNota +
                ", valoareNota=" + valoareNota +
                ", idElev=" + idElev +
                ", idPredarePentruNota=" + idPredarePentruNota.idPredare +
                '}';
    }*/
}
