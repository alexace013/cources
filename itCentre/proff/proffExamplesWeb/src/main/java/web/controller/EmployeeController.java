package web.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import web.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import web.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 3/16/15
 */
@Controller
@SessionAttributes("name")
public class EmployeeController {
    public static final Logger log = Logger.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public @ResponseBody List<Employee> hello(Model model) {
        List<Employee> employees = employeeService.findAll();
//        model.addAttribute("employees", employees);
        return employees;
    }

    @RequestMapping(value = "/success.html", method = RequestMethod.GET)
    public String success(Model model) {
        log.info("/success.html controller");
        return "dashboard";
    }


    @RequestMapping(value = "/ajax", method = RequestMethod.GET)
    public @ResponseBody String success(@RequestParam String name, Model model) {
        log.info("/success.html controller");
        return name;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public @ResponseBody List<Employee> employee(Model model, @ModelAttribute String name,
                                    @RequestParam String login,
                                    @RequestParam String mail) {
        log.info("/employee controller");

//        if (name == null) {
//            if (employeeService.findByLoginMail(login, mail) != null) {
//                model.addAttribute("name", login);
//            } else {
//                return "index";
//            }
//        }
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("aaaa"));
        return list;
    }
}
