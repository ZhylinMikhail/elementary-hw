import FourInterface.FirstInterface;
import FourInterface.FourthInterface;
import FourInterface.SecondInterface;
import FourInterface.ThirdInterface;
import entity.DuckClassic;
import entity.DuckRubber;
import util.EmailValid;


public class Main {
    public static void main(String[] args) {
//        DuckClassic duckClassic = new DuckClassic();
//        FirstInterface.fly("fly");
//        SecondInterface.fly("fly fly");
//        duckClassic.behavior();
//        duckClassic.quack(" quack ");
//        duckClassic.swim("swim");
//
//        DuckRubber duckRubber = new DuckRubber();
//        ThirdInterface.fly("not fly");
//        FourthInterface.fly("not fly!!!");
//        duckRubber.behavior();
//        duckRubber.quack(" squeak");
//        duckRubber.swim(" swim in bathroom");


        EmailValid.validEmail("blalba@mail.ru");
        EmailValid.validEmail("  ");
        EmailValid.validEmail(null);


    }


}

