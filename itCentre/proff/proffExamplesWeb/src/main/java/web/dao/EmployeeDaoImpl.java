package web.dao;

import org.hibernate.criterion.Restrictions;
import web.domain.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 3/16/15
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public List<Employee> findAll() {
        Session session = factory.getCurrentSession();
        return session.createCriteria(Employee.class).list();
        //return new ArrayList<Employee>(Arrays.asList(new Employee("Petro"), new Employee("Sidor")));
    }

    @Override
    public Employee findByLoginMail(String login, String email) {
        Session session = factory.getCurrentSession();
        return (Employee) session.createCriteria(Employee.class)
                .add(Restrictions.eq("firstName", login))
                .add(Restrictions.eq("email", email))
                .uniqueResult();
        //return new ArrayList<Employee>(Arrays.asList(new Employee("Petro"), new Employee("Sidor")));
    }
}
