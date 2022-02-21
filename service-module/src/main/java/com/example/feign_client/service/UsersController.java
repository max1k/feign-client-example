package com.example.feign_client.service;

import com.example.feign_client.facade.facade.BaseDTO;
import com.example.feign_client.facade.facade.UserDTO;
import com.example.feign_client.facade.facade.UserServiceFacade;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class UsersController implements UserServiceFacade {
    @Override
    public BaseDTO<UserDTO> addUser(UserDTO userDTO) {
        return BaseDTO.ofSuccess(Collections.nCopies(
                3,
                new UserDTO("superUserName", "superUserLogin")
        ));
    }
}
