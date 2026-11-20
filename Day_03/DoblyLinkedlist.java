class doublyNode{
    private int data;
    private  doublyNode prev,next;
    public doublyNode(){
        data =0;
        prev=next=null;
    }
    public doublyNode(int d){
        data =d;
        prev =next=null;

    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public doublyNode getPrev() {
        return prev;
    }
    public void setPrev(doublyNode prev) {
        this.prev = prev;
    }
    public doublyNode getNext() {
        return next;
    }
    public void setNext(doublyNode next) {
        this.next = next;
    }
    
}
class DoublyLL{
    private doublyNode head;
    public  DoublyLL(){
        
    }
}
public class DoblyLinkedlist {
    
}
