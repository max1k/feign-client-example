package com.example.feign_test.client;


import com.example.feign_client.facade.facade.BaseDTO;
import com.example.feign_client.facade.facade.UserDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    public CommandLineRunner startupRunner(UserServiceClient client) {
        return args -> {
            BaseDTO<UserDTO> userBaseDTO = client.addUser(new UserDTO("user1", "login1"));
            for (UserDTO user : userBaseDTO.getResult()) {
                System.out.println("user = " + user);
            }
        };
    }

}
