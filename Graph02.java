public class Graph02 {
    public static void main(String[] args) {
        int vertices = 3;

        int[][] graph = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 0, 0}
        };

        System.out.println("Graph adjacency matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
