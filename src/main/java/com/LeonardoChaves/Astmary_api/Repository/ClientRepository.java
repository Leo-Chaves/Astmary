package com.LeonardoChaves.Astmary_api.Repository;

import com.LeonardoChaves.Astmary_api.Entity.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
}
