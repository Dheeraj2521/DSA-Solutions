import java.util.LinkedList;

public class LinkedList04 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Size of list = " + list.size());

        list.clear();

        System.out.println("List after clearing: " + list);
    }
}
