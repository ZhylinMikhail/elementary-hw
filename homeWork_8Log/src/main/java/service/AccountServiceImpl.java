package service;

import dao.AccountDao;
import dao.AccountDaoImpl;
import entity.Account;
import org.apache.log4j.Logger;


import java.util.List;

public class AccountServiceImpl implements AccountService {
    Logger logger = Logger.getLogger(AccountServiceImpl.class);
    @Override
    public List<Account> getAll() {
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getAll();
    }
    @Override
    public void save(Account account) {
        logger.debug(account.toString());
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.save(account);
    }
    @Override
    public void update(Account account) {
        logger.debug(account.toString());
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.update(account);
    }
    @Override
    public void delete(Account account) {
        logger.debug(account.toString());
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(account);
    }
    @Override
    public Account getById(long id) {
        logger.debug(String.format("account.getById {id = %d}", id));
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getById(id);
    }
}
