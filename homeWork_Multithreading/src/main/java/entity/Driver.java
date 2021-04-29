package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Driver {
    private Car car;

    public synchronized String getString() {
        return "String from driver ";
    }

    public synchronized String getFromCar() {
        return car.getString();
    }
}