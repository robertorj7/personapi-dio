package one.digitalinnovation.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"one.digitalinnovation.personapi"})
public class PersonapiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PersonapiApplication.class, args);
    }

}
