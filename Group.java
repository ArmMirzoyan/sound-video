import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private String name;
    private Group parentGroup;
    private List<Group> subGroups = new ArrayList<>();
    private List<Item> items = new ArrayList<>();

    public Group(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Group(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void addId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getParentGroup() {
        return parentGroup;
    }

    public void addParentGroup(Group parentGroup) {
        this.parentGroup = parentGroup;
    }

    public void addSubGroups(Group subGroups) {
        this.subGroups.add(subGroups);
    }

    public List<Group> getSubGroups() {
        return subGroups;
    }

    public void addItems(Item items) {
        this.items.add(items);
    }

    @Override
    public String toString() {
        return "Group Name: " + this.name + ", Group Id: " + this.id;
    }
}