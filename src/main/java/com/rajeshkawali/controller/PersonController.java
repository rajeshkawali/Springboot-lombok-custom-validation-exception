package com.rajeshkawali.controller;

import com.rajeshkawali.model.Person;
import com.rajeshkawali.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rajesh_Kawali
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class PersonController {

    public static final String CLASS_NAME = PersonController.class.getName();

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/getAllPerson")
    public List<Person> getAllPerson() {
        String _function = ".getAllPerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        return personService.getAllPerson();
    }

    @PostMapping(value = "/savePerson")
    public Person savePerson(@RequestBody Person person) {
        String _function = ".savePerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        return personService.savePerson(person);
    }

    @GetMapping(value = "/findByPersonId/{id}")
    public Person findByPersonId(@PathVariable Long id) {
        String _function = ".savePerson";
        log.info(CLASS_NAME + _function + "::ENTER");
        return personService.findByPersonId(id);
    }
}