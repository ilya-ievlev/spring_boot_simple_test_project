package com.example.spring_boot_minimal_project_for_testing.exception_handler;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GlobalExceptionHandler {

//    @AfterThrowing(pointcut = "execution(* com.example.spring_boot_minimal_project_for_testing.SpringBootMinimalProjectForTestingApplication..*(..))", throwing = "ex")
//    public void logException(Exception ex) {
//        System.out.println(ex.getMessage() + "from aop");
//    }

    @AfterThrowing(pointcut = "execution(* com.example.spring_boot_minimal_project_for_testing.SpringBootMinimalProjectForTestingApplication.runApplication(..))", throwing = "ex")
    public void logException(Exception ex) {
        System.out.println(ex.getMessage() + " from AOP");
    }
}
