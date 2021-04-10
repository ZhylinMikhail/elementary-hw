package entity;

import FourInterface.FirstInterface;
import FourInterface.SecondInterface;

public class DuckClassic implements FirstInterface, SecondInterface {
    @Override
    public void behavior() {
        System.out.println("crazy behavior duck");

    }

    @Override
    public void quack(String string) {
        System.out.println("implement or override " + string);

    }

    @Override
    public void swim(String string) {
        System.out.println("implement or override "+ string );

    }
}
