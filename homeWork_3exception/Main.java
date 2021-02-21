import entity.Client;
import exception.WrongFieldException;
import exception.WrongSumException;
import service.TransactionService;
import java.util.Scanner;

import static util.ClientFieldsValidation.validateAccountIdSize;
import static util.ClientFieldsValidation.validateSum;

public class Main {
    public static void main(String[] args) {
        Client clientMisha = new Client();
        clientMisha.setLastName("Zhylin");

        Client clientDima = new Client();
        clientDima.setLastName("Ivanenko");

        setCheckAccountId(clientMisha);
        setCheckAccountId(clientDima);

        setCheckSum(clientMisha);


        TransactionService transactionService = new TransactionService();
        transactionService.transferMoney(clientMisha, clientMisha.getAccountId());


    }

    private static void setCheckSum(Client client) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("inter sum pls...");
            client.setSum(scanner.nextDouble());
            try {
                validateSum(client.getSum());

            } catch (WrongSumException e) {
                System.out.println("не коректрная сумма");
            }
        } while (!(client.getSum() <= 1000));
    }


    private static void setCheckAccountId(Client client) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("pls enter ID account client...");
            client.setAccountId(scanner.nextLine());
            try {
                validateAccountIdSize(client.getAccountId());
            } catch (WrongFieldException e) {
                System.out.println("не коректнное ID");
            }
        } while (!(client.getAccountId().length() == 10));
        System.out.println(client.getLastName() + " ввод прошёл успешно");
    }
}




