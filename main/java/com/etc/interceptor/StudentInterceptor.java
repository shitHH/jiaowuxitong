package com.etc.interceptor;

import com.etc.po.Admin;
import com.etc.vo.StudentVO;
import com.etc.vo.TeacherVO;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/11 22:37
 * 学生权限拦截器
 */
@Component
public class StudentInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object currentUser = session.getAttribute("currentUser");
        if (currentUser instanceof StudentVO) {
            StudentVO studentVO = (StudentVO) currentUser;
            return true;
        }
        response.sendRedirect("/edu/login?type=4");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
