package pro.sky.profjd5_0envhw9.services;

import org.springframework.stereotype.Service;
import pro.sky.profjd5_0envhw9.data.Employee;
import pro.sky.profjd5_0envhw9.exeptions.EmployeeAlreadyAddedExeption;
import pro.sky.profjd5_0envhw9.exeptions.EmployeeNotFoundExeption;


import java.util.*;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }


    @Override
    public Employee add(String firstName, String lastName, Integer salary, Integer department) {
        Employee employee = new Employee(firstName, lastName, salary, department);
        if (employees.containsKey(getId(firstName, lastName, salary, department))) {
            throw new EmployeeAlreadyAddedExeption();
        } else {
            employees.put(getId(firstName, lastName, salary, department), employee);
        }
        return employee;
    }

    @Override
    public final String getId(String firstName, String lastName, Integer salary, Integer department) {
        String id = (firstName + lastName + salary + department).toLowerCase();
        return id;
    }

    @Override
    public Map<String, Employee> showListOfEmployee() {
        return employees;
    }


    @Override
    public Employee remove(String firstName, String lastName, Integer salary, Integer department) {
        Employee employee = new Employee(firstName, lastName, salary, department);
        if (employees.containsKey(getId(firstName, lastName, salary, department))) {
            employees.remove(getId(firstName, lastName, salary, department));
            return employee;
        } else {
            throw new EmployeeNotFoundExeption();
        }
    }

    @Override
    public Employee find(String firstName, String lastName, Integer salary, Integer department) {
        Employee employee = new Employee(firstName, lastName, salary, department);
        if (employees.containsKey(getId(firstName, lastName, salary, department))) {
            return employee;
        } else {
            throw new EmployeeNotFoundExeption();
        }
    }


}








