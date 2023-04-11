package com.it.gourmet.filter;

import com.alibaba.fastjson.JSON;
import com.it.gourmet.common.BaseContext;
import com.it.gourmet.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "loginCheckFilter", urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {
//    路径匹配器，支持通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //1.获取到本次请求的uri
        String requestURI = request.getRequestURI();
        //打印请求的是哪个URI
        log.info(requestURI);
        //定义不需要处理的请求路径
        String[] urls = new String[]{
          "/employee/login",
          "/employee/logout",
          "/backend/**",
          "/front/**",
                "/common/**",
                "/user/sendMsg", //移动端发送短信
                "/user/login"  //移动端登录
        };

        //2.判断本次请求是否需要放行处理
        boolean check = check(urls, requestURI);
        //3.如果不需要。直接放行
        if (check){
            log.info("本次请求 {} 不需要处理", requestURI);
            filterChain.doFilter(request,response);
            return;
        }
        //4.1 判断登录状态，已登录直接放行
        if (request.getSession().getAttribute("employee") != null) {
            log.info("用户已登录，用户id为 {}", request.getSession().getId());

            Long empId = (Long) request.getSession().getAttribute("employee");
//            log.info(empId.toString());
            BaseContext.setCurrentId(empId);
//            log.info(BaseContext.getCurrentId().toString());

//            long id = Thread.currentThread().getId();
//            log.info("线程id为： {}" , id);

            filterChain.doFilter(request,response);
            return;
        }

        //4.2 判断登录状态，已登录直接放行
        if (request.getSession().getAttribute("user") != null) {
            log.info("用户已登录，用户id为 {}", request.getSession().getAttribute("user"));

            Long userId = (Long) request.getSession().getAttribute("user");
//            log.info(empId.toString());
            BaseContext.setCurrentId(userId);

            filterChain.doFilter(request,response);
            return;
        }

        //5.未登录则返回未登录结果并前端自动跳转登录页面
        response.getWriter().write(JSON.toJSONString(Result.error("NOTLOGIN")));
        return;
    }

    /**
     * 路径匹配，检查本次请求是否需要放行
     * @param requestURI
     * @return
     */
    public boolean check(String[] urls,String requestURI){
        for (String url:  urls){
            boolean match = PATH_MATCHER.match(url, requestURI);
            if (match) {
                return true;
            }
        }
        return false;

    }


}
