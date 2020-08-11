package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;

public class SetterInjectionController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getHello() {
        return greetingService.sayHello();
    }
}
