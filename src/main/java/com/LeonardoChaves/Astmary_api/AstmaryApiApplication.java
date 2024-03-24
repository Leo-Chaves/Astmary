package com.LeonardoChaves.Astmary_api;

import com.LeonardoChaves.Astmary_api.Entity.Client;
import com.LeonardoChaves.Astmary_api.Service.ClientService;
import com.LeonardoChaves.Astmary_api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class AstmaryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AstmaryApiApplication.class, args);
	}

	@Autowired
	private UserService userService;

	@Autowired
	private ClientService clientService;

	@Bean
	public CommandLineRunner initialization() {
		return args -> {
			System.out.println("Helo World");

			userService.save("leo","leo_chaves","1234","leochaves007@gmail.com");


			Map<String, String> data = new HashMap<>();
			data.put("nome","Pedro");
			data.put("idade:","20");
			clientService.save(userService.findUserByLogin("leo_chaves").getId(), data);


			Map<String, String> data2 = new HashMap<>();
			data2.put("nome","Marcos");
			data2.put("idade:","25");
			data2.put("Trabalha:","sim");
			clientService.save(userService.findUserByLogin("leo_chaves").getId(), data2);

		};
	}
}
