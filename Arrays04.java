public class Arrays04 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int evenCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Even numbers count = " + evenCount);
    }
}
