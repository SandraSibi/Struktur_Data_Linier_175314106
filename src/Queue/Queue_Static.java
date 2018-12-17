/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author SandraPc
 */
public class Queue_Static {

    private int front; // depan
    private int rear; // belakannya
    private int size;
    private int[] data;

    public Queue_Static(int jumlahData) {
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.data = new int[jumlahData];

    }

    public void enqueue(int input) {
        if (!isFull()) {
            data[rear] = input;
            rear++;
            size++;
        } else {
            System.out.println("Queue sudah penuh");
        }
    }
    public int dequeue() {
        if (!isEmpty()) {
            front++;
            size--;
            
        }
        return 0;  
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if (rear == data.length) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String tampil = " ";
        for (int i = front; i < rear; i++) {
            tampil += data[i] + " ";
        }
        return tampil;
    }
}
