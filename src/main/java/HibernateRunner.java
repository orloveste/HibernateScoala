import org.hibernate.Session;

public class HibernateRunner {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Note newNote = new Note();
        System.out.println(newNote);
        newNote.idElev = 10;
        System.out.println(newNote);
        newNote.idPredare = 3;
        System.out.println(newNote);
        newNote.valoareNota = 9;
        System.out.println(newNote);
        session.save(newNote);
        System.out.println(newNote);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
 /* Materii materiiFind = session.find(Materii.class, 5);
        System.out.println(materiiFind);*/ //find Materii by id
   /*Elevi elev = session.find(Elevi.class, 5);
        System.out.println(elev);*/ //find elev by id
/*Clasa newClasa = new Clasa();
        System.out.println(newClasa);
        newClasa.numeClasa = "test run";
        System.out.println(newClasa);
        session.save(newClasa);
        System.out.println(newClasa);*/ //add new entry in class