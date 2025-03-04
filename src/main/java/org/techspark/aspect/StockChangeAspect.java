package org.techspark.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.techspark.annotation.TrackStockChange;

// Aspect Implementation
@Aspect
@Component
@Slf4j
public class StockChangeAspect {

    @Pointcut("@annotation(trackStockChange)")
    public void trackStock(TrackStockChange trackStockChange) {}

    @Around("trackStock(trackStockChange)")
    public Object logStockTransaction(ProceedingJoinPoint joinPoint, TrackStockChange trackStockChange) throws Throwable {
        Object result;
        try {
            log.info("[Stock Tracking] Action: {} - Executing {}", trackStockChange.action(), joinPoint.getSignature().getName());
            result = joinPoint.proceed();
            log.info("[Stock Tracking] Action: {} - Successfully executed {}", trackStockChange.action(), joinPoint.getSignature().getName());
        } catch (Exception e) {
            log.error("[Stock Tracking] Action: {} - Failed execution: {}", trackStockChange.action(), e.getMessage());
            throw e;
        }
        return result;
    }
}
