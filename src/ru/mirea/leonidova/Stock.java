package ru.mirea.leonidova;

public class Stock {
    private String symbol;
    private String name;
    private double preciousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name, double preciousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.preciousClosingPrice = preciousClosingPrice;
        this.currentPrice = currentPrice;

    }

    double getChangePercent(){
        return ((currentPrice - preciousClosingPrice)/preciousClosingPrice)*100;
    }
}
