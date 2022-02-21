package com.example.feign_client.facade.facade;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserServiceFacade {
    @PostMapping("/rest/users")
    BaseDTO<UserDTO> addUser(@RequestBody UserDTO userDTO);
}
