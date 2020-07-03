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
       if (num.equals(RomeEnum.I.getKey())) {
           result = RomeEnum.I.getValue();
       } else if (num.equals(RomeEnum.II.getKey())) {
           result = RomeEnum.II.getValue();
       } else if (num.equals(RomeEnum.III.getKey())) {
           result = RomeEnum.III.getValue();
       } else if (num.equals(RomeEnum.IV.getKey())) {
           result = RomeEnum.IV.getValue();
       } else if (num.equals(RomeEnum.V.getKey())) {
           result = RomeEnum.V.getValue();
       } else if (num.equals(RomeEnum.VI.getKey())) {
           result = RomeEnum.VI.getValue();
       } else if (num.equals(RomeEnum.VII.getKey())) {
           result = RomeEnum.VII.getValue();
       } else if (num.equals(RomeEnum.VIII.getKey())) {
           result = RomeEnum.VIII.getValue();
       } else if (num.equals(RomeEnum.IX.getKey())) {
           result = RomeEnum.IX.getValue();
       } else if (num.equals(RomeEnum.X.getKey())) {
           result = RomeEnum.X.getValue();
       } else {
           result = -1;
       }
       return result;
   }

    public static String calculation(String num1, String num2, String operation) throws CalculatorException {
        int result = 0;
        int firstNum = choiceNum(num1);
        int secondNum = choiceNum(num2);
        switch (operation) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            default:
                throw new WrongOperationException(Errors.OPERATIONS.getMessage());
        }
        return toRome(result);
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
