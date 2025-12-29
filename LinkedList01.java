import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List elements:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}
