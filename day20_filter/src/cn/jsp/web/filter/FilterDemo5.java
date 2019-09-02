package cn.jsp.web.filter;

import javax.servlet.*;
import java.io.IOException;

//浏览器直接请求资源时，该过滤器会被执行
//@WebFilter(value="/index.jsp",dispatcherTypes = DispatcherType.REQUEST)
//@WebFilter(value="/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
//@WebFilter(value="/index.jsp",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class FilterDemo5 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo5...");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
