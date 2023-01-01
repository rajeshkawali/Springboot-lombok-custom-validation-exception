package com.rajeshkawali.lombok;


import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rajesh_Kawali
 *
 * @see "https://projectlombok.org/features/"
 */
@Slf4j //@Slf4j - Logger to print on console
public class LombokMain {
    public static void main(String[] args) {

        val phone = List.of("9988776655","9944556677"); //Lombok also contain var -> var works exactly like val, except the local variable is not marked as final.
        //@Builder - Builder annotation uses the Builder pattern to construct the object
        User user = User.builder()
                .id(1L)
                .age(24)
                //.role("Sr.Software Engineer")
                .gender("Male")
                .firstName("Keshav")
                .lastName("Koli")
                .phone(phone)
                .address(Address.builder().city("Mumbai").state("Maharashtra").country("India").pin(400091L).build())
                .build();

        log.info("User Details are: {}", user);
        log.info("-----------------------------------");
        Actor actor = Actor.builder().build();
        actor.setFirstName("Rajesh");
        actor.setSurname("Kawali");
        actor.setEmail("rajesh@gmail.com");
        actor.setGender("Male");
        actor.setTags(Arrays.asList("software developer","UI developer"));
        log.info("Actor Details are: {}", actor);
        log.info("-----------------------------------");
        Actor actor2 = Actor.builder().clearTags().build(); // clearTags() --> added by @Singular annotation
        log.info("Actor Details are: {}", actor);
        log.info("Actor two Details are: {}", actor2);
    }
}
