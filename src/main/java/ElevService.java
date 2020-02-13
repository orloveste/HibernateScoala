import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ElevService {
    ClasaService clasaService = ClasaService.getInstance();

    private static ElevService instance;
    private ElevService(){

    }

    public static ElevService getInstance() {
        if (instance == null) {
            instance = new ElevService();
        }
        return instance;
    }
    //todo review after remake elevi and clasa
    public Elevi getElevByIdClasa(Integer idClasa){
        Clasa clasa = clasaService.getClasa(idClasa);
        return clasa.eleviFromIdClasa;
    }

//    public List<Elevi> getEleviFromClasa (String numeClasa){
//        Clasa clasa = (Clasa) clasaService.getClasa();
//        return (List<Elevi>) clasa.eleviFromIdClasa;
//    }

    public Elevi getElev(Integer id){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Elevi elev = session.find(Elevi.class, id);
            return elev;
        }catch (Exception exGetElev){
            exGetElev.printStackTrace();
            return null;
        }
    }
    public void createElev(String newElev){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.save(newElev);

            transaction.commit();
            session.close();
        }catch (Exception exCreateElev){
            if (transaction != null){
                transaction.rollback();
            }exCreateElev.printStackTrace();
        }
    }
}
