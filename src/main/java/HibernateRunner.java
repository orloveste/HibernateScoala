import org.hibernate.Session;

import java.util.Random;

public class HibernateRunner {
    public static void main(String[] args) {
        System.out.println("^^^^^^^^^^^^^start code^^^^^^^^^^^^^");
        ElevService elevService = ElevService.getInstance();
        Elevi eleviFromClasa = elevService.getElevByIdClasa(1); //todo exception
        //java.lang.IllegalArgumentException: Provided id of the wrong type for class Clasa. Expected: class java.lang.String, got class java.lang.Integer
        //	at org.hibernate.internal.SessionImpl.find(SessionImpl.java:3531)
        //	at org.hibernate.internal.SessionImpl.find(SessionImpl.java:3474)
        //	at ClasaService.getClasa(ClasaService.java:16)
        //	at ElevService.getElevByIdClasa(ElevService.java:21)
        //	at HibernateRunner.main(HibernateRunner.java:9)
        System.out.println("Elev by id: "+ eleviFromClasa);

        System.out.println("*********second start*********");
        ProfesoriMaterieService profesoriMaterieService = ProfesoriMaterieService.getInstance();
        ProfesoriMaterie note = profesoriMaterieService.getProfesorMaterieFromNote(3);
        System.out.println("Ce ne da id nota?: "+ note);

        HibernateUtil.shutdown();
    }
}

/*ProfesoriMaterieService profesoriMaterieService = ProfesoriMaterieService.getInstance();
        ProfesoriMaterie note = profesoriMaterieService.getProfesorMaterieFromNote(3);
        System.out.println("Ce ne da id nota?: "+ note);*/ // find prof and materie by id nota
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