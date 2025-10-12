package ru.mamchenkova.main;

public class Main {
    public static void main(String[] args) {

        // Задание 7.3 - Возведение в степень из аргументов командной строки
        if (args.length >= 2) {
            String xStr = args[0];
            String yStr = args[1];
            double result = power(xStr, yStr);
            System.out.printf("Результат возведения %s в степень %s: %.2f%n", xStr, yStr, result);
        } else {
            // Демонстрация без аргументов
            System.out.println("\nДемонстрация метода возведения в степень:");
            System.out.println("2^3 = " + power("2", "3"));
            System.out.println("5^2 = " + power("5", "2"));
        }

        // Запуск меню приложения
        ru.mamchenkova.application.MenuSystem menu = new ru.mamchenkova.application.MenuSystem();
        menu.showMainMenu();
        menu.close();
    }

    public static double power(String xStr, String yStr) {
        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);
        return Math.pow(x, y);
    }
}
