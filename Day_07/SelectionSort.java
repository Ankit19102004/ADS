public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={40,20,50,60,10,30,65,23,4};
        SelectionSort1(arr);
       
        
    }
    public  static void SelectionSort1(int arr[]){
        int i, j,temp,min;
        for(i=0;i<arr.length-1;i++){
            min =i;
            for(j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
                    min=j;
            }
            if(min!=i){
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
                
            }
        
                 

        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");}
    }
    
}
