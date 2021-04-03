import entity.Account;
import entity.Client;
import entity.Status;
import service.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientServiceImpl();
        Client client = new Client();

//        System.out.println(clientService.searchByPhone(380997394226L));
//
//        List<Client> clients = clientService.getAll();
//        System.out.println(clients);
//
//        System.out.println(clientService.getById(5));

        client.setName("Klavdiya");
        client.setEmail("klavaa@mail.ru");
        client.setPhone(150192444444L);
        client.setAbout("TEST1");
        clientService.save(client);

//        client.setName("Abragim");
//        client.setEmail("sabak@mail.ru");
//        client.setPhone(152412444444L);
//        client.setAbout("TEST2");
//        clientService.update(client);
//
//        client.setId(39);
//        clientService.delete(client);
//
//
//        AccountService accountService = new AccountServiceImpl();
//        Account account = new Account();
//
//        List<Account> accounts = accountService.getAll();
//        System.out.println(accounts);
//
//        System.out.println(accountService.getById(3));
//
//        account.setClientId(4);
//        account.setNumber("232312312");
//        account.setValue(300);
//        accountService.save(account);
//
//        account.setId(22);
//        account.setNumber("24224124124");
//        account.setValue(5000);
//        accountService.update(account);
//
//        account.setId(22);
//        accountService.delete(account);
//
//
//        StatusService statusService = new StatusServiceImps();
//        Status status = new Status();
//
//        System.out.println(statusService.getById(2));
//
//        List<Status> statuses = statusService.getAll();
//        System.out.println(statuses);
//
//        status.setAlias("elementary");
//        status.setDiscription("up to 300");
//        statusService.save(status);
//
//
//        status.setId(6);
//        status.setAlias("RICH");
//        status.setDiscription("up to 1000000");
//        statusService.update(status);
    }
}
