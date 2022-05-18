package pro.sky.profjd5_0envhw9.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.profjd5_0envhw9.data.Employee;
import pro.sky.profjd5_0envhw9.services.EmployeeService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam("firstName") String firstName,
                        @RequestParam("lastName") String lastName,
                        @RequestParam("salary") Integer salary,
                        @RequestParam("department") Integer department) {
        return employeeService.add(firstName, lastName, salary, department);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("salary") Integer salary,
                           @RequestParam("department") Integer department) {
        return employeeService.remove(firstName, lastName, salary, department);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam("firstName") String firstName,
                         @RequestParam("lastName") String lastName,
                         @RequestParam("salary") Integer salary,
                         @RequestParam("department") Integer department) {
        return employeeService.find(firstName, lastName, salary, department);
    }

    @GetMapping("/list")
    public Map<String, Employee> showListOfEmployee() {
        return employeeService.showListOfEmployee();
    }
}
