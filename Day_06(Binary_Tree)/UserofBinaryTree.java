import java.util.function.Predicate;

class BTNode {
    private int data;
    private BTNode left, right;

    public BTNode(int d) {
        data = d;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }
}

class Binary_tree {

    private BTNode root;

    public Binary_tree() {
        root = null;
    }

    public void setRoot(BTNode R) {
        root = R;
    }

    public BTNode getRoot() {
        return root;
    }

    public void preorder(BTNode root) {

        if (root == null)
            return;

        System.out.print(root.getData() + " ");

        preorder(root.getLeft());
        preorder(root.getRight());
    }

    public void inorder(BTNode root) {

        if (root == null)
            return;

        inorder(root.getLeft());
        System.out.print(root.getData() + " ");
        preorder(root.getRight());
    }

    public void Postorder(BTNode root) {
        if (root == null)
            return;
        Postorder(root.getLeft());
        Postorder(root.getRight());
        System.out.print(root.getData() + " ");
    }

    public boolean isIdentical(Binary_tree t1, Binary_tree t2) {

        // Both trees are empty
        if (t1.getRoot() == null && t2.getRoot() == null) {
            return true;
        }

        // Only one tree is empty
        if (t1.getRoot() == null || t2.getRoot() == null) {
            return false;
        }

        BTNodeQueue q1 = new BTNodeQueue(10);
        BTNodeQueue q2 = new BTNodeQueue(10);

        q1.insert(t1.getRoot());
        q2.insert(t2.getRoot());

        while (!q1.isEmpty() && !q2.isEmpty()) {

            BTNode iter1 = q1.delete();
            BTNode iter2 = q2.delete();

            // Compare data
            if (iter1.getData() != iter2.getData()) {
                return false;
            }

            // Check left child structure
            if ((iter1.getLeft() == null) != (iter2.getLeft() == null)) {
                return false;
            }

            // Check right child structure
            if ((iter1.getRight() == null) != (iter2.getRight() == null)) {
                return false;
            }

            // Add left children
            if (iter1.getLeft() != null) {
                q1.insert(iter1.getLeft());
                q2.insert(iter2.getLeft());
            }

            // Add right children
            if (iter1.getRight() != null) {
                q1.insert(iter1.getRight());
                q2.insert(iter2.getRight());
            }
        }

        return q1.isEmpty() && q2.isEmpty();
    }

    public void insert_level(int d) {

        BTNode node = new BTNode(d);
        if (root == null) {
            root = node;
            return;
        }

        BTNodeQueue q = new BTNodeQueue(10);

        q.insert(root);

        while (!q.isEmpty()) {

            BTNode iterator = q.delete();
            if (iterator.getLeft() == null) {

                iterator.setLeft(node);
                return;
            }

            else if (iterator.getRight() == null) {

                iterator.setRight(node);
                return;
            } else {
                q.insert(iterator.getLeft());
                q.insert(iterator.getRight());
            }
        }
    }
    public void leaf_node(){
        if(root==null){
            return;
        }
        BTNodeQueue q=new BTNodeQueue(10);
        q.insert(root);
        while(!q.isEmpty()){
            BTNode iterator =q.delete();
            if (iterator.getLeft() != null) {
                q.insert(iterator.getLeft());
            }

            if (iterator.getRight() != null) {
                q.insert(iterator.getRight());
            }
            if(iterator.getLeft()==null && iterator.getRight()==null){
                System.out.print(" "+iterator.getData());
            }
            
        }
    }
    public void Sum_leaf_node(){
        int sum=0;
        if(root==null){
            return;
        }
        BTNodeQueue q=new BTNodeQueue(10);
        q.insert(root);
        while(!q.isEmpty()){
            BTNode iterator =q.delete();
            if (iterator.getLeft() != null) {
                q.insert(iterator.getLeft());
            }

            if (iterator.getRight() != null) {
                q.insert(iterator.getRight());
            }
            if(iterator.getLeft()==null && iterator.getRight()==null){
                sum=sum+iterator.getData();
               
            }
           
            
        }
          System.out.println("\n"+sum);
    }

    public void level_display() {

        if (root == null) {
            System.out.println("Empty............");
            return;
        }

        BTNodeQueue q = new BTNodeQueue(10);

        q.insert(root);

        while (!q.isEmpty()) {

            BTNode iterator = q.delete();

            System.out.print(iterator.getData() + " ");

            if (iterator.getLeft() != null) {
                q.insert(iterator.getLeft());
            }

            if (iterator.getRight() != null) {
                q.insert(iterator.getRight());
            }
        }
    }
    

}

class BTNodeQueue {

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
        Binary_tree bt1 = new Binary_tree();

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
        System.out.println("\n\nPostorder:");
        bt.Postorder(bt.getRoot());
        bt1.insert_level(50);
        bt1.insert_level(17);
        bt1.insert_level(70);
        bt1.insert_level(15);
        bt1.insert_level(24);
        bt1.insert_level(67);
        Binary_tree TEMP=new Binary_tree();
        if(TEMP.isIdentical(bt1, bt)){
            System.out.println("True");
        }
        else{
            System.out.println("False ");
        }
        bt.leaf_node();
        bt.Sum_leaf_node();

    }
}