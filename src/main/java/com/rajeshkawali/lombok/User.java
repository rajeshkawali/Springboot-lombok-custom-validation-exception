package com.rajeshkawali.lombok;

import lombok.*;
import lombok.experimental.NonFinal;

import java.util.List;

/**
 * @author Rajesh_Kawali
 */
@NoArgsConstructor
@AllArgsConstructor
@Data // @Data annotation is shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields, and @RequiredArgsConstructor
@Builder //Builder annotation uses the Builder pattern to construct the object
//@Builder(builderClassName = "HelloWorldBuilder", buildMethodName = "execute", builderMethodName = "helloWorld", toBuilder = true, access = AccessLevel.PRIVATE, setterPrefix = "set")
public class User {

    private Long id;

    @NonNull //null-check for field,If null throw NullPointerException("param is marked non-null but is null").
    private String firstName;

    private String lastName;

    @Setter(AccessLevel.PACKAGE)
    private Integer age;

    @Setter(AccessLevel.PUBLIC) // We can provide access level to the field
    private String gender;

    @NonFinal // We can make final field/final class as non-final using @NonFinal.
    @Getter(lazy = true)// First time this getter is called, and cache it- It is useful when there is complex task perform once and cache it.
    private final String role = "Software Engineer";

    private List<String> phone;

    private Address address;
}