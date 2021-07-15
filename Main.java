import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Group people = new Group("People", "1");
        Group nature = new Group("Nature", "2");

        List<Group> listGroup = new ArrayList<>();
        listGroup.add(people);
        listGroup.add(nature);

        System.out.println("Please enter name of the group");

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int count = 3;
        while (!a.equals("continue")) {
            System.out.println("Please enter id of the parent group");
            String b = scan.next();
            if (!b.equals(people.getId()) || !b.equals(nature.getId())) {
                Group groupUser = new Group(a, b);
                listGroup.add(groupUser);
            }
            System.out.println("Please enter name of the group");
            a = scan.next();
            if (b.isEmpty()) {
                ++count;
                Group groupUser = new Group(a, Integer.toString(count));
                listGroup.add(groupUser);
            }
        }

        List<Item> listItem = new ArrayList<>();

        System.out.println("Please enter name of item");
        String aI = scan.next();
        while (!aI.equals("exit")) {
            System.out.println("Please enter currency of item");
            String bI = scan.next();
            System.out.println("Please enter price of item");
            int cI = scan.nextInt();

            Item items = new Item(aI, bI, cI);
            listItem.add(items);
            System.out.println("Please enter name of item");
            aI = scan.next();
        }

        scan.close();
        System.out.println(listGroup);
        System.out.println(listItem);
    }
}
