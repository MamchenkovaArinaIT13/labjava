public class Fraction {
  private int numerator;
  private int denominator;

  // Конструктор
  public Fraction(int numerator, int denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
    }
    this.numerator = numerator;
    this.denominator = denominator;
    simplify();
  }

  // Конструктор для целого числа
  public Fraction(int number) {
    this.numerator = number;
    this.denominator = 1;
  }

  // Геттеры
  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  // Метод для нахождения наибольшего общего делителя (НОД)
  private int gcd(int a, int b) {
    return b == 0 ? Math.abs(a) : gcd(b, a % b);
  }

  // Метод для сокращения дроби
  private void simplify() {
    int gcd = gcd(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;

    // Убедимся, что знаменатель всегда положительный
    if (denominator < 0) {
      numerator = -numerator;
      denominator = -denominator;
    }
  }

  // Сложение с другой дробью
  public Fraction add(Fraction other) {
    int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
    int newDenominator = this.denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  // Сложение с целым числом
  public Fraction add(int number) {
    return add(new Fraction(number));
  }

  // Вычитание другой дроби
  public Fraction subtract(Fraction other) {
    int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
    int newDenominator = this.denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }
  
  // Вычитание целого числа
  public Fraction subtract(int number) {
    return subtract(new Fraction(number));
  }

  // Умножение на другую дробь
  public Fraction multiply(Fraction other) {
    int newNumerator = this.numerator * other.numerator;
    int newDenominator = this.denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  // Умножение на целое число
  public Fraction multiply(int number) {
    return multiply(new Fraction(number));
  }

  // Деление на другую дробь
  public Fraction divide(Fraction other) {
    if (other.numerator == 0) {
      throw new ArithmeticException("Деление на ноль");
    }
    int newNumerator = this.numerator * other.denominator;
    int newDenominator = this.denominator * other.numerator;
    return new Fraction(newNumerator, newDenominator);
  }

  // Деление на целое число
  public Fraction divide(int number) {
    return divide(new Fraction(number));
  }

  // Строковое представление
  @Override
  public String toString() {
    if (denominator == 1) {
      return String.valueOf(numerator);
    }
    return numerator + "/" + denominator;
  }
}
