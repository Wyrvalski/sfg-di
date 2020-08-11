package com.springframework.sfgdi;

import com.springframework.sfgdi.controllers.ConstructorInjectionController;
import com.springframework.sfgdi.controllers.MyController;
import com.springframework.sfgdi.controllers.PropertyInjectionController;
import com.springframework.sfgdi.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String getHello = myController.sayHello();

		System.out.println(getHello);

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");

		System.out.println(propertyInjectionController.getHello());

		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");

		System.out.println(setterInjectionController.getHello());

		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");

		System.out.println(constructorInjectionController.getHello());
	}

}
