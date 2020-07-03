package ru.denis.calculator.exceptions;

public class WrongOperationException extends CalculatorException {

    public WrongOperationException(String message) {
        super(message);
    }
}
