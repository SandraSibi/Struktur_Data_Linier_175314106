/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Lenovo
 */
public class Static_Object_Dinamis {

    private LingkedList_Object_Dinamis tumpukan;

    public Static_Object_Dinamis() {
         tumpukan = new LingkedList_Object_Dinamis();
    }

    public void push(Object elemen) {
        tumpukan.addFirst(elemen);
    }

    public ListNode_Object_Dinamis pop() {
        return tumpukan.removeFirst();
    }

    public boolean isEmpty() {
        if (tumpukan == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            int front = 0;
            int data = front;
            String isi = "";
            while (data != -1) {
                isi += tumpukan + " ";
                data--;
            }
            return isi;
        } else {
            return "kosong ";
        }

    }

    public int getsize() {
        return tumpukan.getSize();
    }

}
