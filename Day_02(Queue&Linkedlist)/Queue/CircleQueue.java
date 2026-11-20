import java.util.Scanner;

class cirQueue {
    private int arr[];
    private int front, rear;

    public cirQueue() {
        arr = new int[10];
        front = rear = -1;
    }

    public cirQueue(int s) {
        arr = new int[s];
        front = rear = -1;
    }

    public boolean isFull() {
        if ((front == 0 && rear == arr.length - 1) || (front == rear + 1)) {
            return true;
        } else
            return false;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else
            return false;

    }

    public void insert(int d) {
        if (isFull()) {
            System.out.println("OverFlow");
            return;
        }
        if (front == -1)
            front = 0;
        if (rear == arr.length - 1)
            rear = 0;
        else
            rear = rear + 1;
        arr[rear] = d;
    }

    public int del() {
        if (isEmpty())
            return -1;
        int d = arr[front];
        if (front == rear)
            front = rear = -1;
        else if (front == arr.length - 1)
            front = 0;
        else
            front = front + 1;
        return d;
    }
}

public class CircleQueue {
    public static void main(String[] args) {
        cirQueue c = new cirQueue(5);
        Scanner sc = new Scanner(System.in);
        // Menu Driven Program
        int ch;
        do {

            System.out.println("Choice from below\n1.Insert\n2.Delete\n3.EXIT");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the Value :> ");
                    int s = sc.nextInt();
                    c.insert(s);
                    System.out.println(
                            "\n--------------------------------------------------------\n--------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("The Deleted No. is=> " + c.del()
                            + "\n--------------------------------------------------------\n--------------------------------------------------------");
                    break;
                case 3:
                    System.out.println(
                            "EXIT\n--------------------------------------------------------\n--------------------------------------------------------");

                default:
                    break;
            }
        } while (ch != 3);
    }

}
