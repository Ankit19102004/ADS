public class ReverseDisplay {
    public static void main(String[] args) {
        check(20);
    }
    public static void check (int n){
        System.out.println(n);
        check(n-1);
        return ;

    }
}
