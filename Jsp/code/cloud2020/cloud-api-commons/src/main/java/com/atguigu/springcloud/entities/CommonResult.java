/**
 * FileName: CommonResult
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/4/29 2:36 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/4/29
 *

 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //404 not_found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }


}
