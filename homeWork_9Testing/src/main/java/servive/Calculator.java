package servive;

import Exceptions.DigitalException;

public class Calculator {
    public int plus(int a, int b) throws DigitalException {
        if (a + b == 0) {
            throw new DigitalException();
        }
        return a + b;
    }

    public boolean CheckEvenDigit(int a) {
        boolean result = false;
        if (a % 2 == 0) {
            result = true;
        }
        return result;

    }
}
