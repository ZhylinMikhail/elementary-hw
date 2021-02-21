import exceptions.NullStringException;
import utils.StringHelper;
import utils.StringValidator;

public class Main {
    public static void main(String[] args) throws NullStringException {
        char[] chars = { ' ','h', 'E', 'l', 'L', 'o', 'w', 'o', 'R', 'l','d',' '};
        String arrayToString = null;

        String result = StringHelper.fromArrayToString(chars, arrayToString);
        System.out.println(result);

        String myPhone = "+380997394226";
        StringValidator.checkPhoneNumber(myPhone);

        String email = "Zhylin.Misha@mail.com";
        StringValidator.EmailValidator(email);

        String data = "28.09.1992";
        StringValidator.dataValidator(data);


    }
}

