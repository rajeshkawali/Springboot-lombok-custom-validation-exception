package com.rajeshkawali.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;


/**
 * @author Rajesh_Kawali
 */
public class CheckNationality implements ConstraintValidator<ValidateNationality, String> {
	
    @Override
    public boolean isValid(String nationality, ConstraintValidatorContext constraintValidatorContext) {
        List<String> employeeNationality = Arrays.asList("Indian", "American", "Canadian", "British", "French", "German", "Japanese");
        return employeeNationality.contains(nationality);
    }
}