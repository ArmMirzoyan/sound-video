import model.Group;
import model.Item;

public class GenerativeItem extends Item{
    Configuration configuration;

    public GenerativeItem(String name, String currency, int price) {
        super(name, currency, price);
    }

    public GenerativeItem(String name, String currency, int price, Group group) {
        super(name, currency, price, group);
    }
}
