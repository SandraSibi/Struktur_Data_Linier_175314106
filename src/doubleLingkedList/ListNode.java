/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleLingkedList;

/**
 *
 * @author basisc12
 */
public class ListNode {

    private int data;
    private ListNode next;
    private ListNode prev; // double memiliki prev itu yang membedakan

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
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

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
