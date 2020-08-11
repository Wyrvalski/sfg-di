package com.springframework.sfgdi.controllers;


import com.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionDependencyTest {

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getHello() {
        System.out.println(controller.getHello());
    }
}