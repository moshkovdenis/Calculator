package ru.denis.calculator.operations;

import ru.denis.calculator.enums.Errors;
import ru.denis.calculator.exceptions.CalculatorException;
import ru.denis.calculator.exceptions.WrongNumberException;
import ru.denis.calculator.exceptions.WrongOperationException;

public class ArabicNumbers {
    private ArabicNumbers() {
    }
    public static int calculation(int firstNum, int secondNum, String operation) throws CalculatorException {
        if ((firstNum > 10 || secondNum > 10) || (firstNum < 1 || secondNum < 1)) {
            throw new WrongNumberException(Errors.NUMBERS.getMessage());
        }
        int result = 0;
        switch (operation) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            default:
                throw new WrongOperationException(Errors.OPERATIONS.getMessage());
        }
        return result;
    }
}
