package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class Car {
    private Driver driver;

    public synchronized String getString() {
        return "String from car ";
    }


    @SneakyThrows
    public synchronized String getFromDriver() {
        Thread.sleep(10);
        return driver.getString();
    }
}