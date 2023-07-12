package com.etc.interceptor;

import com.etc.po.Admin;
import com.etc.vo.StudentVO;
import com.etc.vo.TeacherVO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author yyt
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/11 19:12:59
 * 登录权限拦截器
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    Logger logger = Logger.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("进入登录拦截器了！");
        HttpSession session = request.getSession();
        Object currentUser = session.getAttribute("currentUser");
        if (currentUser != null) {
            return true;
        }
        response.sendRedirect("/edu/tologin");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
