package session14.emploist.dao;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import session14.emploist.domain.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 18.05.13
 */
@Repository
public class EmployeeHibernateDaoImpl implements EmployeeDao {
    private static Logger log = Logger.getLogger(EmployeeHibernateDaoImpl.class);
    private SessionFactory factory;

    @Autowired
    public EmployeeHibernateDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Employee user) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            log.error("Transaction failed");
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public Employee read(Long id) {
        return null;
    }

    @Override
    public void update(Employee client) {

    }

    @Override
    public void delete(Employee client) {

    }

    @Override
    public List<Employee> findAll() {
        Session session = factory.openSession();
        return session.createCriteria(Employee.class).list();
    }

    @Override
    public List<Employee> findMonyGT(long amount) {
        return null;
    }
}
