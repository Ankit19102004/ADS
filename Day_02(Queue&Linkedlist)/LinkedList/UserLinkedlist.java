import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class intNode {
    private int data;
    private intNode next;// self reference

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

class LinkedList {
    private intNode head;

    public LinkedList() {
        head = null;
    }

    public void setHead(intNode h) {
        head = h;
    }

    public intNode getHead() {
        return head;
    }

    public void insertlast(int d) {
        intNode node = new intNode(d);
        if (head == null) {
            head = node;
            return;
        } else {
            intNode iterator = head;
            while (iterator.getNext() != null) {
                iterator = iterator.getNext();

            }
            iterator.setNext(node);
            return;

        }
    }

    public void insertFirst(int d) {
        intNode node = new intNode(d);
        if (head == null) {
            head = node;
            return;
        } else {

            node.setNext(head);
            head = node;
           

        }

    }

    public void display() {
        if (head == null) {
            System.out.println("List Is Empty ......");
        }
        intNode iterator = head;
        while (iterator != null) {

            System.out.print(iterator.getData() + " -> ");
            // System.out.print(iterator.getNext()+" -> ");
            iterator = iterator.getNext();
        }
    }

    public int deleteFirst() {
        intNode deleteable = head;
        int d = head.getData();
        head = head.getNext();
        deleteable.setNext(null);
        deleteable = null;
        return d;
    }
    public void insertbypos(int p, int d) {

        if (p < 1) {
            return;
        }
        if (p == 1) {
            insertFirst(d);
            return;
        }
        intNode iterator = head;
        for (int i = 1; i < p - 1 && iterator != null; i++) {
            iterator = iterator.getNext();
        }
        if (iterator == null) {
            return;
        }
        intNode new_node = new intNode(d);
        new_node.setNext(iterator.getNext());
        iterator.setNext(new_node);
    }

    public int deletelast() {
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

    public int deletebyPos(int p) {
        intNode deteleable = head;
        int cnt = 0;
        if (head == null) {
            return -1;
        }
        if (p == 0) {
            int d = head.getData();
            head = head.getNext();
            return d;
        }
        while (cnt < p - 2 && deteleable != null) {
            deteleable = deteleable.getNext();
            cnt++;

        }
        if (deteleable == null || deteleable.getNext() == null) {
            System.out.println("andar");
            return -1;
        }
        int d = deteleable.getNext().getData();
        deteleable.setNext(deteleable.getNext().getNext());
        return d;

    }

    public void reverse() {
        intNode itreator = head, prev = null, next;
       
        while (itreator != null) {
            next = itreator.getNext();
            itreator.setNext(prev);
            prev = itreator;
            itreator = next;
        }
        head = prev;

    }

    public void displayrev() {
        reverse();
        intNode itreator = head;
        while (itreator != null) {
            System.out.println(itreator.getData());
            itreator = itreator.getNext();

        }

    }

    public void insertbdata(int pd, int d) {
    intNode itreator = head;
    if (head == null) {
    return;
    }
    if (head.getData() == pd) {
    insertFirst(d);
    return;
    }

    intNode new_node = new intNode(d);
    while (itreator.getNext() != null && itreator.getNext().getData() != pd) {
    itreator = itreator.getNext();

    }
    new_node.setNext(itreator.getNext());

    itreator.setNext(new_node);

    }
    

    public void insertadata(int pd, int d) {

        intNode iterator = head;

        if (head == null) {
            return;
        }

        while (iterator != null && iterator.getData() != pd) {
            iterator = iterator.getNext();
        }

        if (iterator == null) {
            return;
        }

        intNode new_node = new intNode(d);

        new_node.setNext(iterator.getNext());
        iterator.setNext(new_node);
    }

    public int deletebydata(int pd) {
        intNode itreator = head;
        if (head == null) {
            return -1;
        }
        while (itreator.getNext().getData() != pd) {
            itreator = itreator.getNext();
        }
        int d = itreator.getNext().getData();
        itreator.setNext(itreator.getNext().getNext());
        return d;

    }

    public void swapAlternate() {
        if (head == null || head.getNext() == null) {
            return;
        }
        intNode temp = null;
        intNode iterator = head;

        while (iterator != null && iterator.getNext() != null) {

            intNode swapR = iterator.getNext();

            iterator.setNext(swapR.getNext());
            swapR.setNext(iterator);
            if (temp == null) {
                head = swapR;
                
            } else {
                temp.setNext(swapR);
            }
            temp = iterator;
            iterator = iterator.getNext();

        }
    }
    public void reverseByN(int n) {

    if (head == null || n <= 1) {
        return;
    }

    intNode current = head;
    intNode prev = null;
    intNode next = null;
    intNode newHead = null;
    intNode groupEnd = null;
    while (current != null) {
        intNode groupStart = current;
        intNode temp = current;
        int count = 0;
        while (temp != null && count < n) {
            temp = temp.getNext();
            count++;
        }
        if (count < n) {
            if (groupEnd != null) {
                groupEnd.setNext(current);
            }
            break;
        }
        prev = null;
        current = groupStart;

        for (int i = 0; i < n; i++) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        if (newHead == null) {
            newHead = prev;
        }
        if (groupEnd != null) {
            groupEnd.setNext(prev);
        }
        groupEnd = groupStart;
    }

    head = newHead;
}

}

public class UserLinkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Insert By Position");
            System.out.println("4. Insert Before Data");
            System.out.println("5. Insert After Data");
            System.out.println("6. Delete First");
            System.out.println("7. Delete Last");
            System.out.println("8. Delete By Position");
            System.out.println("9. Delete By Data");
            System.out.println("10. Reverse LL");
            System.out.println("11. Display Reverse");
            System.out.println("12. Display");
            System.out.println("13. Swap Alternative ");
            System.out.println("14. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    ll.insertFirst(sc.nextInt());
                    break; // FIXED: Changed return; to break;
                case 2:
                    System.out.print("Enter value: ");
                    ll.insertlast(sc.nextInt()); // FIXED: Called insertlast, not insertFirst
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    int val2 = sc.nextInt();
                    ll.insertbypos(pos, val2); // FIXED: Called insertbypos
                    break;
                case 4:
                    System.out.print("Enter target data to find: ");
                    int pd = sc.nextInt();
                    System.out.print("Enter new value to insert: ");
                    int d = sc.nextInt();
                    ll.insertbdata(pd, d);
                    break;
                case 5:
                    System.out.print("Enter target data to find: ");
                    int targetA = sc.nextInt();
                    System.out.print("Enter new value to insert: ");
                    int valA = sc.nextInt();
                    ll.insertadata(targetA, valA);
                    break;
                case 6:
                    System.out.println("Deleted: " + ll.deleteFirst());
                    break;
                case 7:
                    System.out.println("Deleted: " + ll.deletelast());
                    break;
                case 8:
                    System.out.print("Enter position: ");
                    System.out.println("Deleted: " + ll.deletebyPos(sc.nextInt()));
                    break;
                case 9:
                    System.out.print("Enter data to delete: ");
                    System.out.println("Deleted status/value: " + ll.deletebydata(sc.nextInt()));
                    break;
                case 10:
                    ll.reverse();
                    System.out.println("List reversed permanently.");
                    break;
                case 11:
                    System.out.println("Reversed view:");
                    ll.displayrev();
                    break;
                case 12:
                    ll.display();
                    break;
                case 13:
                    ll.swapAlternate();
                    break;
                case 14:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 14);
        sc.close();
    }
}
/*
 * //menu driven
 * 4.insert berfore data
 * 5.insert after data
 * 6.Delete First
 * 7.Delete last
 * 8.Delete By Position
 * 9.Delete By Data
 * 10.Reverse LL
 * 11.Display Reverse
 * 12.Display
 */
/*
 * public int deletebyPos(int p) {
 * 
 * if (last == null || p <= 0) {
 * return -1;
 * }
 * 
 * // Only one node
 * if (last.getNext() == last) {
 * if (p == 1) {
 * int d = last.getData();
 * last = null;
 * return d;
 * }
 * return -1;
 * }
 * 
 * // Delete first position
 * if (p == 1) {
 * int d = last.getNext().getData();
 * last.setNext(last.getNext().getNext());
 * return d;
 * }
 * 
 * intNode deleteNode = last.getNext(); // front
 * int cnt = 1;
 * 
 * // Reach node just before position p
 * while (cnt < p - 1 && deleteNode.getNext() != last.getNext()) {
 * deleteNode = deleteNode.getNext();
 * cnt++;
 * }
 * 
 * // Position does not exist
 * if (cnt != p -1 || deleteNode.getNext() == last.getNext()) {
 * return -1;
 * }
 * 
 * intNode temp = deleteNode.getNext();
 * int d = temp.getData();
 * 
 * // If deleting last/rear node
 * if (temp == last) {
 * last = deleteNode;
 * }
 * 
 * deleteNode.setNext(temp.getNext());
 * 
 * return d;
 * }
 */