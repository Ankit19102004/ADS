public class Sum2 {
    public static int MaxContigousSum(int a[]) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            int currentSum = 0;
            for (int j = i; j < a.length; j++)
                currentSum += a[j];
            if (currentSum > maxSum)
                maxSum = currentSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -3, 4, -2, -1, 6 };
        int s = MaxContigousSum(arr);
        System.out.println(s);

    }
}
