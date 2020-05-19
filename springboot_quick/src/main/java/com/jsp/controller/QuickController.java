/**
 * FileName: QuickController
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/1/5 6:39 下午
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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/1/5
 *

 */
@Controller
public class QuickController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "nihao springboot";
    }


}