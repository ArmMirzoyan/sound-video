package model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private static int idSequence = 0;
    private String name;
    private Group parentGroup;
    final private List<Group> subGroups = new ArrayList<>();
    final private List<Item> items = new ArrayList<>();

    public Group(String name) {
        this.name = name;
        this.id = ++idSequence;
    }

    public int getId() {
        return id;
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

    public void setParent(Group parentGroup) {
        this.parentGroup = parentGroup;
    }

    public void addGroup(Group group) {
        this.subGroups.add(group);
        group.setParent(this);
    }

    public List<Group> getSubGroups() {
        return subGroups;
    }

    public void addItem(GenerativeItem item) {
        item.setGroup(this);
        this.items.add(item);
    }

    @Override
    public String toString() {
        return "model.Group Name: " + this.name + ", model.Group Id: " + this.id;
    }
}