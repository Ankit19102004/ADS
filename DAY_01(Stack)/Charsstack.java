import java.util.Scanner;

class charStack {
    private char arr[];
    int i = -1;
    

    public charStack() {
        arr = new char[10];

    }

    public boolean isFull() {
        return arr.length - 1 == i;

    }

    public boolean isEmpty() {
        return i == -1;
    }

    public charStack(int s) {
        arr = new char[s];
    }

    public void push(char n) {
        if (isFull()) {
            System.out.println("Already Full\n");
            return ;
        }
        i++;
        arr[i] = n;
        
        

    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Already empty\n");
            return '\0';
        } else {
            char ans = arr[i];
            i--;
            return ans;

        }
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Already empty\n");
            return '\0';
        }
        
        return arr[i];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Already empty\n");
            

        }
        for(int j=0;j<=i;j++){
            
            System.out.println( arr[j]);
    
        }

    }

}

public class Charsstack {
    public static  void main(String [] a){
        charStack st=new charStack(25);
        // intStack st1= new  intStack(25);
        Scanner sc=new Scanner(System.in);
      
        int ch;

        do {

            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");


            System.out.print("Enter the Choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter the number to push: ");
                    char n = sc.next().charAt(0);
                    st.push(n);
                    break;

                case 2:
                    char value = st.pop();

                    if (value != -1) {
                        System.out.println("Popped value = " + value);
                    }
                    break;

                case 3:
                    char topValue = st.peek();

                    if (topValue != -1) {
                        System.out.println("Top value = " + topValue);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
                case 4:
                    st.display();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 5);

        sc.close();
    }
}