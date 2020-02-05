import org.hibernate.Session;

public class HibernateRunner {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        //Clasa clasa = session.find(Clasa.class,1);
        //System.out.println("print"+ clasa);

        Clasa newClasa = new Clasa();
        System.out.println(newClasa);
        newClasa.numeClasa = "test de legatura runner";
        System.out.println(newClasa);
        session.save(newClasa);
        System.out.println(newClasa);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}

