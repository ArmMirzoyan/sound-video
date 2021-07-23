package model;

public class StockItem extends Item {
    private int resolutionCoefficient;

    public StockItem(String name, String currency, int price) {
        super(name, currency, price);
    }

    public StockItem(String name, String currency, int price, Group group) {
        super(name, currency, price, group);
    }

    public int getResolutionCoefficient() {
        return resolutionCoefficient;
    }

    public void setResolutionCoefficient(int resolutionCoefficient) {
        this.resolutionCoefficient = resolutionCoefficient;
    }

}
