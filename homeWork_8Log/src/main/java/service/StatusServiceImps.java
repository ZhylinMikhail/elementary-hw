package service;

import dao.StatusDao;
import dao.StatusDaoImpl;
import entity.Status;
import org.apache.log4j.Logger;

import java.util.List;

public class StatusServiceImps implements StatusService {
    Logger logger = Logger.getLogger(StatusServiceImps.class);
    @Override
    public List<Status> getAll() {
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getAll();
    }
    @Override
    public void save(Status status) {
        logger.debug(status.toString());
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.save(status);
    }
    @Override
    public void update(Status status) {
        logger.debug(status.toString());
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.update(status);
    }
    @Override
    public void delete(Status status) {
        logger.debug(status.toString());
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(status);
    }
    @Override
    public Status getById(long id) {
        logger.debug(String.format("status.getById{id = %d}",id));
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }
}
