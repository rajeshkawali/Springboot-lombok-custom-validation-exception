package com.rajeshkawali.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rajeshkawali.validation.GenderEitherOneOf;
import com.rajeshkawali.validation.ValidateNationality;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Rajesh_Kawali
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;

    @NotBlank(message = "First Name shouldn't be null or empty")
    private String firstName;

    @NotBlank(message = "Last Name shouldn't be null or empty")
    private String lastName;

    @PastOrPresent(message = "DOJ should be in the past or the past including the present")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date doj;

    @NotNull(message = "Department shouldn't be null")
    @NotEmpty(message = "Department shouldn't be empty")
    private String dept;

    @Email(message = "Invalid email")
    private String email;

    @Pattern(regexp = "^\\d{10}$",message = "Invalid mobile number")
    private String mobile;

    //custom annotation
    @GenderEitherOneOf({"male", "female"})
    private String gender; // male or female

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 60, message = "Age should not be greater than 60")
    private int age;

    @Size(min = 10, max = 500, message = "About Me must be between 10 and 500 characters")
    private String aboutMe;

    @ValidateNationality //custom annotation
    private String nationality; //Indian or American or Canadian or British or French or German or Japanese

}
/*
All the annotations are standard JSR annotations:

@NotNull :--> validates that the annotated property value is not null.
@AssertTrue :-->  validates that the annotated property value is true.
@Size :-->  validates that the annotated property value has a size between the attributes min and max; can be applied to String, Collection, Map, and array properties.
@Min :-->  validates that the annotated property has a value no smaller than the value attribute.
@Max :-->  validates that the annotated property has a value no larger than the value attribute.
@Email :-->  validates that the annotated property is a valid email address.
@NotEmpty :-->  validates that the property is not null or empty; can be applied to String, Collection, Map or Array values.
@NotBlank :-->  can be applied only to text values and validates that the property is not null or whitespace.
@Positive and @PositiveOrZero :-->  apply to numeric values and validate that they are strictly positive, or positive including 0.
@Negative and @NegativeOrZero :-->  apply to numeric values and validate that they are strictly negative, or negative including 0.
@Past and @PastOrPresent :-->  validate that a date value is in the past or the past including the present; can be applied to date types including those added in Java 8.
@Future and @FutureOrPresent :-->  validate that a date value is in the future, or in the future including the present.
 */