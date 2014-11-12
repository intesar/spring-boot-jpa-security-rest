/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.entity.repo.rest;

import demo.entity.Person;
import demo.entity.Users;
import demo.entity.repo.services.PersonService;
import demo.entity.repo.services.UsersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mdshannan
 */
@RestController(value = "/users")
public class WelcomeController {

//    @RequestMapping(method = RequestMethod.GET)
//    public String hi() {
//        return "hello";
//    }
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Users> getAll() {
        return usersService.getAll();
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public Users create(@RequestBody Users person) {
        return usersService.create(person);
    }

}
