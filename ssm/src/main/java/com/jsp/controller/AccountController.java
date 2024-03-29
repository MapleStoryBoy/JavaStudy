/**
 * FileName: AccountController
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/1/2 4:28 下午
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

import com.jsp.domain.Account;
import com.jsp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户Web
 * @author mac

 * @create 2020/1/2
 *

 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有的账户信息。。。");
        //调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    /**
     * 保存
     * @param
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }



}