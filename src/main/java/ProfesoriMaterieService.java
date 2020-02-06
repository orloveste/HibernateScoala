import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProfesoriMaterieService {
    private static ProfesoriMaterieService instance;
    private ProfesoriMaterieService(){

    }

    public static ProfesoriMaterieService getInstance() {
        if (instance ==null){
            instance = new ProfesoriMaterieService();
        }
        return instance;
    }
    public ProfesoriMaterie getProfesorMaterie(Integer idPredare){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.find(ProfesoriMaterie.class, idPredare);
        }catch (Exception exGetProfesoriMaterie){
            exGetProfesoriMaterie.printStackTrace();
            return null;
        }
    }
    public void createProfesoriMaterie(ProfesoriMaterie profesoriMaterieNew){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(profesoriMaterieNew);
            transaction.commit();
        }catch (Exception exCreateProfesoriMaterie){
            if (transaction != null){
                transaction.rollback();
            }exCreateProfesoriMaterie.printStackTrace();
        }
    }
    public void updateProfesoriMaterie (ProfesoriMaterie profesoriMaterieUpdate){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(profesoriMaterieUpdate);
            transaction.commit();
        }catch (Exception exUpdateProfesoriMaterie){
            if (transaction != null){
                transaction.rollback();
            }exUpdateProfesoriMaterie.printStackTrace();
        }
    }
    public void deleteProfesoriMaterie(ProfesoriMaterie profesoriMaterieOld){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(profesoriMaterieOld);
            transaction.commit();
        }catch (Exception exDeleteProfesoriMaterie){
            if (transaction != null){
                transaction.rollback();
            }exDeleteProfesoriMaterie.printStackTrace();
        }
    }
}
