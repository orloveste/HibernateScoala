import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Entity
public class Elevi  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idElev;
    String numeElev;

    Integer idClasa;

    //todo one2many to clasa
    @OneToMany (mappedBy = "idClasa")
    List<Clasa> eleviListByClasa;
//    @OneToMany
//    @JoinColumn (name = "idClasa")
//    Clasa idClasaFromElevi;
    /*@ManyToOne
    @JoinColumn (name = "idClasa")
    Clasa idClasaFromElevi;*/

    @Override
    public String toString() {
        return "Elevi{" +
                "idElev=" + idElev +
                ", numeElev='" + numeElev + '\'' +
                ", idClasa=" + idClasa +
                ", eleviListByClasa=" + eleviListByClasa +
                '}';
    }
}
