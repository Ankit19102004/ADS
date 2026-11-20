import java.util.Scanner;
import java.util.Vector;

public class CoinExchange2 {
    public static int findMinCoins(int Coins[], int value) {
        Vector<Integer> ans = new Vector<>();
        int i, count = 0,printcount=0;
        for (i = 0; i < Coins.length; i++) {
            count = 0;
            
            while (value >= Coins[i]) {
                value -= Coins[i];
               ans.add(Coins[i]);
                count++;
                printcount++;
            }
            if (count != 0) {
                System.out.println("The Coins of :- " + Coins[i] + " is :- " + count
                        + "\n=======================================");

            }
            
        

        }
        System.out.println(ans);
        return printcount;
    }
    

    public static void main(String[] args) {
        int[] a = { 25, 20, 10, 5, 2, 1 };
        char n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the The no. ");
            int ac = sc.nextInt();
            int count=findMinCoins(a, ac);
            System.out.println("Toatal no. of coins used is => "+count);
            System.out.println("Want to Continue y/n ");
            n = sc.next().charAt(0);

        } while (n != 'n');
    }
}
