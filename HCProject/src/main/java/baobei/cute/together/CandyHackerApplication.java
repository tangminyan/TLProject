package baobei.cute.together;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by tangminyan on 2019/3/1.
 */
@SpringBootApplication
@EntityScan("baobei.cute.together")
public class CandyHackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CandyHackerApplication.class, args);
    }
}
