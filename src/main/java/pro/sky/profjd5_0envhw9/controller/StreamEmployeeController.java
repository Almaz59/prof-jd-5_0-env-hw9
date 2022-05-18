package pro.sky.profjd5_0envhw9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.profjd5_0envhw9.data.Employee;
import pro.sky.profjd5_0envhw9.services.StreamEmployeeService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class StreamEmployeeController {
    private final StreamEmployeeService streamEmployeeService;

    public StreamEmployeeController(StreamEmployeeService streamEmployeeService) {
        this.streamEmployeeService = streamEmployeeService;
    }

    @GetMapping("/max-salary")
    public Employee findMaxSalary(@RequestParam("department") Integer department) {
        return streamEmployeeService.findMaxSalary(department);
    }

    @GetMapping("/min-salary")
    public Employee findMinSalary(@RequestParam("department") Integer department) {
        return streamEmployeeService.findMinSalary(department);
    }

    @GetMapping("/show")
    public List<Employee> showAllListEmployee(@RequestParam("department") Integer department) {
        return streamEmployeeService.showAllListEmployee(department);
    }

    @GetMapping("/all")
    public List<Employee> showAllList() {
        return streamEmployeeService.showAllList();
    }
}
