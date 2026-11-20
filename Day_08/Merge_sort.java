public class Merge_sort {
    public static void main(String[] args) {
        int arr[] = { 12, 6, 70, 77, 0, 8, 80, 80, 6, 7, 2, 3 };
        Merge_sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length - 2; i++)
            System.out.println("  " + arr[i]);

    }

    static void Merge_sort(int arr[], int low, int high) {
        int mid;
        int temp[] = new int[arr.length];
        if (low < high) {
            mid = (low + high) / 2;
            Merge_sort(arr, low, mid);
            Merge_sort(arr, mid + 1, high);
            merge_ver3(arr, temp, low, mid, mid + 1, high);
            copy(arr, temp, low, high);
        }
        return;
    }

    static void copy(int arr[], int[] temp, int low, int high) {
        int i;
        for (i = low; i <= high; i++)
            arr[i] = temp[i];

    }

    public static void merge_ver3(int[] arr, int[] tar, int low1, int high1, int low2, int high2) {
        int i, j, k;
        i = low1;
        j = low2;
        k = low1;

        while ((i <= high1) && (j <= high2)) {
            if (arr[i] < arr[j]) {
                tar[k] = arr[i];
                i++;
                k++;
            } else if (arr[j] < arr[i]) {
                tar[k] = arr[j];
                j++;
                k++;
            } else {
                tar[k] = arr[i];
                i++;
                j++;
                k++;
            }
        }

        while (i <= high1) {
            tar[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high2) {
            tar[k] = arr[j];
            j++;
            k++;
        }
    }

}
