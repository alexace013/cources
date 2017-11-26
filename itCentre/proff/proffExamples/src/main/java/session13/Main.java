package session13;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 27.09.14
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("session13/context.xml");

        SessionFactory sf = context.getBean("sf", SessionFactory.class);
        Session session = sf.openSession();

        session.createCriteria(Employee.class).list();

    }
}
