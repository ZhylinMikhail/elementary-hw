package dao;

import entity.Status;

import java.util.List;

public interface StatusDao {
    List<Status> getAll();
    void save(Status status);
    void update(Status status);
    void delete(Status status);
    Status getById(long id);
}
