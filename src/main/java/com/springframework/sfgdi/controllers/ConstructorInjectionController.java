package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectionController {
    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getHello() {
        return greetingService.sayHello();
    }
}
