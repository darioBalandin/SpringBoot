package com.springframework.spring6di.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends dont let friends use Property Injected";
    }
}
