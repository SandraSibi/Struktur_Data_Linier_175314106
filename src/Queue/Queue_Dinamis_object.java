/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author basisc11
 */
public class Queue_Dinamis_object {

    private LingkedList_Object_Dinamis antrian;

    public Queue_Dinamis_object() {
        antrian = new LingkedList_Object_Dinamis();

    }

    public void enqueue(Object elemen) {
        antrian.addLast(elemen);
    }

    public ListNode_Object_Dinamis dequeue() {
        return antrian.removeFirst();

    }

    public int Size() {
        return antrian.getSize();
    }

    public boolean isEmpty() {
        if (antrian == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            int front = 0;
            int data = front;
            String isi = " ";
            while (data != -1) {
                isi += antrian + " ";
                data--;
            }
            return isi;
        } else {
            return "kosong";
        }
    }
}
