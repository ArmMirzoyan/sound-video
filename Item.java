public class Item {
    private String name;
    private String currency;
    private int price;
    private Group group;

    public Item(String name, String currency, int price) {
        this.name = name;
        this.currency = currency;
        this.price = price;
    }

    public Item(String name, String currency, int price, Group group) {
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Item Name: " + this.name + ", Item currency: " + this.currency +
                ", Item price: " + this.price;
    }
}