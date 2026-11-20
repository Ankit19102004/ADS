public class Count_Digit {
    public static void main(String[] args) {
       System.out.println( cntt(205464));
    }
    public static int cntt(int n){
        if (n/10==0)return 1;
        return 1+cntt(n/10);
    }
}
