package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        int divider = 3;
        String result;
        if (LogicNot.isEven(number)) {
            if (number % divider == 0) {
                result = "Исходное число делится на 6.";
            } else {
                result = "Исходное число не делится на 3, но является четным.";
            }
        } else {
            if (number % divider == 0) {
                result = "Исходное число делится на 3, но не является четным.";
            } else {
                result = "Исходное число не делится на 3 и не является четным.";
            }
        }
        return result;
    }
}
