public class String05 {
    public static void main(String[] args) {
        String str = "welcome to java";
        String[] words = str.split(" ");
        int count = words.length;

        System.out.println("Number of words = " + count);
    }
}
