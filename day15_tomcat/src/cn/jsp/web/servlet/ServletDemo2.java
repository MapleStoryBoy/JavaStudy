/**
 * FileName: ServletDemo2
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/8/24 8:59 上午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package cn.jsp.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Jsp

 * @create 2019/8/24
 *

 */
public class ServletDemo2 implements Servlet {
    /**
     * 初始化方法
     * 在servlet被创建时，执行，只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init。。。。");
    }

    /**
     * 获取ServletConfig对象
     * ServletConfig：Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法
     * 每一次Servlet被访问时，执行。执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service。。。。");
    }

    /**
     * 获取Servlet的一些信息，版本，作者等等
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器关闭时，执行。执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy。。。");
    }
}