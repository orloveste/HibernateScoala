import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProfesoriMaterieService {
    private NoteService noteService = NoteService.getInstance();
    private static ProfesoriMaterieService instance;
    private ProfesoriMaterieService(){

    }

    public static ProfesoriMaterieService getInstance() {
        if (instance ==null){
            instance = new ProfesoriMaterieService();
        }
        return instance;
    }

    public List<ProfesoriMaterie> getProfesoriMaterieByNote(Integer valoareNote){
        Note note = noteService.getNota(valoareNote);
        return note.idProfesoriMaterieListByNote;
    }
    /*public List<ProfesoriMaterie> getIdPredarebyValoareNote(Integer valoareNota){
      NoteService noteService = NoteService.getInstance();
      return noteService.profesoriMaterieListByNote;
  }*/ // de schimbat sintaxa un idNota sa scoata IdPredareInfo din PredareMaterie

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
