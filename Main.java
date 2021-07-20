import model.GenerativeItem;
import model.Group;
import model.Item;

import java.util.Scanner;

public class Main {
    public static void createGroupObject(String groupName, Storage storage) {
        Group group = new Group(groupName);
        storage.addGroups(group);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Storage storage = Storage.getInstance();
        boolean unique = true;
        do {
            System.out.println("Please enter name of the group, or enter continue for enter name of item");
            String groupName = scan.next();
            if (groupName.equals("continue")) {
                break;
            }
            System.out.println("Please enter id of the group or please put enter key for enter other group name, " +
                    "or enter continue for enter name of item");

            int groupId = scan.nextInt();
            if (Integer.toString(groupId).equals("")) {
                Group group = new Group(groupName);
                group.setParent(new Group(groupName));
                storage.addGroups(group);
            }
            if (storage.getGroups().size() != 0) {
                for (Group grp : storage.getGroups()) {
                    if (groupId == grp.getId()) {
                        Group subGroup = new Group(groupName);
                        grp.addGroup(subGroup);
                        unique = false;
                    } else {
                        unique = true;
                    }
                }
                if (unique) {
                    createGroupObject(groupName, storage);
                }
            } else {
                createGroupObject(groupName, storage);
            }


        } while (true);

        do {
            System.out.println("Please enter name of item or enter exit for print result");
            String itemName = scan.next();
            if (itemName.equals("exit")) {
                break;
            }
            System.out.println("Please enter currency of item");
            String itemCurrency = scan.next();
            System.out.println("Please enter price of item");
            int itemPrice = scan.nextInt();

            GenerativeItem item = new GenerativeItem(itemName, itemCurrency, itemPrice);
            storage.addItems(item);

        } while (true);
        scan.close();

        for (Group grp : storage.getGroups()) {
            System.out.println(grp);
            for (Group subGrp : grp.getSubGroups()) {
                System.out.println(subGrp);
            }
        }
        for (Item item : storage.getItems()) {
            System.out.println(item);
        }
    }
}