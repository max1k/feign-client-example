package com.example.feign_test.client;


import com.example.feign_client.facade.facade.UserServiceFacade;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service-client", url = "http://localhost:8081")
public interface UserServiceClient extends UserServiceFacade {
}
