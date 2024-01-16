package cn.edu.shu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Charging {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(Charging.class, args);
    }
}