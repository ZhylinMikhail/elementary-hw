package dao;

import entity.Account;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    Logger logger = Logger.getLogger(AccountDaoImpl.class);
    @Override
    public List<Account> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (List<Account>) session.createQuery("FROM entity.Account").list();
    }
    @Override
    public void save(Account account) {
        logger.debug(account.toString());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(account);
        transaction.commit();
        session.close();
    }
    @Override
    public void update(Account account) {
        logger.debug(account.toString());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(account);
        transaction.commit();
        session.close();
    }
    @Override
    public void delete(Account account) {
        logger.debug(account.toString());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(account);
        transaction.commit();
        session.close();
    }
    @Override
    public Account getById(long id) {
        logger.debug(String.format("account.getById {id = %d}", id));
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.byId(Account.class).getReference(id);
    }
}