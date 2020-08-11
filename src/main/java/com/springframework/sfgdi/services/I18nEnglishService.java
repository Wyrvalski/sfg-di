package com.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("I18service")
public class I18nEnglishService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - EN";
    }
}
