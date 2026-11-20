import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n=sc.next();
        System.out.println(checkPalindrome(n));
    }
    public static boolean checkPalindrome(String s){
        if (s.length()==1){
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
        return false;
            
        }
        
        return checkPalindrome(s.substring(1, s.length() - 1));
    }
    
}
