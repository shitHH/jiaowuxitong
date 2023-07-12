package com.etc.logs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author yyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/12 19:26:17
 */
@Aspect
@Component
public class WebLogAspect {

    Logger log = Logger.getLogger(WebLogAspect.class);

    @Pointcut("execution(* com.etc.controller..*.*(..))")//切入点描述 这个是controller包的切入点
    public void WebLog() {

    }

    //在请求之前设置
    @Before("WebLog()")
    public void doBefore(JoinPoint joinPoint) {
        //收到请求，记录请求内容
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();//这个RequestContextHolder是Springmvc提供来获得请求的东西
        HttpServletRequest request = requestAttributes.getRequest();
        // 记录下请求内容
        log.info("URL :" + request.getRequestURL().toString());
        log.info("HTTP_METHOD :" + request.getMethod());
        log.info("IP :" + request.getRemoteAddr());
        log.info("CLASS_METHOD" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("ARGS:" + Arrays.toString(joinPoint.getArgs()));
    }

    //请求之后
    @AfterReturning(returning = "res", pointcut = "WebLog()")
    public void doAfterReturning(Object res) throws JsonProcessingException {
        //处理完请求，返回内容
        log.info("RESPONSE :" + new ObjectMapper().writeValueAsString(res));
    }
}