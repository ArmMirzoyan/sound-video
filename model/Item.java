package model;

public abstract class Item {
    private String name;
    private int id;
    private static int idSequence = 0;
    private String currency;
    private int price;
    private Group group;
    private Configuration configuration;

    public Item(String name, String currency, int price) {
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.id = ++idSequence;
    }

    public Item(String name, String currency, int price, Group group) {
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

    public double calculatePrice() {
        return getPrice() * configuration.getResolutions().coefficient;
    }

    public Configuration getConfiguration(){
        return configuration;
    }

    @Override
    public String toString() {
        return "model.Item Name: " + this.name + ", model.Item currency: " + this.currency +
                ", model.Item price: " + this.price;
    }

}