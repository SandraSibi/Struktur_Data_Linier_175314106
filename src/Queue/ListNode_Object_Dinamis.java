/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author basisc12
 */
public class ListNode_Object_Dinamis {

    private Object data;
    private ListNode_Object_Dinamis next;
    private ListNode_Object_Dinamis prev; // double memiliki prev itu yang membedakan

    public ListNode_Object_Dinamis() {
    }

    public ListNode_Object_Dinamis(Object data) {
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

    public ListNode_Object_Dinamis getNext() {
        return next;
    }

    public void setNext(ListNode_Object_Dinamis next) {
        this.next = next;
    }

    public ListNode_Object_Dinamis getPrev() {
        return prev;
    }

    public void setPrev(ListNode_Object_Dinamis prev) {
        this.prev = prev;
    }
}
