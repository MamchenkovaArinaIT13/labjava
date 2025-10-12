package ru.mamchenkova.application;

import ru.mamchenkova.fraction.Fraction;
import ru.mamchenkova.person.Name;
import ru.mamchenkova.secrets.Secret;
import ru.mamchenkova.number.NumberFraction;

import java.util.Scanner;

public class MenuSystem {
    private Scanner scanner;

    public MenuSystem() {
        this.scanner = new Scanner(System.in);
    }

    public void showMainMenu() {
        while (true) {
            System.out.println("\n=== ЛАБОРАТОРНАЯ РАБОТА №3 (ВАРИАНТ 8) ===");
            System.out.println("1. Автоматический ввод (готовые данные)");
            System.out.println("2. Ручной ввод данных");
            System.out.println("3. Выход");
            System.out.print("Выберите опцию: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    autoInputMenu();
                    break;
                case "2":
                    manualInputMenu();
                    break;
                case "3":
                    System.out.println("Выход из программы...");
                    return;
                default:
                    System.out.println("Неверный выбор! Пожалуйста, выберите 1, 2 или 3.");
            }
        }
    }

    private void autoInputMenu() {
        while (true) {
            System.out.println("\n=== АВТОМАТИЧЕСКИЙ ВВОД ===");
            System.out.println("Выберите задание (будут использованы готовые данные):");
            System.out.println("1. Задание 1.4 - Дроби (неизменяемые)");
            System.out.println("2. Задание 1.7 - Непустые Имена");
            System.out.println("3. Задание 2.2 - Секреты");
            System.out.println("4. Задание 3.1 - Запретная Дробь");
            System.out.println("5. Задание 4.2 - Дробь это число");
            System.out.println("6. Задание 5.1 - Сложение");
            System.out.println("7. Задание 6.1 - Сравнение дробей");
            System.out.println("8. Задание 8.3 - Клонирование дроби");
            System.out.println("0. Назад в главное меню");
            System.out.print("Ваш выбор задания: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    executeAutoTask1();
                    break;
                case "2":
                    executeAutoTask2();
                    break;
                case "3":
                    executeAutoTask3();
                    break;
                case "4":
                    executeAutoTask4();
                    break;
                case "5":
                    executeAutoTask5();
                    break;
                case "6":
                    executeAutoTask6();
                    break;
                case "7":
                    executeAutoTask7();
                    break;
                case "8":
                    executeAutoTask8();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Неверный номер задания! Выберите от 0 до 8.");
            }
        }
    }

    // Авто ввод методы задач
    private void executeAutoTask1() {
        System.out.println("\n=== ЗАДАНИЕ 1.4 - ДРОБИ (НЕИЗМЕНЯЕМЫЕ) ===");

        try {
            // Создание дробей
            Fraction frac1 = new Fraction(3, 4);
            Fraction frac2 = new Fraction(-2, 5);
            Fraction frac3 = new Fraction(1, -3);
            Fraction frac4 = new Fraction(5, 1);

            System.out.println("Дробь 1: " + frac1);
            System.out.println("Дробь 2: " + frac2);
            System.out.println("Дробь 3: " + frac3);
            System.out.println("Дробь 4: " + frac4);

            // Попытка создания неправильной дроби
            try {
                Fraction frac5 = new Fraction(1, 0);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

            // Демонстрация неизменяемости
            System.out.println("\nДемонстрация неизменяемости:");
            System.out.println("Исходная дробь: " + frac1);
            System.out.println("Поля final - дробь нельзя изменить после создания");

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void executeAutoTask2() {
        System.out.println("\n=== ЗАДАНИЕ 1.7 - НЕПУСТЫЕ ИМЕНА ===");

        try {
            // Корректные имена
            Name name1 = new Name("Иванов", "Иван", "Иванович");
            Name name2 = new Name("Петров", "Петр");
            Name name3 = new Name("Сидоров");
            Name name4 = new Name(null, "Мария", null);

            System.out.println("Имя 1: " + name1);
            System.out.println("Имя 2: " + name2);
            System.out.println("Имя 3: " + name3);
            System.out.println("Имя 4: " + name4);

            // Попытка создания пустого имени
            try {
                Name name5 = new Name(null, null, null);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка при создании пустого имени: " + e.getMessage());
            }

            try {
                Name name6 = new Name("", "", "");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка при создании имени с пустыми строками: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void executeAutoTask3() {
        System.out.println("\n=== ЗАДАНИЕ 2.2 - СЕКРЕТЫ ===");

        try {
            // Создание первого секрета
            Secret secret1 = new Secret("Анна", "Секретная информация о проекте");
            System.out.println("Секрет 1: " + secret1);

            // Передача секрета другому человеку
            Secret secret2 = new Secret(secret1, "Борис");
            System.out.println("Секрет 2: " + secret2);

            // Передача дальше
            Secret secret3 = new Secret(secret2, "Виктор");
            System.out.println("Секрет 3: " + secret3);

            // Информация о цепочке
            System.out.println("\nИнформация о цепочке секретов:");
            System.out.println("Порядковый номер Анны: " + secret1.getOrderNumber());
            System.out.println("Порядковый номер Бориса: " + secret2.getOrderNumber());
            System.out.println("Порядковый номер Виктора: " + secret3.getOrderNumber());
            System.out.println("Количество людей после Анны: " + secret1.getPeopleAfter());
            System.out.println("Разница в длине текста между Анной и Виктором: " + secret1.getTextLengthDifference(2));

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void executeAutoTask4() {
        System.out.println("\n=== ЗАДАНИЕ 3.1 - ЗАПРЕТНАЯ ДРОБЬ ===");

        try {
            // Создание неизменяемых дробей
            Fraction frac1 = new Fraction(2, 3);
            Fraction frac2 = new Fraction(3, 4);

            System.out.println("Дробь 1: " + frac1);
            System.out.println("Дробь 2: " + frac2);

            // Демонстрация работы методов
            System.out.println("Числитель дроби 1: " + frac1.getNumerator());
            System.out.println("Знаменатель дроби 1: " + frac1.getDenominator());
            System.out.println("Десятичное значение дроби 1: " + frac1.doubleValue());

            // Демонстрация что класс final
            System.out.println("\nКласс Fraction объявлен как final - нельзя создать подкласс");

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void executeAutoTask5() {
        System.out.println("\n=== ЗАДАНИЕ 4.2 - ДРОБЬ ЭТО ЧИСЛО ===");

        try {
            // Создание дробей как Number
            NumberFraction frac1 = new NumberFraction(1, 2);
            NumberFraction frac2 = new NumberFraction(3, 4);

            System.out.println("Дробь 1: " + frac1);
            System.out.println("Дробь 2: " + frac2);

            // Методы класса Number
            System.out.println("\nМетоды класса Number:");
            System.out.println("intValue() дроби 1: " + frac1.intValue());
            System.out.println("longValue() дроби 1: " + frac1.longValue());
            System.out.println("floatValue() дроби 1: " + frac1.floatValue());
            System.out.println("doubleValue() дроби 1: " + frac1.doubleValue());

            // Использование в математических операциях
            System.out.println("\nМатематические операции:");
            double sum = frac1.doubleValue() + frac2.doubleValue();
            System.out.println(frac1 + " + " + frac2 + " = " + sum);

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void executeAutoTask6() {
        System.out.println("\n=== ЗАДАНИЕ 5.1 - СЛОЖЕНИЕ ===");

        try {
            // Разные числовые значения
            System.out.println("Демонстрация сложения разных числовых значений:");

            // 2 + 3
            Number[] numbers1 = {2, new NumberFraction(3, 5),2.3};
            System.out.println("2 + 3/5 + 2.3 = " + sumNumbers(numbers1));

            // 5 + 2.3
            Number[] numbers2 = {3.6, new NumberFraction(49, 12),3,new NumberFraction(3, 2)};
            System.out.println("3.6 + 49/12 + 3 + 3/2 = " + sumNumbers(numbers2));


            // 1 + 1.3
            Number[] numbers5 = {1, 1.3};
            System.out.println("1 + 1.3 = " + sumNumbers(numbers5));

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void executeAutoTask7() {
        System.out.println("\n=== ЗАДАНИЕ 6.1 - СРАВНЕНИЕ ДРОБЕЙ ===");

        try {
            Fraction frac1 = new Fraction(1, 2);
            Fraction frac2 = new Fraction(2, 4); // эквивалентна 1/2
            Fraction frac3 = new Fraction(1, 3);
            Fraction frac4 = new Fraction(1, 2);

            System.out.println("Дробь 1: " + frac1);
            System.out.println("Дробь 2: " + frac2 + " (эквивалентна 1/2)");
            System.out.println("Дробь 3: " + frac3);
            System.out.println("Дробь 4: " + frac4);

            System.out.println("\nСравнение через equals():");
            System.out.println("frac1.equals(frac2): " + frac1.equals(frac2) + " (должно быть true)");
            System.out.println("frac1.equals(frac3): " + frac1.equals(frac3) + " (должно быть false)");
            System.out.println("frac1.equals(frac4): " + frac1.equals(frac4) + " (должно быть true)");

            System.out.println("\nСравнение через ==:");
            System.out.println("frac1 == frac4: " + (frac1 == frac4) + " (разные объекты в памяти)");

            // Хэш-коды
            System.out.println("\nХэш-коды (должны совпадать для равных дробей):");
            System.out.println("Хэш-код frac1: " + frac1.hashCode());
            System.out.println("Хэш-код frac2: " + frac2.hashCode());
            System.out.println("Хэш-код frac4: " + frac4.hashCode());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void executeAutoTask8() {
        System.out.println("\n=== ЗАДАНИЕ 8.3 - КЛОНИРОВАНИЕ ДРОБИ ===");

        try {
            Fraction original = new Fraction(3, 5);
            Fraction cloned = original.clone();

            System.out.println("Оригинальная дробь: " + original);
            System.out.println("Клонированная дробь: " + cloned);

            System.out.println("\nПроверка клонирования:");
            System.out.println("Это один и тот же объект? " + (original == cloned));
            System.out.println("Объекты равны по equals? " + original.equals(cloned));
            System.out.println("Хэш-коды совпадают? " + (original.hashCode() == cloned.hashCode()));

            // Демонстрация независимости объектов
            System.out.println("\nХэш-коды в памяти:");
            System.out.println("Оригинал: " + System.identityHashCode(original));
            System.out.println("Клон: " + System.identityHashCode(cloned));

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void manualInputMenu() {
        while (true) {
            System.out.println("\n=== РУЧНОЙ ВВОД ДАННЫХ ===");
            System.out.println("Выберите категорию для ручного ввода:");
            System.out.println("1. Работа с классом Name (Задание 1.7)");
            System.out.println("2. Работа с классом Fraction (Задание 1.4)");
            System.out.println("3. Работа с классом Secret (Задание 2.2)");
            System.out.println("4. Работа с классом NumberFraction (Задание 4.2)");
            System.out.println("5. Демонстрация сложения (Задание 5.1)");
            System.out.println("6. Демонстрация клонирования (Задание 8.3)");
            System.out.println("0. Назад в главное меню");
            System.out.print("Выберите опцию: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    manualNameMenu();
                    break;
                case "2":
                    manualFractionMenu();
                    break;
                case "3":
                    manualSecretMenu();
                    break;
                case "4":
                    manualNumberFractionMenu();
                    break;
                case "5":
                    manualAdditionMenu();
                    break;
                case "6":
                    manualCloneMenu();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Неверный выбор! Пожалуйста, выберите от 0 до 6.");
            }
        }
    }

    private void manualNameMenu() {
        System.out.println("\n=== РУЧНОЙ ВВОД: КЛАСС NAME (ЗАДАНИЕ 1.7) ===");

        try {
            System.out.println("Создание имени с проверкой на непустоту:");

            System.out.print("Введите фамилию (можно пропустить): ");
            String lastName = scanner.nextLine().trim();

            System.out.print("Введите имя (обязательно): ");
            String firstName = getNonEmptyInput("Ошибка! Имя не может быть пустым. Введите имя: ");

            System.out.print("Введите отчество (можно пропустить): ");
            String surName = scanner.nextLine().trim();

            // Создание имени с валидацией
            Name name;
            if (!lastName.isEmpty() && !surName.isEmpty()) {
                name = new Name(lastName, firstName, surName);
            } else if (!lastName.isEmpty()) {
                name = new Name(lastName, firstName);
            } else if (!surName.isEmpty()) {
                name = new Name(firstName); // Только имя
            } else {
                name = new Name(firstName);
            }

            System.out.println("Создан объект Name: " + name);

        } catch (Exception e) {
            System.out.println("Ошибка при создании имени: " + e.getMessage());
        }
    }

    private void manualFractionMenu() {
        System.out.println("\n=== РУЧНОЙ ВВОД: КЛАСС FRACTION (ЗАДАНИЕ 1.4) ===");

        try {
            System.out.print("Введите числитель дроби: ");
            int num = getIntInput();
            System.out.print("Введите знаменатель дроби: ");
            int den = getNonZeroIntInput();

            Fraction fraction = new Fraction(num, den);
            System.out.println("Создана дробь: " + fraction);
            System.out.println("Десятичное значение: " + fraction.doubleValue());

            // Демонстрация неизменяемости
            System.out.println("\nДемонстрация неизменяемости:");
            System.out.println("Поля final - дробь нельзя изменить после создания");

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void manualSecretMenu() {
        System.out.println("\n=== РУЧНОЙ ВВОД: КЛАСС SECRET (ЗАДАНИЕ 2.2) ===");

        try {
            System.out.print("Введите имя первого хранителя секрета: ");
            String keeper1 = getNonEmptyInput("Имя не может быть пустым: ");

            System.out.print("Введите текст секрета: ");
            String secretText = getNonEmptyInput("Текст секрета не может быть пустым: ");

            Secret secret1 = new Secret(keeper1, secretText);
            System.out.println("Создан секрет: " + secret1);

            System.out.print("\nВведите имя второго хранителя для передачи секрета: ");
            String keeper2 = getNonEmptyInput("Имя не может быть пустым: ");

            Secret secret2 = new Secret(secret1, keeper2);
            System.out.println("Секрет передан: " + secret2);

            System.out.println("\nИнформация о цепочке:");
            System.out.println("Порядковый номер " + keeper1 + ": " + secret1.getOrderNumber());
            System.out.println("Порядковый номер " + keeper2 + ": " + secret2.getOrderNumber());
            System.out.println("Количество людей после " + keeper1 + ": " + secret1.getPeopleAfter());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void manualNumberFractionMenu() {
        System.out.println("\n=== РУЧНОЙ ВВОД: КЛАСС NUMBERFRACTION (ЗАДАНИЕ 4.2) ===");

        try {
            System.out.print("Введите числитель дроби: ");
            int num = getIntInput();
            System.out.print("Введите знаменатель дроби: ");
            int den = getNonZeroIntInput();

            NumberFraction fraction = new NumberFraction(num, den);
            System.out.println("Создана дробь: " + fraction);

            System.out.println("\nМетоды класса Number:");
            System.out.println("intValue(): " + fraction.intValue());
            System.out.println("longValue(): " + fraction.longValue());
            System.out.println("floatValue(): " + fraction.floatValue());
            System.out.println("doubleValue(): " + fraction.doubleValue());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void manualAdditionMenu() {
        System.out.println("\n=== РУЧНОЙ ВВОД: СЛОЖЕНИЕ (ЗАДАНИЕ 5.1) ===");

        try {
            System.out.print("Сколько чисел вы хотите сложить? ");
            int count = getPositiveIntInput();

            Number[] numbers = new Number[count];

            for (int i = 0; i < count; i++) {
                System.out.println("\nВведите число " + (i + 1) + ":");
                System.out.println("1. Целое число");
                System.out.println("2. Дробное число");
                System.out.println("3. Дробь");
                System.out.print("Выберите тип: ");

                String typeChoice = scanner.nextLine().trim();

                switch (typeChoice) {
                    case "1":
                        System.out.print("Введите целое число: ");
                        numbers[i] = getIntInput();
                        break;
                    case "2":
                        System.out.print("Введите дробное число: ");
                        numbers[i] = getDoubleInput();
                        break;
                    case "3":
                        System.out.print("Введите числитель дроби: ");
                        int num = getIntInput();
                        System.out.print("Введите знаменатель дроби: ");
                        int den = getNonZeroIntInput();
                        numbers[i] = new NumberFraction(num, den);
                        break;
                    default:
                        System.out.println("Неверный выбор, используется 0");
                        numbers[i] = 0;
                }
            }

            double result = sumNumbers(numbers);
            System.out.println("\nРезультат сложения: " + result);

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void manualCloneMenu() {
        System.out.println("\n=== РУЧНОЙ ВВОД: КЛОНИРОВАНИЕ (ЗАДАНИЕ 8.3) ===");

        try {
            System.out.print("Введите числитель дроби для клонирования: ");
            int num = getIntInput();
            System.out.print("Введите знаменатель дроби для клонирования: ");
            int den = getNonZeroIntInput();

            Fraction original = new Fraction(num, den);
            Fraction cloned = original.clone();

            System.out.println("\nОригинальная дробь: " + original);
            System.out.println("Клонированная дробь: " + cloned);

            System.out.println("\nПроверка клонирования:");
            System.out.println("Это один и тот же объект? " + (original == cloned));
            System.out.println("Объекты равны по equals? " + original.equals(cloned));
            System.out.println("Хэш-коды original: " + original.hashCode());
            System.out.println("Хэш-коды cloned: " + cloned.hashCode());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Вспомогательные методы для ввода
    private String getNonEmptyInput(String errorMessage) {
        String input;
        while (true) {
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.print(errorMessage);
        }
    }

    private int getIntInput() {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Ошибка! Введите целое число: ");
            }
        }
    }

    private double getDoubleInput() {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Ошибка! Введите число: ");
            }
        }
    }

    private int getPositiveIntInput() {
        while (true) {
            int number = getIntInput();
            if (number > 0) {
                return number;
            }
            System.out.print("Ошибка! Введите положительное число: ");
        }
    }

    private int getNonZeroIntInput() {
        while (true) {
            int number = getIntInput();
            if (number != 0) {
                return number;
            }
            System.out.print("Ошибка! Число не может быть нулем. Введите другое число: ");
        }
    }

    // Метод для сложения чисел (Задание 5.1)
    private double sumNumbers(Number[] numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
