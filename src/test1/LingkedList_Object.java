/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import doubleLingkedList.*;

/**
 *
 * @author basisc12
 */
public class LingkedList_Object {

    private ListNode_Object head;
    private int size;
    
    public LingkedList_Object() {
        head = new ListNode_Object(); // pertama kali lingkedList di buat, kondisi awal
        head.setNext(head);  // pertama kali lingkedList di buat, kondisi awal
        head.setPrev(head);  // pertama kali lingkedList di buat, kondisi awal
    }
    
    public int getSize() { // untuk memanggil di method
        return size;
    }
    
    public void addFirst(Object elemen) { // untuk menambah data di awal
        addBefore(elemen, head.getNext()); //
    }
    
    public void addLast(Object elemen) { // untuk menambah data di akhir
        addBefore(elemen, head);
    }
    
    public ListNode_Object addBefore(Object elemen, ListNode_Object bantu) {
        ListNode_Object baru = new ListNode_Object(elemen);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.setPrev(baru);
        baru.getPrev().setNext(baru);
        size++;
        return baru;
        // method ini untuk membantu 
    }
    
    public boolean isEmpty() {
        return head == null;
        
    }
    
    @Override
    public String toString() {
        String isi = " ";  // untuk mengetahui isinya
        ListNode_Object pointer = head.getNext();  // untuk munduru 1 langka
        while (pointer != head) { // untuk mengecek tidak sama dengan null
            isi += pointer.getData() + " ";
            pointer = pointer.getNext();
            // akan di lakukan hingga selesai
        }
        return isi;
    }

    public ListNode_Object Search(Object kunci) {
        ListNode_Object pointer = head.getNext();
        while (pointer != head) { // untuk mengecek tidak sama dengan null
            if (((Comparable) pointer.getData()).compareTo(kunci) == 0){
                return pointer;
            }
            pointer = pointer.getNext();
        }
        
        return null;
    }

    public ListNode_Object removeFirst() {
        return remove(head.getNext());
    }

    public ListNode_Object removeLast() {
        return remove(head.getPrev());
    }

    public ListNode_Object remove(ListNode_Object item) {
        ListNode_Object point = item;
        point.getPrev().setNext(point.getNext());
        point.getNext().setPrev(point.getPrev());
        size--;
        return point;
        
    }

    public ListNode_Object removeMid(Object kunci) {
        ListNode_Object pointer = Search(kunci.toString());
        return remove(pointer);
    }
}
