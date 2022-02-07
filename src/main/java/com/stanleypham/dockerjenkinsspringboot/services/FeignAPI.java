package com.stanleypham.dockerjenkinsspringboot.services;

import com.stanleypham.dockerjenkinsspringboot.data.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "USERS", url = "${client.fetch.defaultUrl}")
public interface FeignAPI {

    @GetMapping(value = "/users")
    List<Users> fetchAll();
}
