import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class NoteService {

    private ProfesoriMaterieService profesoriMaterieService = ProfesoriMaterieService.getInstance();
    private static NoteService instance;
    public NoteService(){

    }

    public static NoteService getInstance() {
        if (instance == null){
            instance = new NoteService();
        }
        return instance;
    }

    public Note getNota(Note idNota){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.find(Note.class, idNota);
        }catch (Exception exGetNota){
            exGetNota.printStackTrace();
            return null;
        }
    }

    public  void createNota(Note nota){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(nota);
            transaction.commit();
        }catch (Exception exCreateNota){
            if (transaction != null){
                transaction.rollback();
            }exCreateNota.printStackTrace();
        }
    }
    public void updateNota (Note nota){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(nota);
            transaction.commit();
        }catch (Exception exUpdateNota){
            if (transaction!=null){
                transaction.rollback();
            }exUpdateNota.printStackTrace();
        }
    }


    public void deleteNota(Note nota){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(nota);
            transaction.commit();
        }catch (Exception exDeleteNota){
            if (transaction != null){
                transaction.rollback();
            }exDeleteNota.printStackTrace();
        }
    }
}
