package com.rajeshkawali.lombok;


import lombok.Value;
/*
@Value annotation -->is shorthand for the annotation combination of
@Getter
@FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
@AllArgsConstructor
@ToString
@EqualsAndHashCode .
 */
@Value
//@Value(staticConstructor = "getInstance") //Constructor will be private, a static factory method is created to that other classes can use to create instances.
public class ImmutableClass {
    private Long id;
    private String username;
}

/*
@Data	                                                @Value
1.Lombok generated class is not final.	                1.Lombok generated class is final.
2.Generates required-args constructor.	                2.Generates all-args constructor.
3.Generates equals(), hashCode() and toString().	    3.Generates equals(), hashCode() and toString().
4.Does not make fields final.	                        4.Makes all non-static fields final.

5.Generates setters and getters.
No getters/setters are generated for
static fields and no setters
generate for final fields.	                            5.No setters generate for any filed as it makes all
                                                        fields final except static fields, and obviously no getters
                                                        generate for static fields.
 */