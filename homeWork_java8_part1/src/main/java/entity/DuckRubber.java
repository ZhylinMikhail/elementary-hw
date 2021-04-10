package entity;

import FourInterface.FourthInterface;
import FourInterface.ThirdInterface;

public class DuckRubber implements ThirdInterface, FourthInterface {

    @Override
    public void behavior() {
        System.out.println("Плавает в ванной");
    }


}
