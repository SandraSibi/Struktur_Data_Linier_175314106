/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LingkedList;

/**
 *
 * @author basisc12
 */
public class ListNode {

    private int data;
    private ListNode next;  // menggunakan ListNode karena di kananya listNode juga

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = null;
        // data baru atau data pertama akan di kesekusi di sini
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
