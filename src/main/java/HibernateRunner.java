import org.hibernate.Session;

import java.util.List;
import java.util.Random;

public class HibernateRunner {
    public static void main(String[] args) {
        ElevService elevService = ElevService.getInstance();
        ClasaService clasaService = ClasaService.getInstance();
        List<Elevi> eleviDinClasa = clasaService.getClasa("10A");
        System.out.println(eleviDinClasa);





        HibernateUtil.shutdown();
    }
}

/*ElevService elevService = ElevService.getInstance();
        System.out.println(elevService);

        Elevi elev = elevService.getElev(1);
        System.out.println(elev);

        Elevi elevNou = new Elevi();
        System.out.println(elevNou);
        elevNou.numeElev = "Bunu' Samaritean" *//*+ new Random().nextInt(7)*//*;
        System.out.println(elevNou);
        elevNou.idClasa = 3;
        System.out.println(elevNou);
        elevService.createElev(elevNou);
        System.out.println(elevNou);*/ //precedent task
/*Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();



        session.getTransaction().commit();
        HibernateUtil.shutdown();*/ // base for downCode
    /*ProfesoriMaterie newJoinProfesoriMaterie = new ProfesoriMaterie();
        System.out.println(newJoinProfesoriMaterie);
                newJoinProfesoriMaterie.idMaterie = 3;
                System.out.println(newJoinProfesoriMaterie);
                newJoinProfesoriMaterie.idProfesor = 6;
                System.out.println(newJoinProfesoriMaterie);
                session.save(newJoinProfesoriMaterie);
                System.out.println(newJoinProfesoriMaterie);*/ //add newJoinProfesoriMaterie
/*Profesori newProfesor = new Profesori();
        System.out.println(newProfesor);
        newProfesor.numeProfesor = "Barabula Nica";
        System.out.println(newProfesor);
        session.save(newProfesor);
        System.out.println(newProfesor);*/ //add new Profesor
 /*Note newNote = new Note();
        System.out.println(newNote);
        newNote.idElev = 10;
        System.out.println(newNote);
        newNote.idPredare = 3;
        System.out.println(newNote);
        newNote.valoareNota = 9;
        System.out.println(newNote);
        session.save(newNote);
        System.out.println(newNote);*/ //add new note to idElev and idPredare
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