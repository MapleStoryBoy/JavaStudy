/**
 * FileName: LamdbaExpressDemo02
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/4/24 4:54 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.maple;

/**
 * 1,函数是编程
 *
 */
public class LamdbaExpressDemo02 {
    public static void main(String[] args) {
//        Foo foo = () -> {
//            System.out.println("hello");
//        };
//        foo.sayHello();
        Foo foo = (int x,int y) -> {
            System.out.println("123");
            return x + y;
        };
        System.out.println(foo.add(3,5));
    }
}

interface Foo{
    //public void sayHello();
    public int add(int x,int y);
}
