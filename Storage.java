import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Group> groups = new ArrayList<>();
    private List<Item> items = new ArrayList<>();


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