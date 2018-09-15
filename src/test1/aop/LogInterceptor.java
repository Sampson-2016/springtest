package test1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author keyuan.dky
 * @date 2018/09/15
 */
@Component
@Aspect
public class LogInterceptor {
    public void test() {
        System.out.println("LogInterceptor test");
    }

    @Pointcut("execution( * test1..*.*(..))")
    public void myMethod() {}

    @Before("myMethod()")
    public void before(JoinPoint jp) {
        System.out.println("method start jp.getSignature():" + jp.getSignature());
    }

    @After("myMethod()")
    public void after(JoinPoint jp) {
        System.out.println("method after jp.getSignature()" + jp.getSignature());
    }

    @AfterReturning(pointcut = "execution( * test1..*.*(..))", returning = "rvt")
    public void AfterReturning(JoinPoint jp, Object rvt) {
        if (rvt != null) {
            System.out.println(
                "method AfterReturning jp.getSignature():" + jp.getSignature() + " rvt: " + rvt.toString());
            rvt = "new rvt";
        } else {

            System.out.println("method AfterReturning jp.getSignature():" + jp.getSignature());
        }

    }

    @AfterThrowing("execution( * test1..*.*(..))")
    public void AfterThrowing(JoinPoint jp) {
        System.out.println("method AfterThrowing jp.getSignature() " + jp.getSignature());
    }

    @Around("execution( * test1..*.*(..))")
    public Object Around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("method Around jp.getSignature():" + jp.getSignature());

        Object o[] = jp.getArgs();
        if (o != null && o.length != 0) {
            o[0] = "前缀" + o[0];
        }
        Object rvt = jp.proceed(o);

        if (rvt != null ) {
            rvt = rvt + "后缀";
        }
        return rvt;
    }
}
