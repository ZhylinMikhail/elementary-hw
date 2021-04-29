package util;

import java.util.Optional;
import java.util.regex.Pattern;

public class EmailValid {
    public static Optional<String> validEmail(String mail) {
        String regExMail = "\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*.\\w{2,4}";
        if (mail == null || mail.isEmpty() || !Pattern.matches(regExMail,mail)) {
            System.out.println("null");
            return Optional.empty().orElseThrow(Exception);
        }
        System.out.println("valid mail " + mail);
        return Optional.of(mail);
    }
}