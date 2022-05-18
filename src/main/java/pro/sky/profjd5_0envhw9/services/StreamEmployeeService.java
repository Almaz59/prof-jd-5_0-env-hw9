package pro.sky.profjd5_0envhw9.services;

import pro.sky.profjd5_0envhw9.data.Employee;

import java.util.List;
import java.util.Map;

public interface StreamEmployeeService {

    List<Employee> showAllList();

    Employee findMaxSalary(Integer department);

    Employee findMinSalary(Integer department);

    List<Employee> showAllListEmployee(Integer department);

}
