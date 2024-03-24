package com.LeonardoChaves.Astmary_api.Controller;

import com.LeonardoChaves.Astmary_api.Entity.User;
import com.LeonardoChaves.Astmary_api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/user")
public class userController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.save(user.getName(), user.getLogin(), user.getPassword(), user.getMail());
        return new ResponseEntity<>("Cadastrado", HttpStatus.CREATED);
    }

}
