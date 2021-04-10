package servive;

import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.*;
class CalculatorTest {
    private static final int EVEN_DIGIT = 22;
    private static final int NO_EVEN_DIGIT = 21;
    private Calculator calculator = new Calculator();
    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @SneakyThrows
    @Test
    void checkDigitalZero() {
        calculator.plus(5,4);
        System.out.println("inner lines");
    }
@SneakyThrows
    @Test
    void checkEvenDigit() {
        boolean result = calculator.CheckEvenDigit(EVEN_DIGIT);


    }
}