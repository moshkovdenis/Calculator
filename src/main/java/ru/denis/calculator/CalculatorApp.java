package ru.denis.calculator;

import ru.denis.calculator.operations.ArabicNumbers;
import ru.denis.calculator.operations.RomeNumbers;
import ru.denis.calculator.enums.Errors;
import ru.denis.calculator.exceptions.CalculatorException;
import ru.denis.calculator.exceptions.InvalidInputException;
import ru.denis.calculator.exceptions.WrongNumberException;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) throws CalculatorException {

        String[] input = getString().split(" ");
        inputCheck(input);
        String operation = input[1];
        if (numberCheck(input[0]) && numberCheck(input[2])) {
            String fistNum = input[0].toUpperCase();
            String secondNum = input[2].toUpperCase();
            String result = RomeNumbers.calculation(fistNum,secondNum,operation);
            System.out.println(result);
        }  else {
            try {
                int firstNum = Integer.parseInt(input[0]);
                int secondNum = Integer.parseInt(input[2]);
                int result = ArabicNumbers.calculation(firstNum,secondNum,operation);
                System.out.println(result);
            } catch (NumberFormatException e) {
                throw new WrongNumberException(Errors.NUMBERS.getMessage());
            }
        }
    }
    public static String getString() {
        return new Scanner(System.in).nextLine();
    }
    public static void inputCheck(String[] input) throws InvalidInputException {
        if (input.length > 3) {
            throw new InvalidInputException(Errors.INPUT.getMessage());
        }
    }
    public static boolean numberCheck(String num) {
        return RomeNumbers.choiceNum(num) != -1;
    }
}
