import org.hibernate.Session;

public class ClasaService {
    private static ClasaService instance;
    private ClasaService(){

    }
    public static ClasaService getInstance(){
        if (instance == null){
            instance = new ClasaService();
        }return  instance;
    }
    public static Clasa getClasa(Integer idClasa){
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
