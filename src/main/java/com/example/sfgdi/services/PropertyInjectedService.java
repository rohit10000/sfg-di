package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello folks - Property";
    }
}
