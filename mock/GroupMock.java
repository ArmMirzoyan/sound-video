package mock;

import model.Group;
import util.idgenerator.IdGenerator;
import util.namegenerator.NameGenerator;
import util.namegenerator.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GroupMock {

    public static Group getGroup() {
        return new Group(IdGenerator.getNext(Type.GROUP), NameGenerator.getRandomName());
    }

    public static List<Group> getGroupsHierarchy() {
        Group group1 = getGroup();
        Group group2 = getGroup();
        Group group3 = getGroup();
        Group group4 = getGroup();
        Group group5 = getGroup();
        Group group6 = getGroup();

        group1.addSubGroup(group2);
        group2.addSubGroup(group3);

        group4.addSubGroup(group5);
        group5.addSubGroup(group6);

        return Arrays.asList(group1,
                group2,
                group3,
                group4,
                group5,
                group6);
    }

    public static List<Group> getGroups(int count) {
        List<Group> rv = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            rv.add(getGroup());
        }

        return rv;
    }

    private GroupMock() {

    }
}
