package one.digitalinnovation.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PersonapiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PersonapiApplication.class, args);
    }

}
