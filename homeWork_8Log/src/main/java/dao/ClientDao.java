package dao;

import entity.Client;

import java.util.List;

public interface ClientDao {
    List<Client> getAll();
    void save(Client client);
    void update(Client client);
    void delete(Client client);
    Client getById(long id);
    Client searchByPhone(long phone);
}
