import com.google.common.base.Strings;

public class Main {
    public static void main(String[] args) {
        User anna = new User("Anna",26);
        User alina = new User("Alina",18);
        System.out.println(Strings.commonSuffix(anna.getName(),alina.getName()));
        System.out.println(Strings.padEnd(anna.getName(),10,'.'));
        System.out.println(Strings.padEnd(alina.getName(),10,'.'));
    }

}
