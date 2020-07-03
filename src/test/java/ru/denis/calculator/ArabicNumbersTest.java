package ru.denis.calculator;

import org.junit.Before;
import org.junit.Test;
import ru.denis.calculator.operations.ArabicNumbers;
import ru.denis.calculator.exceptions.CalculatorException;

public class ArabicNumbersTest {
    int firstNum;
    int secondNum;
    String operation;
    @Before
    public void setAll() {
        firstNum = 6;
        secondNum = 2;
        operation = "*";
    }

    @Test
    public void calculation() throws CalculatorException {
        int result = ArabicNumbers.calculation(firstNum,secondNum,operation);
        System.out.println(result);
    }
}