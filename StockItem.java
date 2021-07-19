import model.Group;
import model.Item;

public class StockItem extends Item {
    Configuration configuration;

    public StockItem(String name, String currency, int price) {
        super(name, currency, price);
    }

    public StockItem(String name, String currency, int price, Group group) {
        super(name, currency, price, group);
    }
}
