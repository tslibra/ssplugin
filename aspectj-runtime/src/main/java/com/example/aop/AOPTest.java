package com.example.aop;


import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AOPTest {


    @Around("execution(* android.app.Activity+.setContentView(..))")
    public void onStart(ProceedingJoinPoint point) {
        Log.d("AOPTest", "on start start");
        try {
            point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Log.d("AOPTest", "on start end");
    }

    @Before("execution(* android.app.Activity+.on**(..))")
    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {
        Log.e("aop", "onActivityMethodBefore");
    }
}
