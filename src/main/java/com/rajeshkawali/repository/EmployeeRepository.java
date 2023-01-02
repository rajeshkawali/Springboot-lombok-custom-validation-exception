package com.rajeshkawali.repository;

import com.rajeshkawali.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
