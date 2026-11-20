class CirculerList {
    private intNode last;

    public CirculerList() {
        last = null;
    }

    public void insertFirst(int d) {
        intNode node = new intNode(d);
        if (last == null) {
            last = node;
            last.setNext(last);
            return;
        }
        node.setNext(last.getNext());
        last.setNext(node);
        return;
    }

    public void insertlast(int d) {
        intNode node = new intNode();
        if (last == null) {
            last = node;
            last.setNext(last);
            return;
        }
        node.setNext(last.getNext());
        last.setNext(node);
        last = node;
        return;
    }

    public void display() {
        if (last == null) {
            System.out.println("Empty");
            return;
        }
        intNode iterator = last.getNext();
        do {
            System.out.println(" " + iterator.getData());
            iterator = iterator.getNext();
        // } while (iterator != last.getNext());
        }while (iterator.getNext()!=last.getNext().getNext());
        return;

    }

    public int deletelast() {
        if (last == null) {
            System.out.println("Empty");
            return -1;
        }
        if (last == last.getNext()) {
            int d = last.getData();
            last.setNext(null);
            last = null;
            return d;

        }
        intNode iterator = last.getNext();
        while (iterator.getNext() != last) {
            iterator = iterator.getNext();
        }
        iterator.setNext(last.getNext());
        intNode deleteable = last;

        int d = deleteable.getData();
        deleteable.setNext(null);
        deleteable = null;
        last = iterator;
        return d;

    }

    public void insertbypos(int pos, int d) {
        intNode iterator = last;
        if (last == null) {
            System.out.println("Empty");
            return;
        }
        if (pos == 1) {
            insertFirst(d);
            return;
        }
        int cnt = 0;
        while (cnt < pos - 1 && iterator.getNext() != last) {
            iterator = iterator.getNext();
            cnt++;
        }
        intNode new_node = new intNode(d);
        new_node.setNext(iterator.getNext());
        iterator.setNext(new_node);
    }

    public int deletebyPos(int p) {
        intNode deleteNode = last.getNext();
        int cnt = 1;

        if (last == null) {
            return -1;
        }
        if (p == 1) {
            int d = last.getNext().getData();
            last.setNext(last.getNext().getNext());
            return d;
        }
        while (cnt < p - 1 && deleteNode != last) {
            deleteNode = deleteNode.getNext();
            cnt++;
        }
        intNode temp = deleteNode.getNext();
        int d = temp.getData();
        if (temp == last) {
            last = deleteNode;
        }
        deleteNode.setNext(temp.getNext());
        return d;
    }

    public int deleteFirst() {
        if (last == null) {
            return -1;
        }
        int d = last.getNext().getData();
        last.setNext(last.getNext().getNext());
        return d;
    }

    public int deletebydata(int d) {
        if (last == null) {
            return -1;
        }
        intNode iterator = last;
        while (iterator.getNext().getData() != d) {
            iterator = iterator.getNext();
        }
        int d1=iterator.getNext().getData();
        iterator.setNext(iterator.getNext().getNext());
        return d1;
    }
    public void insertbdata(int d){
        if (last == null) {
            return ;
        }
        

    }

}

public class CirculerLinkedlist {
    public static void main(String[] args) {
        CirculerList cl = new CirculerList();
        cl.insertFirst(12);
        cl.insertFirst(30);
        cl.insertFirst(20);
        cl.insertFirst(28);
        cl.insertFirst(29);
        cl.insertFirst(25);
        cl.display();
        System.out.println("-----------");
        cl.insertbypos(2, 15);
        cl.display();
        cl.deletebyPos(2);
        System.out.println("-----------");
        cl.display();
        cl.deleteFirst();
        System.out.println("-----------");
        cl.display();
        cl.deletebydata(20);
        System.out.println("-----------");
        cl.display();
        cl.deletebydata(30);
        System.out.println("-----------");
        cl.display();

    }

}
/*
public void swapAlternate() {

    if (head == null || head.getNext() == null) {
        return;
    }

    intNode prev = null;
    intNode first = head;

    while (first != null && first.getNext() != null) {

        intNode second = first.getNext();

        // Swap
        first.setNext(second.getNext());
        second.setNext(first);

        // Connect previous pair to current pair
        if (prev == null) {
            head = second;
        } else {
            prev.setNext(second);
        }

        // Move to next pair
        prev = first;
        first = first.getNext();
    }
}
     */