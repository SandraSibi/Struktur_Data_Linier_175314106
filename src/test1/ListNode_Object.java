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
public class ListNode_Object {

    private Object data;
    private ListNode_Object next;
    private ListNode_Object prev; // double memiliki prev itu yang membedakan

    public ListNode_Object() {
    }

    public ListNode_Object(Object data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ListNode_Object getNext() {
        return next;
    }

    public void setNext(ListNode_Object next) {
        this.next = next;
    }

    public ListNode_Object getPrev() {
        return prev;
    }

    public void setPrev(ListNode_Object prev) {
        this.prev = prev;
    }
}
