import java.util.LinkedList;

public class LinkedList05 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(10);
        list.addLast(30);
        list.add(20);

        System.out.println("Linked List elements: " + list);
    }
}
