import java.util.*;

class SlQueue {
    private int arr[];
    private int front, rear;

    public SlQueue() {
        arr = new int[10];
        front = rear = -1;
    }

    public SlQueue(int s) {
        arr = new int[s];
        front = rear = -1;
    }

    public boolean isFull() {
        if (rear == arr.length - 1)
            return true;
        else
            return false;
    }

    public boolean isEmpty() {
        if ((front == -1) || (front == rear + 1))
            return true;
        else
            return false;
    }

    public void insert(int d) {
        if (isFull()) {
            System.out.println("OverFlow");
            return;
        }
        if (front == -1)
            front = 0;
        rear = rear + 1;
        arr[rear] = d;
        return;
    }

    public int delete() {
        if (isEmpty()) {
            return -1;
        }
        int d = arr[front];
        for (int i = front; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        front = 0;
        rear -= 1;

        return d;

    }
    public void display(){
        for(int i=0;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }

}

public class SlowQueue {
    public static void main(String[] args) {
        SlQueue q = new SlQueue(5);
        int ch;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Choice from below\n1.Insert\n2.Delete\n3.Display\n4.Exit");

            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the Value :> ");
                    int s = sc.nextInt();
                    q.insert(s);
                    System.out.println(
                            "\n--------------------------------------------------------\n--------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("The Deleted No. is=> " + q.delete()
                            + "\n--------------------------------------------------------\n--------------------------------------------------------");
                    break;
                case 4:
                    System.out.println(
                            "EXIT\n--------------------------------------------------------\n--------------------------------------------------------");
                case 3:
                    q.display();
                default:
                    break;
            }
        } while (ch != 4);

    }

}