/**
 * FileName: AccountServiceImpl
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/12/11 9:05 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.service.impl;

import com.jsp.service.IAccountService;
import org.springframework.stereotype.Service;


/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    public void saveAccount() {
        System.out.println("执行了保存");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新" + i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}