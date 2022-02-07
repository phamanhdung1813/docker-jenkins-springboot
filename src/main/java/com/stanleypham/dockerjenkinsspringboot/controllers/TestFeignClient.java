package com.stanleypham.dockerjenkinsspringboot.controllers;

import com.stanleypham.dockerjenkinsspringboot.data.Users;
import com.stanleypham.dockerjenkinsspringboot.services.FeignAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class TestFeignClient {
    @Autowired
    private FeignAPI feignAPI;

    @GetMapping(value = "/fetchAll")
    public List<Users> fetchAll() {
        return feignAPI.fetchAll();
    }

    @GetMapping(value = "/update")
    public String update() {
        return "SOMETHING IS UPDATED !!!";
    }
}
