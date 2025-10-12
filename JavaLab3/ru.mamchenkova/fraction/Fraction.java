package ru.mamchenkova.fraction;

public final class Fraction implements Cloneable {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public double doubleValue() {
        return (double) numerator / denominator;
    }

    // Задание 6.1 - Сравнение дробей
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction other = (Fraction) obj;
        return numerator == other.numerator && denominator == other.denominator;
    }

    @Override
    public int hashCode() {
        return 31 * numerator + denominator;
    }

    // Задание 8.3 - Клонирование дроби
    @Override
    public Fraction clone() {
        try {
            return (Fraction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование не поддерживается");
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
