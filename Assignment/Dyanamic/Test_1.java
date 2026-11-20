import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ");
        int k=sc.nextInt();
        int i,sum=0,Start=0;
        int [] arr={223,564,342,32,432,42,3423,42,111};
        for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(i>k-1){
                System.out.println(i+":-"+sum);
                sum=sum-arr[Start];
                 Start++;

            }

        }
        sc.close();
    }
}
