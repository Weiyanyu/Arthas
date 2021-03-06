package top.yeonon.arthasfileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "top.yeonon")
public class ArthasFileServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArthasFileServiceApplication.class, args);
    }

}
