import javax.persistence.*;
import java.util.List;

@Entity
public class ProfesoriMaterie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idPredare;
    Integer idProfesor;
    Integer idMaterie;

    @OneToMany (mappedBy = "idProfesorFromProfesorMaterie")
    List<Profesori> profesoriListByProfesoriMaterie;

    @OneToMany (mappedBy = "idMaterieFromProfesorMaterie")
    List<Materii> materiiListByProfesoriMaterii;

    @Override
    public String toString() {
        return "ProfesoriMaterie{" +
                "idPredare=" + idPredare +
                ", idProfesor=" + idProfesor +
                ", idMaterie=" + idMaterie +
                ", profesoriListByProfesoriMaterie=" + profesoriListByProfesoriMaterie +
                ", materiiListByProfesoriMaterii=" + materiiListByProfesoriMaterii +
                '}';
    }


}
