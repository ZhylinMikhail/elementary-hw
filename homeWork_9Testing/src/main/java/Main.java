import Exceptions.DigitalException;
import servive.Calculator;

public class Main {
    public static void main(String[] args) throws DigitalException {
        Calculator calculator = new Calculator();
        int res = calculator.plus(10,5);
        System.out.println(res);
        System.out.println(calculator.CheckEvenDigit(21));
    }
}
