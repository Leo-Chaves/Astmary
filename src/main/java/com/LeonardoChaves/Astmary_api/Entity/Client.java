package com.LeonardoChaves.Astmary_api.Entity;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Data
@Document(collection = "Client")
public class Client {

    @Id
    private String id;

    @Indexed
    private String user_id;
    @Getter
    private Map<String, String> data = new HashMap<>();

    public Client(String user_id) {
        this.user_id = user_id;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    // Additional methods
    public Object getValue(String key) {
        return data.get(key);
    }

    public void setValue(String key, String value) {
        data.put(key, value);
    }
}
