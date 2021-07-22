package model;

public class Configuration {
    private static Item item;
    private Resolution resolution;

    public Configuration(Resolution resolution) {
        this.resolution = resolution;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Resolution getResolutions() {
        return resolution;
    }

    public void setResolutions(Resolution resolution) {
        this.resolution = resolution;
    }
}
