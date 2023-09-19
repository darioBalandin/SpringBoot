package com.springframework.spring6di.controllers;

import com.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

//    @Qualifier("greetingServiceImpl")
    @Qualifier("greetingServicePropertyInjected")
    @Autowired
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
