package com.example.spring_boot_minimal_project_for_testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootMinimalProjectForTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMinimalProjectForTestingApplication.class, args);
        throw new IllegalArgumentException("test exception");
    }

}
