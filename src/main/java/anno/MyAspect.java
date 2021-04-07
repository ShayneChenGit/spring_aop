package anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

    @Before("execution(* anno.*.*(..))")
    public void before() {
        System.out.println("前置增强...");
    }

    public void afterReturning(){
        System.out.println("后置增强...");
    }

    @Around("pointcut()")
    public Object arround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
        Object proceed = pjp.proceed(); // 切点方法
        System.out.println("环绕后增强...");
        return proceed;
    }

    public void afterThrowing() {
        System.out.println("异常抛出增强...");
    }

    @After("MyAspect.pointcut()")
    public void after() {
        System.out.println("最终增强...");
    }

    @Pointcut("execution(* anno.*.*(..))")
    public void pointcut(){}
}
