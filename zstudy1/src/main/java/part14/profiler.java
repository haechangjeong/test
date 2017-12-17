package part14;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect   //AOP 선언부
@Component("profiler")
public class profiler<Ojbect> {
	@Pointcut("execution(public * part14..*(..))")
	public void publicMethod() {}

	@Around("publicMethod()")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("profiler == Before  || " + joinPoint.getSignature().toShortString());
		try {
			System.out.println("이 시스템은 " + System.getProperty("spring.profiles.active") + "입니다.");
			Object result = joinPoint.proceed();
			return result;
		}
		finally {
			System.out.println("profiler == After || " + joinPoint.getSignature().toShortString());
		}
	}
}
