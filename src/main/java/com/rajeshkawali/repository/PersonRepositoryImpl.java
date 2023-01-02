package com.rajeshkawali.repository;

import com.rajeshkawali.model.Person;

import jakarta.persistence.*;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rajesh_Kawali
 */
@Slf4j
@Repository
//@Transactional //We can use at class level also
public class PersonRepositoryImpl implements PersonRepository {

    public static final String CLASS_NAME = PersonRepositoryImpl.class.getName();

    @Autowired
    private ModelMapper modelMapper;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Person> getAllPerson() {
        String _function = ".getAllPerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        List<Person> personList = null;
        personList = entityManager.createQuery("SELECT p FROM Person p").getResultList();
        return personList;
    }

    @Transactional
    @Override
    public Person savePerson(Person person) {
        String _function = ".savePerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        com.rajeshkawali.entity.Person entityPerson = null;
        entityPerson = modelMapper.map(person,com.rajeshkawali.entity.Person.class);
        log.info(CLASS_NAME + _function + "::entityPerson: {}", entityPerson);
        entityManager.persist(entityPerson);
        return person;
    }

    @Override
    public Person findByPersonId(Long id) {
        String _function = ".findByPersonId";
        log.info(CLASS_NAME + _function + "::ENTER: id: {}", id);
        com.rajeshkawali.entity.Person personEntity = entityManager.find(com.rajeshkawali.entity.Person.class, id);
        Person person = modelMapper.map(personEntity, Person.class);
        log.info(CLASS_NAME + _function + "::EXIT: person: {}", person);
        return person;
    }

    @Override
    @Transactional
    public Person updatePerson(Person person) {
        String _function = ".updatePerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        entityManager.merge(person);
        return person;
    }

    @Override
    @Transactional
    public Person deleteByPersonId(String id) {
        String _function = ".deleteByPersonId";
        log.info(CLASS_NAME + _function + "::ENTER");
        Person person = (Person) entityManager.find(Person.class, id);
        if (person != null) {
            entityManager.remove(person);
        }
        return person;
    }

    @Override
    @Transactional
    public int deleteAllPerson() {
        String _function = ".deleteAllPerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        Query query = entityManager.createQuery("DELETE FROM Person");
        return query.executeUpdate();
    }
}
