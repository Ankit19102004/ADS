public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int left,right,pivot,t;
        pivot=arr[low];
        left=low;
        right=high;
        while(left<=right){
            while(arr[left]<=pivot&&(left<right)){
                left++;

            }
            while(arr[right]>pivot){
                right--;
            }
            if(left<right){
                t=arr[left];
                arr[left]=arr[right];
                arr[right]=t;
                left++;
                right--;
            }
            else left++;

        }
        arr[low]=arr[right];
        arr[right]=pivot;
        return  right;
    }
    public static void Quick(int arr[],int low,int high){
        int pivloc=0;
        if(low>=high) return;
        pivloc =partition(arr, low,high);
        Quick(arr, low, pivloc-1);
        Quick(arr, pivloc+1,high);
        

    }
   
    public static void main(String[] args) {
        int a[]={10,8,2,3,19,24,87,34,0,9};
        Quick(a, 0, a.length-1);
        for(int i=0;i<=a.length;i++){
            System.out.println(a[i]+" ");

        }
    }
}
