/**
 * FileName: AccountServiceImpl
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/11/21 9:13 下午
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

import com.jsp.dao.IAccountDao;
import com.jsp.domain.Account;
import com.jsp.service.IAccountService;
import com.jsp.utils.TransactionManager;

import java.util.List;

/**
 * 账户业务层实现类
 * @author mac

 * @create 2019/11/21
 *

 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {

        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();

    }


    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
            accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
            accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
            accountDao.deleteAccount(accountId);
    }

    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("transfer......");
            //2.1，根据名称查询转出账户
            Account source = accountDao.findAccountByName(sourceName);
            //2.2，根据名称查询转入账户
            Account target = accountDao.findAccountByName(targetName);
            //2.3，转出账户减钱
            source.setMoney(source.getMoney()-money);
            //2.4，转入账户加钱
            target.setMoney(target.getMoney()+money);
            //2.5，更新转出账户
            accountDao.updateAccount(source);
            //2.6，更新转入账户
            accountDao.updateAccount(target);


    }
}