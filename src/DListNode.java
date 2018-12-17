

public class DListNode {

    int elemen;
    DListNode next;
    DListNode previous;

    public DListNode() {
    }

    public DListNode(int elemen) {
        this.elemen = elemen;
    }

    public DListNode(int elemen, DListNode next, DListNode previous) {
        this.elemen = elemen;
        this.next = next;
        this.previous = previous;
    }

    public int getElemen() {
        return elemen;
    }

    public void setElemen(int elemen) {
        this.elemen = elemen;
    }

    public DListNode getNext() {
        return next;
    }

    public void setNext(DListNode next) {
        this.next = next;
    }

    public DListNode getPrev() {
        return previous;
    }

    public void setPrev(DListNode previous) {
        this.previous = previous;
    }
}
