/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleLingkedList;

import Stack.*;
import Stack.LingkedList_Object_Dinamis;

/**
 *
 * @author basisc12
 */
public class Stack_Array_Dinamis {

    private LingkedList_Object_Dinamis tumpukan;
   // private int fronto;
   // private int size;
    private int[] data;
    
    

    public Stack_Array_Dinamis() {
        LingkedList_Object_Dinamis tumpukan = new LingkedList_Object_Dinamis();
    }

    public void push(Object elemen) {
        tumpukan.addFirst(elemen);

    }

    public ListNode_Object_Dinamis pop() {
        return tumpukan.removeFirst();
    }

    public int getSize() {
        return tumpukan.getSize();
    }

    public boolean isEmpty() {
        if (tumpukan == null) {
            return true;
        }
        return false;

    }

    public String toString() {
        if (!isEmpty()) {
            int fronto = 0;
            int data = fronto;
            String isi = " ";
            while (data != -1) {
                isi += tumpukan + " ";
                data--;

            }
            return isi;

        } else {
            return "kosong";
        }

    }

}
