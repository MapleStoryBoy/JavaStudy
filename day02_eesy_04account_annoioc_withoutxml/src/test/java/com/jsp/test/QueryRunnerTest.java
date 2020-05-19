/**
 * FileName: QueryRunnerTest
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/12/3 8:36 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.test;

import config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *测试QueryRunner是否单例
 * @author mac

 * @create 2019/12/3
 *

 */
public class QueryRunnerTest {

    @Test
    public void testQueryRunner(){
        //1,获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2,获取queryrunner对象
        QueryRunner runner = ac.getBean("runner",QueryRunner.class);
        QueryRunner runner1 = ac.getBean("runner",QueryRunner.class);
        System.out.println(runner == runner1);

    }
}