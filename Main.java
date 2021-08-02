import model.*;
import mock.ItemMock;
import mock.GroupMock;
import mock.ConfigurationMock;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

//        List<Group> groups = GroupMock.getGroupsHierarchy();
//        List<Item> items = ItemMock.getItems(4);
//
//        groups.get(groups.size() - 1).addItems(items);
//
        Storage storage = Storage.getInstance();
//        storage.addGroupAll(groups);

//        for (Group group : storage.getGroupsHierarchy()) {
//            group.print(0);
//        }

//        Basket basket = new Basket();
//        for (Item item.csv : items) {
//            basket.add(new BasketItem(item.csv, ConfigurationMock.getConfiguration()));
//        }
        File file = new File("C:\\Users\\Aram\\IdeaProjects\\Lesson4\\src\\resources_directory\\item.csv");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                String[] arrOfStr = str.split(",");
                System.out.println(Arrays.toString(arrOfStr));
                Group group = new Group(Integer.parseInt(arrOfStr[4]), arrOfStr[2]);


                Item item = ItemMock.getItem(GenerativeItem.class);
                item.setId(Integer.parseInt(arrOfStr[0]));
                item.setBasePrice(Integer.parseInt(arrOfStr[1]));
                item.setName(arrOfStr[2]);
                item.setImageUrl(arrOfStr[3]);

                group.addItem(item);
                storage.addGroup(group);
            }
            for (Group group : storage.getGroupsHierarchy()) {
                group.print(0);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
