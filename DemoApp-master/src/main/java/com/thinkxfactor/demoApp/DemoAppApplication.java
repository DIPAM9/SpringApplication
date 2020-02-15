package com.thinkxfactor.demoApp;

import com.thinkxfactor.demoApp.entity.car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@ComponentScan("com.thinkxfactor")
@EnableJpaRepositories(basePackages = "com.thinkxfactor")
@EntityScan("com.thinkxfactor")
public class DemoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoAppApplication.class, args);
		car Car = context.getBean(car.class);
		Car.printInfo();
		
	}

}
