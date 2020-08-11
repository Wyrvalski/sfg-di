package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(@Qualifier("I18service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return this.greetingService.sayHello();
    }

}
