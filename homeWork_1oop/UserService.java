import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService implements VerifyAccount {
    @Override
    public void writeAccount(Accounts accounts) throws IOException {
        System.out.println("This method is not available in this service");

    }

    @Override
    public void CheckAccount(Accounts accounts) throws FileNotFoundException {
        FileReader fileReader = new FileReader("D:\\Hillel Elementary\\HoweWork#8\\src\\adminService");
        Scanner scanner = new Scanner(fileReader);
        String[] adm = new String[5];
        int count = 0;
        while (scanner.hasNextLine()) {
            adm[count++] = scanner.nextLine();

        }
        for (int j = 0; j < adm.length; j++) {
            if (adm[j].equals(accounts.getMail())) {
                System.out.println(true + " " + accounts.getMail());


            }


        }
    }
}
