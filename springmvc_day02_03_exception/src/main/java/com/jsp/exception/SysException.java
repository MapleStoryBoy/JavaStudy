/**
 * FileName: SysException
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/1/1 7:31 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.exception;

/**
 * 自定义异常类
 *
 * @author mac

 * @create 2020/1/1
 *

 */
public class SysException extends Exception{

    //存储提示信息
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //构造方法
    public SysException(String message) {
        this.message = message;
    }


}