import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        charStack  st= new charStack(25);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=sc.next();
        for(int i=0;i<str.length()/2;i++){
            st.push(str.charAt(i));
        }
        boolean isPalindrome=true;
        if(str.length()%2==0){
            for(int i=(str.length()/2);i<str.length();i++){
                if (st.peek()!=str.charAt(i)){
                    isPalindrome=false;
                    break;
                }
                else{
                    st.pop();
                }
            }
        }
        else{
            for(int i=(str.length()/2)+1;i<str.length();i++){
            if (st.peek()!=str.charAt(i)){
                isPalindrome=false;
                break;
            }
            else{
                st.pop();
            }
        }
        }
        if(isPalindrome){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }          
            
        }
       
    }

