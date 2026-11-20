//Linear Queue

import java.util.Scanner;

class intQueue{
    private int arr[];
    private int front,rear;
    public intQueue(){
        arr=new int [10];
        front=rear=-1;

    }
    public intQueue(int s){
        arr=new int[s];
        front=rear =-1;

    }
    public boolean  isFull(){
        if (rear == arr.length-1)
            return  true;
        else
            return false;
    }
    public boolean isEmpty(){
        if ((front==-1)||(front==rear+1))
            return true;
        else 
            return false;

    }
    public void insert(int d){
        
        if(front==-1) front=0;
        rear =rear+1;
        arr[rear]=d;
        return;
    }
    public int delete(){
        if(isEmpty()){
            return -1;
        }
        int d=arr[front];
        front=front+1;
        return d;
    }
}
public class SimpleQueue {
    public static void main(String[] args) {
        intQueue q=new intQueue(5);
        int ch;
        Scanner sc=new Scanner(System.in);
        do{

            System.out.println("Choice from below\n1.Insert\n2.Delete\n3.EXIT");
            
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the Value :> ");
                    int s=sc.nextInt();
                    q.insert(s);
                    System.out.println("\n--------------------------------------------------------\n--------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("The Deleted No. is=> "+q.delete()+"\n--------------------------------------------------------\n--------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("EXIT\n--------------------------------------------------------\n--------------------------------------------------------");
            
                default:
                    break;
            }
        }while(ch!=3); 

    }
   
}
 /*public boolean isIdentical(Binary_tree t1, Binary_tree t2) {

    if (t1.getRoot() == null && t2.getRoot() == null) {
        return true;
    }

    if (t1.getRoot() == null || t2.getRoot() == null) {
        return false;
    }

    BTNodeQueue q1 = new BTNodeQueue(10);
    BTNodeQueue q2 = new BTNodeQueue(10);

    BTNode iter1 = t1.getRoot();
    BTNode iter2 = t2.getRoot();

    q1.insert(iter1);
    q2.insert(iter2);

    while (!q1.isEmpty() && !q2.isEmpty()) {

        iter1 = q1.delete();
        iter2 = q2.delete();

        // Compare data
        if (iter1.getData() != iter2.getData()) {
            return false;
        }

        // Compare left-child existence
        if ((iter1.getLeft() == null) != (iter2.getLeft() == null)) {
            return false;
        }

        // Compare right-child existence
        if ((iter1.getRight() == null) != (iter2.getRight() == null)) {
            return false;
        }

        // Insert left children
        if (iter1.getLeft() != null) {
            q1.insert(iter1.getLeft());
            q2.insert(iter2.getLeft());
        }

        // Insert right children
        if (iter1.getRight() != null) {
            q1.insert(iter1.getRight());
            q2.insert(iter2.getRight());
        }
    }

    return q1.isEmpty() && q2.isEmpty();
} */