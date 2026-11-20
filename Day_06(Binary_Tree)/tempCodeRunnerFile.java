
    private BTNode arr[];
    private int front, rear;


    public BTNodeQueue() {

        arr = new BTNode[10];

        front = rear = -1;
    }


    public BTNodeQueue(int s) {

        arr = new BTNode[s];

        front = rear = -1;
    }


    public boolean isFull() {

        return rear == arr.length - 1;
    }


    public boolean isEmpty() {

        return front == -1 || front == rear + 1;
    }


    public void insert(BTNode d) {

        if (isFull()) {

            System.out.println("Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;

        arr[rear] = d;
    }


    public BTNode delete() {

        if (isEmpty()) {

            return null;
        }

        BTNode d = arr[front];

        front++;

        return d;
    }
}


public class UserofBinaryTree {

    public static void main(String[] args) {

        Binary_tree bt = new Binary_tree();

        bt.insert_level(50);
        bt.insert_level(17);
        bt.insert_level(72);
        bt.insert_level(15);
        bt.insert_level(24);
        bt.insert_level(67);

        System.out.println("Level Order:");

        bt.level_display();

        System.out.println("\n\nPreorder:");

        bt.preorder(bt.getRoot());
        System.out.println("\n\nInorder:");
        bt.inorder(bt.getRoot());
    }