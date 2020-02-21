import org.hibernate.Session;

import java.util.Random;

public class HibernateRunner {
    public static void main(String[] args) {
        ElevService elevService = ElevService.getInstance();
        elevService.getAllElevi(1);

        HibernateUtil.shutdown();
    }
}