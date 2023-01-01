package com.rajeshkawali.lombok;

import lombok.*;

@ToString(includeFieldNames = false) // includeFieldNames = false --> field name will not add while printing the object
@EqualsAndHashCode
@Getter
@Setter
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    public String city;

    @EqualsAndHashCode.Exclude // We can exclude field from equal and hashcode methods.
    public String state;

    @Builder.Default // We can provide default value to the field
    public String country = "India";

    @ToString.Exclude
    public Long pin;
}