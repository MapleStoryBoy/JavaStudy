/**
 * FileName: UserController
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/12/30 9:15 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.controller;

import com.jsp.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.AttributedString;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2019/12/30
 *

 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了。。。。");
        // 模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("Jsp");
        user.setPassword("510210");
        user.setAge(29);
        // model对象
        model.addAttribute("user",user);
        return "success";
    }

    /**
     *
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid方法执行了。。。。");
        // 编写请求转发的程序
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        // 重定向
        //response.sendRedirect(request.getContextPath()+"/index.jsp");
        // 设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        // 直接会进行响应
        response.getWriter().print("你好");
        return;
    }

    /**
     * 返回ModelAndView
     * @param model
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(Model model){
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelAndView方法执行了。。。。");
        // 模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("Jsp1");
        user.setPassword("510210");
        user.setAge(29);

        //把user对象存储到mv对象中，也会把user对象存入到request对象
        mv.addObject("user",user);
        //跳转到哪个页面
        mv.setViewName("success");

        return mv;
    }

    /**
     * 使用关键字的方式进行转发或者重定向
     * @param
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("testForwardOrRedirect方法执行了。。。。");
        // 请求的转发
        //return "forward:/WEB-INF/pages/success.jsp";
        // 重定向
        return "redirect:/index.jsp";
    }


    /**
     * 模拟异步请求响应
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了...");
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        // 做响应，模拟查询数据库
        user.setUsername("haha");
        user.setAge(40);
        // 做响应
        return user;
    }

}