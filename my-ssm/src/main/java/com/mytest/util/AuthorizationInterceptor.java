package com.mytest.util;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 自定义拦截器 (过滤登录请求)
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        Object obj = session.getAttribute("login");
        if (obj != null) {
            return true; // 放过请求
        }
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        return false;
    }
}
