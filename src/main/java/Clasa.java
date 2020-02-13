import org.hibernate.annotations.LazyToOne;

import javax.persistence.*;
import java.util.List;

@Entity
public class Clasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Integer idClasa;
    String numeClasa;

    @ManyToOne
    @JoinColumn (name = "idClasa")
    Elevi eleviFromIdClasa;

    @Override
    public String toString() {
        return "Clasa{" +
                "numeClasa='" + numeClasa + '\'' +
                ", eleviFromIdClasa=" + eleviFromIdClasa +
                '}';
    }
//    @OneToMany (mappedBy = "idElev")
//    List<Elevi> eleviListByClasa;

}
