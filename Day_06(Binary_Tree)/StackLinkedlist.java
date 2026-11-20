class intNode {
    private int data;
    private intNode next;
    public intNode() {
        data = 0;
        next = null;
    }
    public intNode(int d) {
        data = d;
        next = null;
    }
    public int getData() {
        return data;
    }
    public void setData(int d) {
        data = d;
    }
    public intNode getNext() {
        return next;
    }
    public void setNext(intNode n) {
        next = n;
    }
}
class stackByLL {
    private intNode top = null;
    public void push(int d) {
        intNode new_node = new intNode(d);
        new_node.setNext(top);
        top = new_node;
    }
    public int pop() {
        if (top == null) {
            System.out.println("Stack is Empty...");
            return -1;
        }
        intNode deleteable = top;
        int d = top.getData();
        top = top.getNext();
        deleteable = null;
        return d;
    }
    public void display() {
        if (top == null) {
            System.out.println("Stack is Empty...");
            return;
        }
        intNode iterator = top;
        while (iterator != null) {
            System.out.print(iterator.getData() + " -> ");
            iterator = iterator.getNext();
        }
    }
}


public class StackLinkedlist {
    public static void main(String[] args) {
        stackByLL st = new stackByLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println("\nPop: " + st.pop());
        System.out.println("Pop: " + st.pop());

        st.display();
    }
}