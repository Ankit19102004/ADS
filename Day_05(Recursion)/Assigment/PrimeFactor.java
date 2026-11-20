public class PrimeFactor {
    public static void PFactor(int n, int i) {
        if (i >n) {
            return ;
        }
        if (n % i == 0) {

            System.out.println(i);
            PFactor(n / i, i);

        } else {
             PFactor(n, i + 1);
        }
    }

    public static void main(String[] args) {
        PFactor(24, 2);
    }
}
