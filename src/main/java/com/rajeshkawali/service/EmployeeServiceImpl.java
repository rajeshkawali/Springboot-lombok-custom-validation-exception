package com.rajeshkawali.service;

import com.rajeshkawali.entity.Employee;
import com.rajeshkawali.model.EmployeeDTO;
import com.rajeshkawali.model.Person;
import com.rajeshkawali.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * @author Rajesh_Kawali
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    public static final String CLASS_NAME = EmployeeServiceImpl.class.getName();

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EmployeeRepository repository;

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDto){
        String _function = ".addEmployee";
        log.info(CLASS_NAME + _function + "::ENTER");
        EmployeeDTO employeeDTO = new EmployeeDTO();
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        employee = repository.save(employee);
        BeanUtils.copyProperties(employee, employeeDTO);
        log.info(CLASS_NAME + _function + "::EXIT: employee: {}", employeeDTO);
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        String _function = ".getAllEmployee";
        log.info(CLASS_NAME + _function + "::ENTER");
        List<EmployeeDTO> employeeDTOList = new ArrayList<EmployeeDTO>();
        repository.findAll().stream().forEach(employeeEntity -> {
            EmployeeDTO employeeDTO = modelMapper.map(employeeEntity, EmployeeDTO.class);
            employeeDTOList.add(employeeDTO);
        });
        log.info(CLASS_NAME + _function + "::EXIT: employee count: {}", employeeDTOList.size());
        return employeeDTOList;
    }

    @Override
    public EmployeeDTO findByEmployeeId(Long id) {
        String _function = ".findByEmployeeId";
        log.info(CLASS_NAME + _function + "::ENTER");
        EmployeeDTO employeeDto = new EmployeeDTO();
        Optional<Employee> employee = repository.findById(id);
        BeanUtils.copyProperties(employee.get(), employeeDto);
        log.info(CLASS_NAME + _function + "::EXIT: employee: {}", employeeDto);
        return employeeDto;
    }
}