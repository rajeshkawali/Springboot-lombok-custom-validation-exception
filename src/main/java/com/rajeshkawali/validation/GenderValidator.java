package com.rajeshkawali.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author Rajesh_Kawali
 */
public class GenderValidator implements ConstraintValidator<GenderEitherOneOf, String> {

    private String[] fields;

    @Override
    public void initialize(GenderEitherOneOf annotation) {
        this.fields = annotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        int matches = countNumberOfMatches(value);

        if (matches > 1) {
            setValidationErrorMessage(context, "Only one of the following gender value should be specified");
            return false;
        } else if (matches == 0) {
            setValidationErrorMessage(context, "Exactly one of the following gender male/female must be specified");
            return false;
        }
        return true;
    }

    private int countNumberOfMatches(String value) {
        int matches = 0;
        for (String field : fields) {
            if (value != null && checkValueIsPresent(value, field)) {
                matches++;
            }
        }
        return matches;
    }

    private boolean checkValueIsPresent(String value, String field) {
        if (value.matches("[a-zA-Z]+") && field.equalsIgnoreCase(value)) {
            return true;
        } else {
            return false;
        }
    }

    private void setValidationErrorMessage(ConstraintValidatorContext context, String template) {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(template)
                .addConstraintViolation();
    }
}