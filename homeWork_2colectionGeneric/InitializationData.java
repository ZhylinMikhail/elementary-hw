import com.sun.deploy.util.OrderedHashSet;

import java.util.*;

public class InitializationData {


    public void thirtyValues(Information information) {
        List<String> pseudonym = new ArrayList<>();
        Set<String> hashMail = new HashSet<>();
        Map<String, String> mailPseudonym = new HashMap<>();

        for (int i = 0; i < 30; i++) {
            pseudonym.add("Pseudonym" + i);
            hashMail.add("Blabla" + i + "@mail.ru");
        }
        System.out.println("pseudonym.size() is..." + pseudonym.size());
        System.out.println("mail.size() is... " + hashMail.size());
       // System.out.println("mailPseudonym.size() is... " + mailPseudonym.size());
    }

    public void idenValues(Information information) {
        List<String> pseudonym = new ArrayList<>();
        Set<String> hashMail = new HashSet<>();
        Map<String, String> mailPseudonym = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            pseudonym.add("pseudonym007");
            hashMail.add("bla007@mail.ru");
        }
        System.out.println("pseudonym.size() " + pseudonym.size());
        System.out.println("mail.size() " + hashMail.size());
       // System.out.println("mailPseudonym.size() " + mailPseudonym.size());
    }

//    public void correctionList(Information information) {
//        //Information information = new Information();
//        if (!information.getPseudonym().contains()) {
//            information.getPseudonym().add();
//        }
//    }

}
