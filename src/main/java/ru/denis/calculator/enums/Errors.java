package ru.denis.calculator.enums;

public enum Errors {
    NUMBERS("Введите только арабкисе цифры(1-10) или только римские цифры(I-X)"),
    OPERATIONS("Вы ввели неверную операцию."),
    INPUT("Введи операцию в формате:цифра операция(+,-,*,/) цифра");

    private String message;
    Errors(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
