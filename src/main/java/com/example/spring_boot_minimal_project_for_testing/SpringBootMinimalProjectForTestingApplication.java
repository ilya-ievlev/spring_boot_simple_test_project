package com.example.spring_boot_minimal_project_for_testing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootMinimalProjectForTestingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMinimalProjectForTestingApplication.class, args);
    }

    @Override
    public void run(String... args) {
        runApplication();
    }

    public void runApplication() {
        throw new IllegalArgumentException("test exception");
    }
}
