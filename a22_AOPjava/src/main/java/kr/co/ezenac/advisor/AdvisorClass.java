package kr.co.ezenac.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdvisorClass {

    @Before("execution(* method1())")
    public void beforeMethod(){
        System.out.println("beforeMethod 호출");
    }

    @After("execution(* method1())")
    public void afterMethod(){
        System.out.println("afterMethod 호출");
    }

    @Around("execution(* method1())")
    public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{

        System.out.println("aroundMethod 호출1");
        Object result = pjp.proceed();
        System.out.println("aroundMethod 호출2");

        return result;
    }

    @AfterReturning("execution(* method1())")
    public void afterReturningMethod(){
        System.out.println("afterReturning 호출");
    }

    @AfterThrowing("execution(* method1())")
    public void afterThrowingMethod(){
        System.out.println("AfterThrowing 호출");
    }
}