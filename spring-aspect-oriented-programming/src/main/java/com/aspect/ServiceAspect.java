package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.service.MessageService.mesajVer(..))")
    public void mesajVerMetodundanOnce(JoinPoint joinPoint) {
        System.out.println("Catch before mesajVer method: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.service.MessageService.mesajVer(..))")
    public void mesajVerMetodundanSonra(JoinPoint joinPoint) {
        System.out.println("Catch after mesajVer method: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }


}
