package ru.mamchenkova.secrets;

import java.util.Random;
public class Secret {
    private final String text;
    private final String keeperName;
    private final int orderNumber;
    private Secret nextKeeper;
    private static int totalKeepers = 0;

    public Secret(String keeperName, String text) {
        if (keeperName == null || text == null) {
            throw new IllegalArgumentException("Имя и текст не могут быть null");
        }
        this.keeperName = keeperName;
        this.text = text;
        this.orderNumber = ++totalKeepers;
        this.nextKeeper = null;
    }

    public Secret(Secret other, String newKeeperName) {
        if (other == null || newKeeperName == null) {
            throw new IllegalArgumentException("Секрет и имя не могут быть null");
        }
        if (other.nextKeeper != null) {
            throw new IllegalStateException("Секрет уже был передан другому человеку");
        }

        this.keeperName = newKeeperName;
        this.orderNumber = ++totalKeepers;

        // Добавление случайных символов
        this.text = modifyText(other.text);
        other.nextKeeper = this;

        System.out.println(other.keeperName + " сказал что " + other.text);
    }

    private String modifyText(String originalText) {
        if (originalText.isEmpty()) return originalText;

        Random random = new Random();
        int changesCount = random.nextInt(originalText.length() / 10 + 1);
        StringBuilder modified = new StringBuilder(originalText);

        for (int i = 0; i < changesCount; i++) {
            int position = random.nextInt(modified.length() + 1);
            char randomChar = (char) (random.nextInt(26) + 'a');
            modified.insert(position, randomChar);
        }

        return modified.toString();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getPeopleAfter() {
        int count = 0;
        Secret current = this.nextKeeper;
        while (current != null) {
            count++;
            current = current.nextKeeper;
        }
        return count;
    }

    public String getNthPerson(int n) {
        if (n == 0) return this.keeperName;

        Secret current = this;
        if (n > 0) {
            for (int i = 0; i < n && current != null; i++) {
                current = current.nextKeeper;
            }
        }

        return current != null ? current.keeperName : "Не найден";
    }

    public int getTextLengthDifference(int n) {
        Secret target = this;
        for (int i = 0; i < n && target != null; i++) {
            target = target.nextKeeper;
        }

        return target != null ? this.text.length() - target.text.length() : 0;
    }

    @Override
    public String toString() {
        return keeperName + ": это секрет!";
    }
}
