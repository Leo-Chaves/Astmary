package com.LeonardoChaves.Astmary_api.Service;

import com.LeonardoChaves.Astmary_api.Entity.Client;
import com.LeonardoChaves.Astmary_api.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public void save(String user_id, Map<String, String> data){
        Client client = new Client(user_id);
        client.setData(data);
        clientRepository.save(client);
    }
}
