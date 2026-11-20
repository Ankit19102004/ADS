import java.util.Scanner;

class CStack {
    private int arr[];
    int i,j;
    

    public CStack() {
        arr = new int[10];
        i = -1;
        j = arr.length;

    }

    public boolean isFull() {
        if (j - i == 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isEmptyA() {
        return i == -1;
    }

    public boolean isEmptyB() {
        return j == arr.length;
    }

    public CStack(int s) {
        arr = new int[s];
        i = -1;
        j = s;
    }

    public void pushA(int n) {
        if (isFull()) {
            System.out.println("Already Full\n");
            return;
        }
        i++;
        arr[i] = n;

    }

    public void pushB(int n) {
        if (isFull()) {
            System.out.println("Already Full\n");
            return;
        }
        j--;
        arr[j] = n;

    }

    public int popA() {
        if (isEmptyA()) {
            System.out.println("Already empty\n");
            return -1;
        } else {
            int ans = arr[i];
            i--;
            return ans;

        }
    }

    public int popB() {
        if (isEmptyB()) {
            System.out.println("Already empty\n");
            return -1;
        } else {
            int ans = arr[j];
            j++;
            return ans;

        }
    }

    public int peekA() {
        if (isEmptyA()) {
            System.out.println("Already empty\n");
            return -1;
        }
        return arr[i];
    }

    public int peekB() {
        if (isEmptyB()) {
            System.out.println("Already empty\n");
            return -1;
        }
        return arr[j];
    }

    public void display() {
        if (isEmptyA() && isEmptyB()) {
            System.out.println("Already empty\n");

        }
        System.out.println("For A.....");
        if (isEmptyA()) {
            System.out.println("A is empty");
            
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k]+"  \n");
        }
        System.out.println("For B.....");
        if (isEmptyB()) {
            System.out.print("B is Empty");
        }
        for (int k = j; k < arr.length; k++) {
            System.out.print(arr[k]+"  \n");
        }

    }

}

public class StackDoubly {
    public static void main(String[] a) {
        CStack st = new CStack(3);
        
        // intStack st1= new intStack(25);
        Scanner sc = new Scanner(System.in);

        int ch;

        do {

            System.out.println("\n1. PushA");
            System.out.println("2. PushB");
            System.out.println("3. PopA");
            System.out.println("4. PopB");
            System.out.println("5. PeekA");
            System.out.println("6. PeekB");

            System.out.println("7. Display");
            System.out.println("8. Exit");

            System.out.print("Enter the Choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter the number to push into A : ");
                    int n = sc.nextInt();
                    st.pushA(n);
                    break;
                case 2:
                    System.out.print("Enter the number to push into B : ");
                    int m = sc.nextInt();
                    st.pushB(m);
                    break;

                case 3:
                    int valueA = st.popA();

                    if (valueA != -1) {
                        System.out.println("Popped value = " + valueA);
                    }
                    break;
                case 4:
                    int valueB = st.popB();

                    if (valueB != -1) {
                        System.out.println("Popped value = " + valueB);
                    }
                    break;

                case 5:
                    int topValueA = st.peekA();

                    if (topValueA != -1) {
                        System.out.println("Top value = " + topValueA);
                    }
                    break;
                case 6:
                    int topValueB = st.peekB();

                    if (topValueB != -1) {
                        System.out.println("Top value = " + topValueB);
                    }
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;
                case 7:
                    st.display();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 8);

        sc.close();
    }

}
