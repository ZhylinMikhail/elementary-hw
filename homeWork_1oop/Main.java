import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Admin admin = new Admin("ADMIN");
        User user = new User("USER");

        AdminService adminService = new AdminService();
        UserService userService = new UserService();

        admin.setName("Petro");
        admin.setSurname("Petrenko");
        admin.setAge("35");
        admin.setMail("lalala@mail.ru");
        admin.setPassword("qwerty");

        user.setName("Mihail");
        user.setSurname("Zhylin");
        user.setAge("28");
        user.setMail("misha@mail.ru");
        user.setPassword("blablabla");

        userService.writeAccount(user);
        adminService.writeAccount(admin);
        adminService.CheckAccount(admin);
        adminService.writeAccount(user);
        userService.CheckAccount(user);






    }
}
