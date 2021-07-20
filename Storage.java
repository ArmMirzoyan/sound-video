import model.Group;
import model.Item;

import java.util.ArrayList;
import java.util.List;

public final class Storage {
    private List<Group> groups = new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    static Storage instance = null;

    private Storage() {
    }

    static public Storage getInstance() {
        if (instance == null)
            instance = new Storage();

        return instance;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroups(Group groups) {
        this.groups.add(groups);
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItems(Item items) {
        this.items.add(items);
    }
}