package com.jsp.service.impl;

import com.jsp.dao.IAccountDao;
import com.jsp.dao.impl.AccountDaoImpl;
import com.jsp.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

   private IAccountDao accountDao = new AccountDaoImpl();

    public void  saveAccount(){
        accountDao.saveAccount();
    }
}
