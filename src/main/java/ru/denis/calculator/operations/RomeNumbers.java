package ru.denis.calculator.operations;

import ru.denis.calculator.enums.Errors;
import ru.denis.calculator.enums.RomeEnum;
import ru.denis.calculator.exceptions.CalculatorException;
import ru.denis.calculator.exceptions.WrongOperationException;

public class RomeNumbers {
    private RomeNumbers(){
    }

   public static int choiceNum(String num) {
       int result = 0;
       if (RomeEnum.I.getKey().equals(num)) {
           result = RomeEnum.I.getValue();
       } else if (RomeEnum.II.getKey().equals(num)) {
           result = RomeEnum.II.getValue();
       } else if (RomeEnum.III.getKey().equals(num)) {
           result = RomeEnum.III.getValue();
       } else if (RomeEnum.IV.getKey().equals(num)) {
           result = RomeEnum.IV.getValue();
       } else if (RomeEnum.V.getKey().equals(num)) {
           result = RomeEnum.V.getValue();
       } else if (RomeEnum.VI.getKey().equals(num)) {
           result = RomeEnum.VI.getValue();
       } else if (RomeEnum.VII.getKey().equals(num)) {
           result = RomeEnum.VII.getValue();
       } else if (RomeEnum.VIII.getKey().equals(num)) {
           result = RomeEnum.VIII.getValue();
       } else if (RomeEnum.IX.getKey().equals(num)) {
           result = RomeEnum.IX.getValue();
       } else if (RomeEnum.X.getKey().equals(num)) {
           result = RomeEnum.X.getValue();
       } else {
           result = -1;
       }
       return result;
   }

    public static String calculation(String num1, String num2, String operation) throws CalculatorException {
        int result = 0;
        String romeNum = "";
        int firstNum = choiceNum(num1);
        int secondNum = choiceNum(num2);
        switch (operation) {
            case "+":
                result = firstNum + secondNum;
                romeNum = toRome(result);
                break;
            case "-":
                result = firstNum - secondNum;
                if (result < 0) {
                    result *= -1;
                    romeNum = "-" + toRome(result);
                } else {
                    romeNum = toRome(result);
                }
                break;
            case "*":
                result = firstNum * secondNum;
                romeNum = toRome(result);
                break;
            case "/":
                result = firstNum / secondNum;
                romeNum = toRome(result);
                break;
            default:
                throw new WrongOperationException(Errors.OPERATIONS.getMessage());
        }
        return romeNum;
    }
    public static String toRome(int key) {
        for (RomeEnum i : RomeEnum.values()) {
            if (i.getValue() == key) {
                return i.getKey();
            }
        }
        return "";
    }
}
