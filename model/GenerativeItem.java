package model;

import java.lang.module.Configuration;

public class GenerativeItem extends Item {
    private Configuration configuration;
    private int resolutionCoefficient;
    private double complexity;

    public GenerativeItem(String name, String currency, int price) {
        super(name, currency, price);
    }

    public GenerativeItem(String name, String currency, int price, Group group) {
        super(name, currency, price, group);
    }

    public double getComplexity() {
        return complexity * (Math.random() + 1);
    }

    public int getResolutionCoefficient() {
        return resolutionCoefficient;
    }

    public void setResolutionCoefficient(int resolutionCoefficient) {
        this.resolutionCoefficient = resolutionCoefficient;
    }

    @Override
    public double calculatePrice() {
        return getPrice() * getResolutionCoefficient() * getComplexity();
    }
}
