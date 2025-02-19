package session14.emploist.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import session14.emploist.dao.EmployeeDao;
import session14.emploist.domain.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 4/7/13
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao userDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao dao) {
        userDao = dao;
    }

    @Override
    public List<Employee> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public void addNewUser(Employee user) {
        userDao.create(user);
    }
}
