package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//it expects two parameters 1. type of jpa entity,2. type of the primary key,it also extends JPArepo


public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //all crud database methods

}
