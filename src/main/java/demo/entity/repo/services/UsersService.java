/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.entity.repo.services;

import demo.entity.Users;
import java.util.List;

/**
 *
 * @author mdshannan
 */
public interface UsersService {

    Users create(Users person);

    List<Users> getAll();

}
