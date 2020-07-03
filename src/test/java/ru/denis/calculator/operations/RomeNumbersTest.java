package ru.denis.calculator.operations;

import org.junit.Before;
import org.junit.Test;
import ru.denis.calculator.enums.RomeEnum;
import ru.denis.calculator.exceptions.CalculatorException;

public class RomeNumbersTest {
    String firstNum;
    String secondNum;
    String operation;


    @Before
    public void setUp() {
        firstNum = "I";
        secondNum = "II";
        operation = "+";
    }

    @Test
    public void calculation() throws CalculatorException {
        String result = RomeNumbers.calculation(firstNum,secondNum,operation);
        System.out.println(result);
    }
}