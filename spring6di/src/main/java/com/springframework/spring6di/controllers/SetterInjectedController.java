package com.springframework.spring6di.controllers;

import com.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedController {

 private GreetingService greetingService;


 @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {

        System.out.println("I am in SetterInjectedController");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
