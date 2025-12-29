class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Tree01 {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        System.out.println("Root node = " + root.data);
        System.out.println("Left child = " + root.left.data);
        System.out.println("Right child = " + root.right.data);
    }
}
