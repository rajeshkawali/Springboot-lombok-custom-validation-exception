package com.rajeshkawali.service;

import com.rajeshkawali.model.Person;
import com.rajeshkawali.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rajesh_Kawali
 */
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {

    public static final String CLASS_NAME = PersonServiceImpl.class.getName();

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPerson() {
        String _function = ".getAllPerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        return personRepository.getAllPerson();
    }

    @Override
    public Person savePerson(Person person) {
        String _function = ".savePerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        return personRepository.savePerson(person);
    }

    @Override
    public Person findByPersonId(Long id) {
        String _function = ".findByPersonId";
        log.info(CLASS_NAME + _function + "::ENTER");
        return personRepository.findByPersonId(id);
    }

    @Override
    public Person updatePerson(Person person) {
        String _function = ".updatePerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        return personRepository.updatePerson(person);
    }

    @Override
    public Person deleteByPersonId(String id) {
        String _function = ".deleteByPersonId";
        log.info(CLASS_NAME + _function + "::ENTER");
        return personRepository.deleteByPersonId(id);
    }

    @Override
    public int deleteAllPerson() {
        String _function = ".deleteAllPerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        return personRepository.deleteAllPerson();
    }

}
