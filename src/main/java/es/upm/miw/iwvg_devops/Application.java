package es.upm.miw.iwvg_devops;

import es.upm.miw.iwvg_devops.EjerciciosStream.Fraction;
import es.upm.miw.iwvg_devops.EjerciciosStream.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

import java.util.stream.Stream;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class}) // Not API: /error
public class Application {
    public static void main(String[] args) {
        /*System.out.println("tes");
        Fraction fraction = new Fraction();
        Stream<User> stream = fraction.isProperFraction(1);
        System.out.println(stream.count());*/
        SpringApplication.run(Application.class, args);// mvnw clean spring-boot:run
    }
}
