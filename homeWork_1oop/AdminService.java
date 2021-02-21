import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdminService implements VerifyAccount {

    @Override
    public void writeAccount(Accounts accounts) throws IOException {
        String[] adminAcc = new String[5];
        adminAcc[0] = accounts.getName();
        adminAcc[1] = accounts.getSurname();
        adminAcc[2] = accounts.getAge();
        adminAcc[3] = accounts.getMail();
        adminAcc[4] = accounts.getPassword();

        FileWriter fileWriter = new FileWriter("D:\\Hillel Elementary\\HoweWork#8\\src\\adminService");

        for (String s : adminAcc) {
            fileWriter.write(s);
            fileWriter.append("\n");
            System.out.println(s);
        }
        fileWriter.close();
    }

    @Override
    public void CheckAccount(Accounts accounts) throws FileNotFoundException {
        FileReader fileReader = new FileReader("D:\\Hillel Elementary\\HoweWork#8\\src\\adminService");
        Scanner scanner = new Scanner(fileReader);

        String[] adminCheck = new String[5];
        int count = 0;
        while (scanner.hasNextLine()) {
            adminCheck[count++] = scanner.nextLine();
        }
        for (String s : adminCheck) {
            if (s.equals(accounts.getMail())) {
                System.out.println(true + " " + accounts.getMail());
            }
        }

    }


}



