package com.example.EnvironmentVariable02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    Environment environment;

   //La variabile welcomeMsg è definita nella Configurations dei profili
    @GetMapping
    public String sayHello(){
        return environment.getProperty("welcomeMsg");
    }
}
