/**
 * FileName: UserApi
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/3/22 3:11 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.leyou.user.api;

import com.leyou.user.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/3/22
 *

 */

public interface UserApi {
    @GetMapping("query")
    public User queryUser(
            @RequestParam("username")String username,
            @RequestParam("password")String password
    );
}