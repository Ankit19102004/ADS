import java.util.Vector;
public class CoinExchange {
    public static int findMinCoins(int Coins[],int size,int value){
        Vector<Integer> ans=new Vector<>();
        int i,count=0;
        for(i=0;i<size;i++){
            while (value>=Coins[i]) {
                value-=Coins[i];
                ans.add(Coins[i]);
                count++;
                
            }
            if(value==0) 
                break;

        }
        return count;
    }
    public static void main(String[] args) {
        int []a={25,20,10,5,2,1};
        int an= findMinCoins(a,6,1123);
        System.out.println(an);
    }
}
