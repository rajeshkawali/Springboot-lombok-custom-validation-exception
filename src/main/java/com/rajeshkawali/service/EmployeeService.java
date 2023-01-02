package com.rajeshkawali.service;

import com.rajeshkawali.model.EmployeeDTO;
import com.rajeshkawali.model.Person;

import java.util.List;

/**
 * @author Rajesh_Kawali
 */
public interface EmployeeService {

    public EmployeeDTO addEmployee(EmployeeDTO employee);

    public List<EmployeeDTO> getAllEmployee();

    public EmployeeDTO findByEmployeeId(Long id);
}
