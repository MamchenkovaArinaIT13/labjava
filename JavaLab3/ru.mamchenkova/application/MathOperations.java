package ru.mamchenkova.application;

public class MathOperations {
    // Метод принимает набор числовых значений и возвращает их сумму
    public static double sumNumbers(Number... numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
