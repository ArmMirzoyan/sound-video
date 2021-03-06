import model.Group;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static Storage sInstance;

    private final List<Group> groups = new ArrayList<>();

    public static Storage getInstance() {
        if (sInstance == null) {
            sInstance = new Storage();
        }

        return sInstance;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public void addGroupAll(List<Group> groups) {
        this.groups.addAll(groups);
    }

    public Group findGroupById(int groupId) {
        for (Group group: groups) {
            if (group.getId() == groupId) {
                return group;
            }
        }

        return null;
    }

    public List<Group> getGroupsHierarchy() {
        List<Group> rootGroups = new ArrayList<>();

        for (Group group: groups) {
            if (group.getParentGroup() == null) {
                rootGroups.add(group);
            }
        }

        return rootGroups;
    }

    private Storage() {

    }
}