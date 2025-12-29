public class Arrays08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int reverse;

        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse = arr[i];
            System.out.print(reverse + " ");
        }
    }
}
