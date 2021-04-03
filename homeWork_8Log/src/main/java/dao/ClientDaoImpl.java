package dao;

import entity.Client;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.List;

public class ClientDaoImpl implements ClientDao {
    Logger logger = Logger.getLogger(ClientDaoImpl.class);
    @Override
    public List<Client> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (List<Client>) session.createQuery("FROM entity.Client").list();
    }
    @Override
    public void save(Client client) {
        logger.debug(client.toString());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.close();
    }
    @Override
    public void update(Client client) {
        logger.debug(client.toString());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(client);
        transaction.commit();
        session.close();
    }
    @Override
    public void delete(Client client) {
        logger.debug(client.toString());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(client);
        transaction.commit();
        session.close();
    }
    @Override
    public Client getById(long id) {
        logger.debug(String.format("client.getById{id = %d}",id));
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.byId(Client.class).getReference(id);
    }
    @Override
    public Client searchByPhone(long phone) {
        logger.debug(String.format("client.searchByPhone {phone = %d}",phone));
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Client.class);
        return (Client) criteria.add(Restrictions.eq("phone", phone))
                .uniqueResult();
    }
}


