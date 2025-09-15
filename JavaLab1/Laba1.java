import java.util.Random;
import java.util.Scanner;

public class Laba1 {
  private static Scanner scanner = new Scanner(System.in);

  public int menu() {
    while (true) {
      System.out.println(
          "Здравствуйте! Выберите номер задания!\n"
              + "1 - 2 задача из 'методов'\n"
              + "2 - 4 задача из 'методов'\n"
              + "3 - 6 задача из 'методов'\n"
              + "4 - 8 задача из 'методов'\n"
              + "5 - 10 задача из 'методов'\n"
              + "6 - 2 задача из 'условий'\n"
              + "7 - 4 задача из 'условий'\n"
              + "8 - 6 задача из 'условий'\n"
              + "9 - 8 задача из 'условий'\n"
              + "10 - 10 задача из 'условий'\n"
              + "11 - 2 задача из 'циклов'\n"
              + "12 - 4 задача из 'циклов'\n"
              + "13 - 6 задача из 'циклов'\n"
              + "14 - 8 задача из 'циклов'\n"
              + "15 - 10 задача из 'циклов'\n"
              + "16 - 2 задача из 'массивов'\n"
              + "17 - 4 задача из 'массивов'\n"
              + "18 - 6 задача из 'массивов'\n"
              + "19 - 8 задача из 'массивов'\n"
              + "20 - 10 задача из 'массивов'\n");

      int choice = -1;
      System.out.print("Введите номер задания: ");
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
        switch (choice) {
          case 1:
            System.out.println("Задача 2 из категории методов");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал результат\n"
                    + "сложения двух последних знаков числах, предполагая, что знаков в числе не\n"
                    + "менее двух.");
            int x = input1();
            System.out.println(sumLastNums(x));
            break;
          case 2:
            System.out.println("Задача 4 из категории методов");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он принимал число x и\n"
                    + "возвращал true, если оно положительное.");
            int x1 = input2();
            System.out.println(isPositive(x1));
            break;
          case 3:
            System.out.println("Задача 6 из категории методов:");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он принимал символ x и\n"
                    + "возвращал true, если это большая буква в диапазоне от 'A' до 'Z'.");
            char x2 = input3();
            System.out.println(isUpperCase(x2));
            break;
          case 4:
            System.out.println("Задача 8 из категории методов:");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
                    + "любое из принятых чисел делит другое нацело.");
            int x3 = input4();
            int x4 = input4();
            System.out.println(isDevision(x3, x4));
            break;
          case 5:
            System.out.println("Задача 10 из категории методов:");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он считал сумму цифр\n"
                    + "двух чисел из разряда единиц. Выполните с его помощью последовательное\n"
                    + "сложение пяти чисел и результат выведите на экран.");

              System.out.println("Введите первые два числа:");
              System.out.print("Первое число (a): ");
              int a = scanner.nextInt();
              System.out.print("Второе число (b): ");
              int b = scanner.nextInt();

              // Первый вызов
              int result = lastNumSum(a, b);


// Следующие 4 вызова (всего 5)
              for (int i = 2; i <= 4; i++) {
                  System.out.println("Введите следующее число (b): ");
                  int nextB = scanner.nextInt();
                  result = lastNumSum(result, nextB);
              }
            break;
          case 6:
            System.out.println("Задача 2 из 'условий': ");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал деление x\n"
                    + "на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При\n"
                    + "делении на 0 следует вернуть из метода число 0.");
            int x7 = input4();
            int x8 = input4();
            System.out.println(safeDiv(x7, x8));
            break;
          case 7:
            System.out.println("Задача 4 из 'условий':");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал строку,\n"
                    + "которая включает два принятых методом числа и корректно выставленный\n"
                    + "знак операции сравнения (больше, меньше, или равно).");
            int x9 = input4();
            int x10 = input4();
            System.out.println(makeDecision(x9, x10));
            break;
          case 8:
            System.out.println("Задача 6 из 'условий':");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
                    + "два любых числа (из трех принятых) можно сложить так, чтобы получить\n"
                    + "третье.");
            int x11 = input4();
            int x12 = input4();
            int x13 = input4();
            System.out.println(sum3(x11, x12, x13));
            break;
          case 9:
            System.out.println("Задание 8 из 'условий':");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n"
                    + "которой сначала будет число х, а затем одно из слов: год/года/лет");
            int x14 = input4();
            System.out.println(age(x14));
            break;
          case 10:
            System.out.println("Задание 10 из 'условий':");
            System.out.println(
                "В качестве параметра метод принимает строку, в которой записано название\n"
                    + "дня недели. Необходимо реализовать метод таким образом, чтобы он выводил\n"
                    + "на экран название переданного в него дня и всех последующих до конца недели\n"
                    + "дней.");
            String x15 = input5();
            printDays(x15);
            break;
          case 11:
            System.out.println("Задание 2 из 'циклов':");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n"
                    + "которой будут записаны все числа от x до 0 (включительно).");
            int x16 = input6();
            System.out.println(reverseLisNumbs(x16));
            break;
          case 12:
            System.out.println("Задание 4 из 'циклов':");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал результат\n"
                    + "возведения x в степень y.");
            int x17 = input4();
            int x18 = input4();
            System.out.println(pow(x17, x18));
            break;
          case 13:
            System.out.println("Задание 6 из 'циклов':");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
                    + "все знаки числа одинаковы, и false в ином случае.");
            int x19 = input4();
            System.out.println(equalNum(x19));
            break;
          case 14:
            System.out.println("Задание 8 из 'циклов':");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он выводил на экран\n"


+ "треугольник из символов '*' у которого х символов в высоту.");
            int x20 = input4();
            leftTriangle(x20);
            break;
          case 15:
            System.out.println("Задание 10 из 'циклов':");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он генерировал\n"
                    + "случайное число от 0 до 9, далее считывал с консоли введенное пользователем\n"
                    + "число и выводил, угадал ли пользователь то, что было загадано, или нет.");
            guessGame();
            break;
          case 16:
            System.out.println("Задание 2 из 'массивов'");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал индекс\n"
                    + "последнего вхождения числа x в массив arr. Если число не входит в массив –\n"
                    + "возвращается -1");
            int[] arr1 = inputArray();
            int num1 = input4();
            System.out.println("Последняя позиция: " + findLast(arr1, num1));
            break;
          case 17:
            System.out.println("Задание 4 из 'массивов'");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал новый\n"
                    + "массив, который будет содержать все элементы массива arr, однако в позицию\n"
                    + "pos будет вставлено значение x.");
            int[] arr2 = inputArray();
            int num2 = input4();
            int pos = input4();
            add(arr2, num2, pos);
            break;
          case 18:
            System.out.println("Задание 6 из 'массивов'");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он изменял массив arr.\n"
                    + "После проведенных изменений массив должен быть записан задом-наперед.");
            int[] arr3 = inputArray();
            reverse(arr3);
            break;
          case 19:
            System.out.println("Задание 8 из 'массивов'");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал новый\n"
                    + "массив, в котором сначала идут элементы первого массива (arr1), а затем\n"
                    + "второго (arr2).");
            int[] arr4 = inputArray();
            int[] arr5 = inputArray();
            concat(arr4, arr5);
            break;
          case 20:
            System.out.println("Задание 10 из 'массивов'");
            System.out.println(
                "Необходимо реализовать метод таким образом, чтобы он возвращал новый\n"
                    + "массив, в котором записаны все элементы массива arr кроме отрицательных.");
            int[] arr6 = inputArray();
            deleteNegative(arr6);
            break;
          default:
            System.out.println("Неверный выбор!");
            break;
        }
      } else {
        scanner.next();
        System.out.println("Неверно! Такого задания нет, попробуйте еще раз!");
      }
    }
  }

  public int[] inputArray() {
    System.out.print("Введите длину массива: ");
    int n = 0;

    while (true) {
      if (scanner.hasNextInt()) {
        n = scanner.nextInt();
        if (n > 0) {
          break;
        } else {
          System.out.println("Ошибка! Длина массива должна быть положительным числом.");
        }
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
      System.out.print("Введите длину массива: ");
    }

    int[] x = new int[n];
    for (int i = 0; i < x.length; i++) {
      while (true) {
        System.out.print("Введите " + (i + 1) + " число: ");


if (scanner.hasNextInt()) {
          x[i] = scanner.nextInt();
          break;
        } else {
          String invalidInput = scanner.next();
          System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
        }
      }
    }
    return x;
  }

  public int input1() {
    while (true) {
      System.out.print("Введите целое число (не менее 2-ух символов): ");
      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        if (Math.abs(x) < 10) {
          System.out.println("Ошибка! Число не имеет 2 символов! ");
          continue;
        }
        System.out.print("Результат: ");
        return x;
      } else {
        String inputlag = scanner.next();
        System.out.println("Ошибка! " + inputlag + " - это не число!");
      }
    }
  }

  public int input2() {
    while (true) {
      System.out.print("Введите целое число: ");
      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        System.out.print("Результат: ");
        return x;
      } else {
        String inputlag = scanner.next();
        System.out.println("Ошибка! " + inputlag + " - это не число!");
      }
    }
  }

  public char input3() {
    while (true) {
      System.out.print("Введите символ (от A до Z): ");
      String x = scanner.next();

      if (x.length() != 1) {
        System.out.println("Ошибка, введите одну букву");
        continue;
      }
      char x1 = x.charAt(0);
      return x1;
    }
  }

  public int input4() {
    while (true) {
      System.out.print("Введите целое число: ");
      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        return x;
      } else {
        String inputlag = scanner.next();
        System.out.println("Ошибка! " + inputlag + " - это не число!");
      }
    }
  }

  public String input5() {
    scanner.nextLine();
    while (true) {
      System.out.print("Введите день недели: ");
      String input = scanner.nextLine();

      if (scanner.hasNextInt()) {
        String invalidlnput = scanner.next();
        System.out.println("Ошибка!" + invalidlnput + " - это число. Введите день недели!");
      } else {
        return input;
      }
    }
  }

  public int input6() {
    while (true) {
      System.out.print("Введите число: ");
      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        scanner.nextLine();
        return x;
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
    }
  }

  //2
  public int sumLastNums(int x) {
    int first = x % 10;
    int second = (x / 10) % 10;
    return first + second;
  }

//4
  public boolean isPositive(int x) {
    if (x > 0) {
      return true;
    } else {
      return false;
    }
  }
//6
  public boolean isUpperCase(char x) {
    System.out.print("Результат: ");
    return x >= 'A' && x <= 'Z';
  }
//8
  public boolean isDevision(int a, int b) {
    if (a % b == 0 || b % a == 0) {
      return true;
    } else {
      return false;
    }
  }
//10
  public int lastNumSum(int a, int b) {
    a = a % 10 + b % 10;
    System.out.print("Результат : " + a + '\n');
    return a;
  }
//2
  public double safeDiv(int x, int y) {
    if (x != 0 && y != 0) {
      return x / y;
    } else {
      return 0;
    }
  }
//4
  public String makeDecision(int x, int y) {
    if (x > y) {
      return x + " > " + y;
    } else if (x == y) {
      return x + " = " + y;
    } else {
      return x + " < " + y;
    }
  }
//6
public boolean sum3(int x, int y, int z) {
    if (x + y == z) {
        return true;
    }
    if (x + z == y) {
        return true;
    }
    if (y + z == x) {
        return true;
    }
    return false;
}
//8
  public String age(int x) {
    if (x % 10 == 1) {
      if (x%100 == 11) {
        return x + " лет";
      }
      return x + " год";
    } else if (x % 10 == 2  x % 10 == 3  x % 10 == 4) {
      if (x%100 == 12  x%100== 13  x%100 == 14) return x + " лет";
      return x + " года";
    } else {
      return x + " лет";
    }
  }
//10
  public void printDays(String x) {
    switch (x) {
      case "понедельник":
        System.out.println("понедельник");
      case "вторник":
        System.out.println("вторник");
      case "среда":
        System.out.println("среда");
      case "четверг":
        System.out.println("четверг");
      case "пятница":
        System.out.println("пятница");
      case "суббота":
        System.out.println("суббота");
      case "воскресенье":
        System.out.println("воскресенье");
        break;
      default:
        System.out.println("это не день недели");
    }
  }
//2
public String reverseLisNumbs(int x) {
    if (x == 0) {
        return "0";
    }

    String result = "";

    if (x > 0) {
        for (int i = x; i >= 0; i--) {
            result += i;
            if (i > 0) {
                result += " ";
            }
        }
    } else {
        for (int i = x; i <= 0; i++) {
            result += i;
            if (i < 0) {
                result += " ";
            }
        }
    }

return result;
}
//4
  public double pow(int x, int y) {
    if (y == 0) {
      System.out.println("Результат:");
      return 1;
    }
    if (y < 0) {
      double res = 1.0;
      for (int i = 0; i < -y; i++) {
        res *= x;
      }
      System.out.println("Результат:");
      return 1.0 / res;
    } else {
      int res = 1;
      for (int i = 0; i < y; i++) {
        res *= x;
      }
      System.out.println("Результат:");
      return res;
    }
  }
//6
  public boolean equalNum(int x) {
      int currentx;
    if (x < 10 && x >= 0) {
      return true;
    }
    if (x < 0) {
      x = -x;
    }
    int lastx = x % 10;
    x = x / 10;
    while (x > 0) {
      currentx = x % 10;
      if (currentx != lastx) {
        return false;
      }
      x = x / 10;
    }
    return true;
  }
//8
  public void leftTriangle(int x) {
    char z = '*';
    for (int i = 1; i <= x; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(z);
      }
      System.out.println();
    }
  }
//10
  public void guessGame() {
    Random random = new Random();
    int i = 0;
    int rand = random.nextInt(10);
    while (true) {
      System.out.print("Введите число от 0 до 9: ");
      i++;
      if (scanner.hasNextInt()) {
        int name = scanner.nextInt();
        if (name < 0 || name > 10) {
          System.out.println("Число от 0 до 9!");
          continue;
        }
        if (rand == name) {
          System.out.println("Вы угадали! \nВы отгадали число за " + i + " попыток!");
          break;
        } else {
          System.out.println("Вы не угадали! ");
          continue;
        }
      } else {
        String input = scanner.next();
        System.out.println(input + " - это не число!");
      }
    }
  }
//2
  public int findLast(int[] arr, int x) {
    int j = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        j = i;
      }
    }
    return j;
  }
//4
  public int[] add(int[] arr, int x, int pos) {
    if (pos < 0 || pos > arr.length) {
      System.out.println("Некорректная позиция: " + pos);
      return arr;
    }
//6
    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i < pos; i++) {
      newArr[i] = arr[i];
    }

    newArr[pos] = x;

    for (int i = pos; i < arr.length; i++) {
      newArr[i + 1] = arr[i];
    }

    System.out.print("Результат: ");
    for (int i = 0; i < newArr.length; i++) {
      System.out.print(newArr[i] + " ");
    }
    System.out.println();
    return newArr;
  }
//8
  public void reverse(int[] arr) {
    System.out.print("Результат: ");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public int[] concat(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
      result[i] = arr1[i];
    }

    for (int i = 0; i < arr2.length; i++) {
      result[arr1.length + i] = arr2[i];
    }

    System.out.print("Результат: ");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
    System.out.println();
    return result;
  }
//10
  public int[] deleteNegative(int[] arr) {
    int count = 0;
    for (int num : arr) {
      if (num >= 0) {
        count++;
      }
    }

    int[] result = new int[count];
    int index = 0;
    for (int num : arr) {
      if (num >= 0) {
        result[index] = num;
        index++;
      }
    }

    System.out.print("Результат: ");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
    System.out.println();
    return result;
  }
}
