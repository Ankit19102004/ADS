import java.util.Scanner;

class myGraph {
    private int adj[][];
    private int n;

    public myGraph() {
        n = 5;
        adj = new int[n][n];
    }

    public myGraph(int s) {
        n = s;
        adj = new int[n][n];
    }

    public void creatGraph() {
        Scanner sc = new Scanner(System.in);
        int i, u, v, max_edges;
        max_edges = n * (n - 1);
        for (i = 0; i < max_edges; i++) {
            System.out.println("Enter Edge source:--1 for quiet");
            u = sc.nextInt();
            System.out.println("Enter Edge Destination:--1 for quiet");
            v = sc.nextInt();
            if (u == -1 || v == -1)
                return;
            if (u < 0 || v > n - 1 || u > n - 1 || v < 0) {
                System.out.println("Invalid Edge.... ");
                i--;

            }

            adj[u][v] = 1;

        }
    }

    public void insertGraph() {
        Scanner sc = new Scanner(System.in);
        int i, u, v, max_edges;
        max_edges = n * (n - 1);
        for (i = 0; i < max_edges; i++) {
            System.out.println("Enter Edge source:--1 for quiet");
            u = sc.nextInt();
            System.out.println("Enter Edge Destination:--1 for quiet");
            v = sc.nextInt();
            if (u == -1 || v == -1)
                return;
            if (u < 0 || v > n - 1 || u > n - 1 || v < 0) {
                System.out.println("Invalid Edge.... ");
                i--;
            }
            System.out.print("Enter the Edges ");
            int ed = sc.nextInt();
            adj[u][v] = ed;
        }
    }

    public void DFS() {
        int tmp;
        int state[] = new int[n];
        intStack st = new intStack();
        st.push(0);
        while (!st.isEmpty()) {
            tmp = st.pop();
            if (state[tmp] == 0) {
                System.out.println(tmp + " ");
                state[tmp] = 1;
            }
            for (int i = 0; i < n; i++) {
                if (adj[tmp][i] != 0) {
                    if (state[i] == 0)
                        st.push(i);
                }
            }
        }

    }

    public void BFS() {
        int tmp;
        int state[] = new int[n];
        intQueue qt = new intQueue();
        qt.insert(0);
        while (!qt.isEmpty()) {
            tmp = qt.delete();
            if (state[tmp] == 0) {

                System.out.println(tmp + " ");
                state[tmp] = 1;
            }
            for (int i = 0; i < n; i++) {
                if (adj[tmp][i] != 0) {
                    if (state[i] == 0)
                        qt.insert(i);
                }
            }

        }
    }

    public void deleteGraph() {
        Scanner sc = new Scanner(System.in);
        int i, u, v, max_edges;
        System.out.println("Enter Edge Source: -1 for quiet");
        u = sc.nextInt();

        System.out.println("Enter Edge Destination: -1 for quiet");
        v = sc.nextInt();

        if (u < 0 || u >= n || v < 0 || v >= n) {
            System.out.println("Invalid Edge....");
            return;
        }

        if (adj[u][v] == 0) {
            System.out.println("Edge does not exist.");
        } else {
            adj[u][v] = 0;
            System.out.println("Edge deleted successfully.");
        }

    }

    public void display() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adj[i][j] + "  ");
            }
            System.out.println();
        }
    }

}

public class UserMyGrapgh {
    public static void main(String[] args) {
        myGraph mg = new myGraph(10);
        mg.creatGraph();
        mg.display();

        mg.DFS();
        // mg.display();
    }

}
