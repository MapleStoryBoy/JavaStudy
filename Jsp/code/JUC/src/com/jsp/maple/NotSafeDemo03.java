/**
 * FileName: NotSafeDemo03
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/4/24 5:36 下午
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

import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/4/24
 *

 */
public class NotSafeDemo03 {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        for (int i = 1; i <= 30 ; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }

    }
}

