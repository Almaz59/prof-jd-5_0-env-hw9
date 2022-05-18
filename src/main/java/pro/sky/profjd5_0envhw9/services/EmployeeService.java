package pro.sky.profjd5_0envhw9.services;

import pro.sky.profjd5_0envhw9.data.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public interface EmployeeService {

    Employee add(String firstName, String lastName, Integer salary, Integer department);

    String getId(String firstName, String lastName, Integer salary, Integer department);

    Map<String, Employee> showListOfEmployee();

    Employee remove(String firstName, String lastName, Integer salary, Integer department);

    Employee find(String firstName, String lastName, Integer salary, Integer department);

    Map<String, Employee> getEmployees();
}



