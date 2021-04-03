package service;

import dao.ClientDao;
import dao.ClientDaoImpl;
import entity.Client;
import org.apache.log4j.Logger;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    Logger logger = Logger.getLogger(ClientServiceImpl.class);
    @Override
    public List<Client> getAll() {
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getAll();
    }
    @Override
    public void save(Client client) {
        logger.debug(client.toString());
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.save(client);
    }
    @Override
    public void update(Client client) {
        logger.debug(client.toString());
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.update(client);
    }
    @Override
    public void delete(Client client) {
        logger.debug(client.toString());
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(client);
    }
    @Override
    public Client getById(long id) {
        logger.debug(String.format("client.getById{id = %d}",id));
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getById(id);
    }
    @Override
    public Client searchByPhone(long phone) {
        logger.debug(String.format("client.searchByPhone {phone = %d}",phone));
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.searchByPhone(phone);
    }
}
