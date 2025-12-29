public class Arrays06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int search = 3;
        boolean found = false;

        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
