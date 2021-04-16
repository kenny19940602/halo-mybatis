package com.halo.aspect;

import com.halo.mbg.model.Comments;
import com.halo.security.context.SecurityContextHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * @author giveup
 * @description SensitiveMaskAspect
 * @date 10:22 PM 25/5/2020
 */
@Aspect
@Component
public class SensitiveConcealAspect {


    /**
     *     TODO 切点后期改
     */
    @Pointcut("within(run.halo.app.repository..*) "
        + "&& @annotation(run.halo.app.annotation.SensitiveConceal)")
    public void pointCut() {
    }

    private Object sensitiveMask(Object comment) {
        if (comment instanceof Comments) {
            ((Comments) comment).setEmail("");
            ((Comments) comment).setIpAddress("");
        }
        return comment;
    }

    @Around("pointCut()")
    public Object mask(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = joinPoint.proceed();
        if (SecurityContextHolder.getContext().isAuthenticated()) {
            return result;
        }
        if (result instanceof Iterable) {
            ((Iterable<?>) result).forEach(this::sensitiveMask);
        }
        return sensitiveMask(result);
    }
}
