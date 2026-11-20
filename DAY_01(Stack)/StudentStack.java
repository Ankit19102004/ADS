import java.util.Scanner;

class sStack{
    private Student arr[];
    int i = -1;
    

    public sStack() {
        arr = new Student[10];

    }
    



    public sStack(int s) {
        arr = new Student[s];
    }

    public void push(Student n) {
        if (isFull()) {
            System.out.println("Already Full\n");
            return ;
        }
        i++;
        arr[i] = n;
        
        

    }

    public Student pop() {
        if (isEmpty()) {
            System.out.println("Already empty\n");
            return null;
        } else {
            Student ans = arr[i];
            i--;
            return ans;

        }
    }

    public Student peek() {
        if (isEmpty()) {
            System.out.println("Already empty\n");
            return null;
        }
        
        return arr[i];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Already empty\n");
            

        }
        for(int j=i;j>=0;j--){
            
            System.out.println( arr[j]);
    
        }

    }

}
public class StudentStack {
    public static  void main(String [] a){
        sStack st=new sStack(25);
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
                    System.out.print("Enter the Name to push: ");
                    String name=sc.next();
                    System.out.print("Enter the Roll No to push: ");
                    int rollNo=sc.nextInt();
                    System.out.print("Enter the Age to push: ");
                    int age=sc.nextInt();
                    System.out.print("Enter the Score to push: ");
                    int score=sc.nextInt();
                    Student st1=new Student(name,rollNo,age,score);

                    st.push(st1);
                    break;

                case 2:
                    Student value = st.pop();

                    if (value != null) {
                        System.out.println("Popped value = " + value);
                    }
                    break;

                case 3:
                    Student topValue = st.peek();

                    if (topValue != null) {
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
