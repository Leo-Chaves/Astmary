package com.LeonardoChaves.Astmary_api.Service;

import com.LeonardoChaves.Astmary_api.Entity.User;
import com.LeonardoChaves.Astmary_api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void save(String name, String login, String password, String mail){
        User user = new User(name,login,password,mail);
        this.repository.save(user);
    }

    public User findUserByLogin(String login) {
        return repository.findByLogin(login);
    }
}
