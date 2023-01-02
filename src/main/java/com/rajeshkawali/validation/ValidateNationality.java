package com.rajeshkawali.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


/**
 * @author Rajesh_Kawali
 */
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CheckNationality.class)
public @interface ValidateNationality {

    public String message() default "Invalid Nationality, It should be either Indian/American/Canadian/British/French/German/Japanese";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}