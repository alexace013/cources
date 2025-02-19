package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.domain.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 17.03.15
 */
public interface EmployeeService {
    List<Employee> findAll();

    @Transactional(readOnly = true)
    Employee findByLoginMail(String login, String email);
}
