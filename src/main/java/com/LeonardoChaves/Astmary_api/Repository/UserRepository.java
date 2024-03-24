package com.LeonardoChaves.Astmary_api.Repository;

import com.LeonardoChaves.Astmary_api.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User, String> {
    @Query("{ 'login' : ?0 }")
    User findByLogin(String login);

}
