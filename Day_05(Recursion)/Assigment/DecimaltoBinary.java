public class DecimaltoBinary {
  
    public static void main(String[] args) {
        DtoB(12);
    }
      public static int DtoB(int n){
        if (n<=0){
            return 0;
        }
        if(n==0){
            return 0 ;
           
        }
        DtoB(n/2);
        System.out.printd(n%2);
        return n;
        
        
        
    }
}
