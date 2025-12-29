public class Arrays05 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of elements = " + sum);
    }
}
