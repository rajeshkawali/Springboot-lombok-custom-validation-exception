package com.rajeshkawali.exception;
/**
 * @author Rajesh_Kawali
 *
 */
public class EmployeeNotFoundException extends Exception {

    public EmployeeNotFoundException() {
        super();
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
