/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author basisc12
 */
public class Stack_Array_Static {

    private int front; // menunjuk data yang paling atas
    private int size; // menunjuk ukuran
    private int[] data; // int[] karena datanya banyak

    public Stack_Array_Static() {
    }

    public Stack_Array_Static(int jumlahData) {
        this.data = new int[jumlahData]; // menunjuk jumlah data
        this.size = 0;
        this.front = -1;

    }

    public boolean push(int input) {
        if (!isFull()) {
            this.data[++front] = input;
            size++;
        }
        return true;
    }

    public int pop() {
        if (!isEmpty()) {
            front--;

            size--;
        }
        return 0; 

    }

    public boolean isFull() {
        if (size == data.length) { // ketika size sudah sama dengan banyak data maka
            return true; // penuh dan return true kembalikan nilai true
        }
        return false;

    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (front != -1) {
            int tampung = front;
            String cetak = "";
            while (tampung != -1) {
                cetak = cetak + " " + data[tampung];
                tampung--;
            }
            return cetak;
        } else {
            return " kosong ";
        }
    }

    public int getSize() {
        return size;
    }
}
