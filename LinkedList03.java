import java.util.LinkedList;

public class LinkedList03 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(10);
        list.add(15);

        int search = 10;

        if (list.contains(search)) {
            System.out.println("Element found in the linked list");
        } else {
            System.out.println("Element not found in the linked list");
        }
    }
}
