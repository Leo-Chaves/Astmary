package com.LeonardoChaves.Astmary_api.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "User")
public class User {

    @Id
    private String id;

    @Indexed
    private String login;
    private String password;
    private String name;
    private String mail;

    public User(String id, String name, String login, String password,String mail) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.mail = mail;
    }

    public User(String name, String login, String password,String mail) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.mail = mail;
    }

    public User() {

    }
}
