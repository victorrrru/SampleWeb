package cn.sample.api.test.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by victorrrr on 2017/6/15.
 */
@WebFilter(filterName = "TestFilter",urlPatterns = "/test/register")
public class TestFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //System.out.println(req.getParameter("version"));
        System.out.println(((HttpServletRequest) req).getMethod());
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("TestFilter init");
    }

}