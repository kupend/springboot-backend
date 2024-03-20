package net.javaguides.springbootbackend;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception{
        Employee employee = new Employee();
        employee.setFirstName("Kupendra");
        employee.setLastName("Ambati");
        employee.setEmailId("ak.reddy@gmail.com");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("reddy");
        employee1.setLastName("Amb");
        employee1.setEmailId("ak.reddy9@gmail.com");
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Kupendra reddy");
        employee2.setLastName("Am");
        employee2.setEmailId("ak.reddy2@gmail.com");
        employeeRepository.save(employee2);
    }

}
