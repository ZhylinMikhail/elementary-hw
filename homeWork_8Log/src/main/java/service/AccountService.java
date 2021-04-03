package service;

import entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();
    void save(Account account);
    void update(Account account);
    void delete(Account account);
    Account getById(long id);
}
