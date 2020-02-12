import org.hibernate.Session;

import java.util.List;

public class ClasaService {
    private static ClasaService instance;
    private ClasaService(){

    }
    public static ClasaService getInstance(){
        if (instance == null){
            instance = new ClasaService();
        }return  instance;
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

    public List<Elevi> getClasa(String numeClasa) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Clasa clasa = session.find(Clasa.class, numeClasa);
            return  clasa.eleviListByClasa;
        }catch (Exception exGetClasa){
            exGetClasa.printStackTrace();
            return  null;
        }
    }
}
