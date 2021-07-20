package model;

import model.Group;
import model.Item;

import java.lang.module.Configuration;

public class StockItem implements Item {
    private Configuration configuration;
    private int resolutionCoefficient;
    private String name;
    private int id;
    private static int idSequence = 0;
    private String currency;
    private int price;
    private Group group;

    public StockItem(String name, String currency, int price) {
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.id = ++idSequence;
    }

    public StockItem(String name, String currency, int price, Group group) {
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.group = group;
        this.id = ++idSequence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public int getResolutionCoefficient() {
        return resolutionCoefficient;
    }

    public void setResolutionCoefficient(int resolutionCoefficient) {
        this.resolutionCoefficient = resolutionCoefficient;
    }

    @Override
    public double calculatePrice() {
        return getPrice() * getResolutionCoefficient();
    }

}
