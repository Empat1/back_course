package com.example.postgresql.model.User;


import com.example.postgresql.model.language.Language;
import com.example.postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDao {

    @Autowired
    private UserRepository repository;

    public Users save(Users users) {
        System.out.println("command save users = " + users);
        return repository.save(users);
    }

    public Users saveThisUser(Users users) {
        System.out.println("command save users = " + users);
        for(Users user : getAllEmployees()){
            if(user.getUser_login().equals(users.getUser_login())){
                delete(user.getUser_id());
                return repository.save(users);
            }
        }
        return repository.save(users);
    }

    public List<Users> getAllEmployees() {
        List<Users> users = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(users::add);
        return users;
    }


    public Users getAuthorization(String login , String password){
        //TODO spring security
        for(Users user : getAllEmployees()){
            if(user.getUser_login().equals(login)){
                return user;
            }
        }
        return null;
    }


    public List<Language> getLanguageUser(int userId){

        return null;
    }

    public void delete(int productId) {
        repository.deleteById(productId);
    }
}
