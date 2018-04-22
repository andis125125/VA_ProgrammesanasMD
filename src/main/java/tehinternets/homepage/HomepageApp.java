package tehinternets.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomepageApp {
    public static void main(String [] args) {
        SpringApplication.run(HomepageApp.class, args);
        System.out.println("Teh internetz");
    }

}
