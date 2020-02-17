import org.hibernate.Session;

import java.util.List;

public class ClasaService {
    ElevService elevService = ElevService.getInstance();

    private static ClasaService instance;
    private ClasaService(){

    }
    public static ClasaService getInstance(){
        if (instance == null){
            instance = new ClasaService();
        }return  instance;
    }

    public List<Clasa> getElevByIdClasa(Integer idElev){
        Elevi elevi = elevService.getElev(idElev);
        return  elevi.eleviListByClasa;
    }

    public Clasa getClasa(Integer idClasa){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Clasa clasa = session.find(Clasa.class, idClasa);
            return  clasa;
        }catch (Exception exGetClasa){
            exGetClasa.printStackTrace();
            return  null;
        }
    }
}
