package com.rajeshkawali.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * @author Rajesh_Kawali
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "index")
    public Integer index;

    @Column(name = "name")
    public String name;

    @Column(name = "isActive")
    public Boolean isActive;

    @Column(name = "registered")
    public String registered;

    @Column(name = "age")
    public Integer age;

    @Column(name = "gender")
    public String gender;

    @Column(name = "eyeColor")
    public String eyeColor;

    @Column(name = "favoriteFruit")
    public String favoriteFruit;

    //@Column(name = "company")
    @Embedded
    public Company company;

    @Column(name = "tags")
    public List<String> tags;

}