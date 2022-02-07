package com.stanleypham.dockerjenkinsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DockerJenkinsSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsSpringbootApplication.class, args);
    }

}
