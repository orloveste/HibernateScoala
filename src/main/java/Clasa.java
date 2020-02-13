import org.hibernate.annotations.LazyToOne;

import javax.persistence.*;
import java.util.List;

@Entity
public class Clasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idClasa;
    String numeClasa;

    @ManyToOne
    @JoinColumn (name = "idClasa")
    Elevi eleviFromIdClasa;

//    @OneToMany (mappedBy = "idElev")
//    List<Elevi> eleviListByClasa;

    @Override
    public String toString() {
        return "Clasa{" +
                "idClasa=" + idClasa +
                ", numeClasa='" + numeClasa + '\'' +
                '}';
    }
}
