import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

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
    // afiseze nota cea mai mare dintr-o clasa.
    public List<Elevi> getAllElevi(Integer idClasa){

        //select e.idElev, max(n.valoareNota) as maxNota from clasa join elevi e on clasa.idClasa = e.idClasa join note n on e.idElev = n.idElev
        //where clasa.idClasa = 1 group by e.idElev order by maxNota desc limit 1;
        String hql = "select e.numeElev, max(n.valoareNota) as maxNota " +
                "from Clasa c join c.elevi e join e.note n where c.idClasa = :idClasa " +//todo Nu face legatura cu sql
                "group by e order by maxNota desc";
        ;        Query query = HibernateUtil.getSessionFactory().openSession().createQuery(hql);
        ((Query) query).setParameter("idClasa", idClasa);
        query.setMaxResults(1);


        List<Elevi> elev =  query.list();


        System.out.println(elev);
        return elev;
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
