/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.entity.repository;

/**
 *
 * @author mdshannan
 */
import demo.entity.Person;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByTitle(String lastName);
    
    @Override
    List<Person> findAll();
}
