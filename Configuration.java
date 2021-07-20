import model.Item;

public class Configuration {
    private static Item item;
    private Resolutions resolutions;

    public Configuration(Resolutions resolutions) {
        this.resolutions = resolutions;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Resolutions getResolutions() {
        return resolutions;
    }

    public void setResolutions(Resolutions resolutions) {
        this.resolutions = resolutions;
    }
}
