package session14.emploist.dao;



import session14.emploist.domain.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 4/7/13
 */
public interface EmployeeDao {
    void create(Employee user);
    Employee read(Long id);
    void update(Employee client);
    void delete(Employee client);
    List<Employee> findAll();
    List<Employee> findMonyGT(long amount);
}
