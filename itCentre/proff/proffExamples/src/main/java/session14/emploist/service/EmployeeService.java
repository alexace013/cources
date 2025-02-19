package session14.emploist.service;



import session14.emploist.domain.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 25.05.13
 */
public interface EmployeeService {
    List<Employee> getAllUsers();
    void addNewUser(Employee user);
}
