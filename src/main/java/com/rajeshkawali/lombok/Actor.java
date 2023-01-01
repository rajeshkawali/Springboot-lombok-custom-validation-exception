package com.rajeshkawali.lombok;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class Actor extends ActorSuper {

    @ToString.Exclude
    private String email;

    @ToString.Include
    @EqualsAndHashCode.Include
    private String surname;
}

@Data
@SuperBuilder
class ActorSuper {
    private String firstName;
    private String gender;

    @Singular
    private List<String> tags;
}
/*
The @Singular annotation is used together with Lombok @Builder annotation.
If you annotate one of the collection valued field with @Singular annotation Lombok generates for the field :

1.One ‘adder’ method for adding single element to collection.
2.Another ‘adder’ method for adding another collection to the collection, this name is plural for the field name .
3.Clear method to clear collection elements.
 */