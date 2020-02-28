import org.hibernate.annotations.LazyToOne;

import javax.persistence.*;
import java.util.List;

@Entity
public class Clasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idClasa;
//    @ManyToOne
//    @JoinColumn (name = "idClasa")
//    Elevi eleviFromIdClasa;
    //todo elevi si note pentru eleviService

    String numeClasa;

    @Override
    public String toString() {
        return "Clasa{" +
                "idClasa=" + idClasa +
                ", numeClasa='" + numeClasa + '\'' +
                '}';
    }
}


//    @OneToMany (mappedBy = "idElev")
//    List<Elevi> eleviListByClasa;