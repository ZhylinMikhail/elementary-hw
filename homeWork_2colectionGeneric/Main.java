import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Information information = new Information();
        InitializationData initializationData = new InitializationData();
        initializationData.thirtyValues(information);
        initializationData.idenValues(information);
        //initializationData.correctionList(information.getPseudonym());

       List<Integer> integerList = new ArrayList<>();
        integerList.add(55);
        integerList.add(55);
        integerList.add(56);
        wildCards(integerList,information);


    }

    public static Information wildCards(List<? extends Number> lists, Information information) {

        for (int i = 0; i < lists.size(); i++) {

            if (!information.getHashMail().contains(lists.get(i) + "@mail.com")) {
                information.getPseudonym().add(lists.get(i).toString());
                information.getHashMail().add("user" + lists.get(i) + "@mail.com");
                information.getMailPseudonym().put(information.getHashMail(), information.getPseudonym());
            }
        }            System.out.println("Mail & pseudonym in map.. " + information.getMailPseudonym());

        return information;
    }
}





