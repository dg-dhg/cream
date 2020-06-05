package net.dhg.crm.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    //放行的条件
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        //看有没有登陆时传递的username
        if (loginUser == null) {
            request.setAttribute("msg", "you seems didnt login");
            request.getRequestDispatcher("login.html").forward(request, response);
            return false;//表示不放行
        } else
            return true;
    }

}
