public class Star {
    public static void main(String[] args) {
        printstar(1);
    }

    public static void printstar(int n) {
        if (n > 5) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        printstar(n +1);
        return;

    }
}
