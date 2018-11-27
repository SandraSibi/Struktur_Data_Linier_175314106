/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleLingkedList;

/**
 *
 * @author basisc12
 */
public class LingkedList {

    private ListNode head;
    private int size;

    public LingkedList() {
        head = new ListNode(); // pertama kali lingkedList di buat, kondisi awal
        head.setNext(head);  // pertama kali lingkedList di buat, kondisi awal
        head.setPrev(head);  // pertama kali lingkedList di buat, kondisi awal
    }

    public int getSize() { // untuk memanggil di method
        return size;
    }

    public void addFirst(int elemen) {
        addBefore(elemen, head.getNext());
    }

    public void addLast(int elemen) {
        addBefore(elemen, head);
    }

    public ListNode addBefore(int elemen, ListNode bantu) {
        ListNode baru = new ListNode(elemen);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.setPrev(baru);
        baru.getPrev().setNext(baru);
        size++;
        return baru;
    }

    public boolean isEmpty() {
        return head == null;

    }

    @Override
    public String toString() {
        String isi = " ";  // untuk mengetahui isinya
        ListNode pointer = head.getNext();  // untuk munduru 1 langka
        while (pointer != head) { // untuk mengecek tidak sama dengan null
            isi += pointer.getData() + " ";
            pointer = pointer.getNext();
            // akan di lakukan hingga selesai
        }
        return isi;
    }

    public int Search(int kunci) {
        ListNode pointer = head.getNext();
        while (pointer != head) { // untuk mengecek tidak sama dengan null
            if (kunci == pointer.getData()) {
                return 1;
            }
            pointer = pointer.getNext();
        }

        return -1;
    }

    public ListNode removeFirst() {
        return remove(head.getNext());
    }

    public ListNode removeLast() {
        return remove(head.getPrev());
    }

    public ListNode remove(ListNode item) {
        ListNode point = item;
        point.getPrev().setNext(point.getNext());
        point.getNext().setPrev(point.getPrev());
        size--;
        return point;
    }

    public ListNode removeMid(int kunci) {
        ListNode pointer = head.getNext();
        while (pointer != head) {
            if (kunci == pointer.getData()) {
                return remove(pointer);
            }
            pointer = pointer.getNext();
        }
        return null;
    }
}
