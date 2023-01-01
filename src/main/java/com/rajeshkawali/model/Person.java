package com.rajeshkawali.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

/**
 * @author Rajesh_Kawali
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {

    private String id;

    @JsonProperty("index")
    public Integer index;

    @JsonProperty("name")
    public String name;

    @JsonProperty("isActive")
    public Boolean isActive;

    @JsonProperty("registered")
    public String registered;

    @JsonProperty("age")
    public Integer age;

    @JsonProperty("gender")
    public String gender;

    @JsonProperty("eyeColor")
    public String eyeColor;

    @JsonProperty("favoriteFruit")
    public String favoriteFruit;

    @JsonProperty("company")
    public Company company;

    @JsonProperty("tags")
    public List<String> tags;

}