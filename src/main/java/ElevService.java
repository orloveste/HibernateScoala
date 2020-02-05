import org.hibernate.Session;
import org.hibernate.Transaction;

public class ElevService {
    private static ElevService instance;
    private ElevService(){

    }

    public static ElevService getInstance() {
        if (instance == null) {
            instance = new ElevService();
        }
        return instance;
    }
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
    public void createElev(Elevi newElev){
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
