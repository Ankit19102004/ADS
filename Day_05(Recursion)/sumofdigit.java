public class sumofdigit {
    public static void main(String[] args) {
        System.out.println(sum1(201425));
    }
    public static int sum1(int n){
        if(n/10==0) return n;
        return  n%10+sum1(n/10);
    }
}
