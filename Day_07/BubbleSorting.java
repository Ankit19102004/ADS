public class BubbleSorting{
    public static void main(String[] args) {
        int arr[]={40,20,50,60,10,30,65,23,4};
        int i,j,temp,flag=0;
        for(i=arr.length-1;i>0;i--){
            flag=0;
            for(j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                   
                }
                 System.out.print(arr[j]+" ");
               
            }
             if(flag==0)
                    break;

            System.out.println("\n===========================================");
            System.out.print(arr[i]+" ");
            System.out.print(arr[0]+" ");
            
        }
        System.out.println("\n===========================================");
        for(i=0;i<arr.length;i++){
            
            System.out.print(arr[i]+" ");
        }
        
            
        }
    }
