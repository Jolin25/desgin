package top.jrl.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.jrl.design.test.HotStart;

/**
 * @author Joly
 */
@SpringBootApplication
public class DesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignApplication.class, args);
        HotStart.test();
    }

}
