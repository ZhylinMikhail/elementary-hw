package dao;

import entity.Status;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class StatusDaoImpl implements StatusDao {
    Logger logger = Logger.getLogger(StatusDaoImpl.class);
    @Override
    public List<Status> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (List<Status>) session.createQuery("FROM entity.Status").list();
    }
    @Override
    public void save(Status status) {
        logger.debug(status.toString());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(status);
        transaction.commit();
        session.close();
    }
    @Override
    public void update(Status status) {
        logger.debug(status.toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(status);
        transaction.commit();
        session.close();
    }
    @Override
    public void delete(Status status) {
        logger.debug(status.toString());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(status);
        transaction.commit();
        session.close();
    }
    @Override
    public Status getById(long id) {
        logger.debug(String.format("status.getById{id = %d}",id));
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.byId(Status.class).getReference(id);
    }
}
