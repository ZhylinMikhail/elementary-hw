package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {
    public static boolean checkPhoneNumber(String phoneNumber) {
        boolean result = phoneNumber.matches("^\\+([3][8][0])\\d{9}");
        if (result == true) {
            System.out.println("okay, is valid phoneNumber");
        } else {
            System.out.println("invalid... phoneNumber");
        }
        return result;
    }

    public static boolean EmailValidator(String email) {
        Pattern pattern = Pattern.compile("\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*.\\w{2,4}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches() == true) {
            System.out.println("okay, is valid mail");
        } else {
            System.out.println("invalid email");
        }
        return matcher.matches();
    }

    public static void dataValidator(String data) {
        Pattern pattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)");
        Matcher matcher = pattern.matcher(data);
        if (matcher.matches() == true) {
            System.out.println("okay, is valid data");
        } else {
            System.out.println("invalid data");
        }
    }
}
