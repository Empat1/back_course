package com.example.postgresql.controller;

import com.example.postgresql.model.User.Users;
import com.example.postgresql.model.User.UserDao;
import com.example.postgresql.model.word.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao user;

    @GetMapping("/users/get-all")
    public List<Users> getAllProducts() {
        return user.getAllEmployees();
    }


    @PostMapping("/users/save")
    public Users save(@RequestBody Users users) {
        return this.user.save(users);
    }

    @PostMapping("/users/save_this_user")
    public Users saveThisUser(@RequestBody Users users) {
        return this.user.saveThisUser(users);
    }

    @RequestMapping(value = "users/authorization/{login}/{password}", method = RequestMethod.GET)
    public Users authorization(@PathVariable("login") String login , @PathVariable("password") String password){
        return user.getAuthorization(login , password);
    }


}

