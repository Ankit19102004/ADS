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

public class Queue {
    private intNode head;
    private int front, rear;

    public Queue() {
        data = null;
        front = rear = -1;
    }

    public Queue(int d) {
        data = d;
        front = rear = -1;
    }

    public void add(int d) {
        intNode node = new intNode(d);
        if (head == null) {
            head = node;
            return;
        } else {

            node.setNext(head);
            head = node;

        }

    }

    public int delete() {
        intNode iterator = head;
        if (head == null) {
            return -1;
        }

        while (iterator.getNext().getNext() != null) {

            iterator = iterator.getNext();

        }
        int d = iterator.getNext().getData();
        iterator.setNext(null);
        return d;

    }

}

public class QueuebyLL {

}
