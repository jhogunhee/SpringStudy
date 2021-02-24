package part14;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect   //AOP 선언부
@Component
public class AspectLogging {

    @Pointcut("execution(public * part14..*(..))")
    public void excuteMethod() {}

    @Around("excuteMethod()")
    public Object AspectLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AspectLogging == Before  || " + joinPoint.getSignature().toShortString());
        try {
            System.out.println(" ** 매개변수 :: " + Arrays.toString(joinPoint.getArgs()));
            Object result = joinPoint.proceed();
            return result;
        }
        finally {
            System.out.println("AspectLogging == After || " + joinPoint.getSignature().toShortString());
        }
    }

} 