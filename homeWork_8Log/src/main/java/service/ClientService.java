package service;

import entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAll();
    void save(Client client);
    void update(Client client);
    void delete(Client client);
    Client getById(long id);
    Client searchByPhone(long phone);
}
