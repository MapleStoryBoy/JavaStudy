/**
 * FileName: IndexController
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/4/12 8:39 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.example.demo0105;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/4/12
 *

 */
@Controller
public class IndexController {
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello idea springboot";
    }
}