package com.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("I18service")
public class I18nPortuguesService implements GreetingService {
    @Override
    public String sayHello() {
        return "Ola mundo = PT";
    }
}
