import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Before removal: " + list);

        list.remove("B");

        System.out.println("After removal: " + list);
    }
}
