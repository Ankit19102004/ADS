public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 40, 20, 50, 60, 10, 30, 65, 23, 4 };
        insertionSort(arr);
    }

    public static void insertionSort(int arr[]) {
        int i, j, k = 0;
        for (i = 1; i < arr.length; i++) {
            k = arr[i];

            for (j = i - 1; j >= 0 && k < arr[j]; j--)
                arr[j + 1] = arr[j];

            arr[j + 1] = k;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}