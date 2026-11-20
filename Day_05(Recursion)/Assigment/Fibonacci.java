import java.io.Serial;

public class Fibonacci {
    public static int Series(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Series(n - 1) + Series(n - 2);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(Series(i) + " ");
        }
    }
}
