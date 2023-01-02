package com.rajeshkawali.controller;

import com.rajeshkawali.model.EmployeeDTO;
import com.rajeshkawali.model.Person;
import com.rajeshkawali.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rajesh_Kawali
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class EmployeeController {

    public static final String CLASS_NAME = EmployeeController.class.getName();
    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody @Valid EmployeeDTO employee) {
        String _function = ".addEmployee";
        log.info(CLASS_NAME + _function + "::ENTER");
        EmployeeDTO employeeDTO = service.addEmployee(employee);
        log.info(CLASS_NAME + _function + "::EXIT");
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeDTO);
    }

    @GetMapping(value = "/getAllEmployee")
    public List<EmployeeDTO> getAllEmployee() {
        String _function = ".getAllEmployee";
        log.info(CLASS_NAME + _function + "::ENTER");
        return service.getAllEmployee();
    }

    @GetMapping(value = "/findByEmployeeId/{id}")
    public EmployeeDTO findByEmployeeId(@PathVariable Long id) {
        String _function = ".findByEmployeeId";
        log.info(CLASS_NAME + _function + "::ENTER");
        return service.findByEmployeeId(id);
    }

}