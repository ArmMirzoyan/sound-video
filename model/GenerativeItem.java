package model;

public class GenerativeItem extends Item {
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
        return getConfiguration().getResolutions().coefficient;
    }

    @Override
    public double calculatePrice() {
        return getPrice() * getResolutionCoefficient() * getComplexity();
    }
}
