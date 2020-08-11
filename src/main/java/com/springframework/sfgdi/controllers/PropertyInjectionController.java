package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getHello() {
        return greetingService.sayHello();
    }
}
