package com.rajeshkawali.repository;

import com.rajeshkawali.model.Person;

import java.util.List;

/**
 * @author Rajesh_Kawali
 */
public interface PersonRepository {

    public List<Person> getAllPerson();

    public Person savePerson(Person person);

    public Person findByPersonId(Long id);

    public Person updatePerson(Person person);

    public Person deleteByPersonId(String id);

    public int deleteAllPerson();

}
