package ru.mirea.leonidova;

public class TestStock {
    public static void main(String[] args) {
        Stock Stock1 = new Stock("SBER", "ПАО Сбербанк", 185.9, 192.78);
        System.out.println("Процент изменения стоимости акций равен: " + Stock1.getChangePercent() + "%");
    }
}
