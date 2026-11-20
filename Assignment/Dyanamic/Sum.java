public class Sum {
    public static int MaxContigousSum(int A[]) {
        int maxSum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++)
                    currentSum += A[k];
                if (currentSum > maxSum)
                    maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -3, 4, -2, -1, 6 };
        int s = MaxContigousSum(arr);
        System.out.println(s);

    }

}
