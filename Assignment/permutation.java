import java.util.Scanner;

public class permutation {
    public static void permute(String s,int  l,int r){
        char[] c = s.toCharArray();
        int count=0;
        if(l==r){
            //System.out.println(c);
            System.out.println(count);
            return ;
        }
        for(int i=l;i<=r;i++){
            char temp;
            temp=c[l];
            c[l]=c[i];
            c[i]=temp;
            count++;
            permute(s, l+1, r);
            temp=c[l];
            c[l]=c[i];
            c[i]=temp;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String n=sc.next();
        System.out.println("Enter the no. Want to Start ");
        int a=sc.nextInt();
        System.out.println("Enter the no. Want to End ");
        int b=sc.nextInt();
        permute(n, a, b);
        sc.close();
        
        
    }
}
