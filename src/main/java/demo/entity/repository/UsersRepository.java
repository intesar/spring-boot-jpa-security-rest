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
import demo.entity.Users;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {

    @Override
    List<Users> findAll();
}
