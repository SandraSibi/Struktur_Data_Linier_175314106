/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LingkedList;

/**
 *
 * @author basisc12
 */
public class LingkedList {

    private ListNode firstNode; // data awal
    private ListNode lastNode; // data akhir
    private int size; // isi panjang data

    public LingkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    public void addFirst(int first) { // menambah yang di depan
        ListNode baru = new ListNode(first);
        if (isEmpty()) {
            firstNode = baru;
            lastNode = baru;
            // untuk data yang kosong

        } else {
            baru.setNext(firstNode);
            firstNode = baru;
            // untuk menambahkan untuk data yang bary
        }
        size++;
    }

    public void addLast(int last) { // menambah yang di belakang
        ListNode baru = new ListNode(last);
        if (isEmpty()) {
            firstNode = baru;
            lastNode = baru;

        } else {
            lastNode.setNext(baru);
            lastNode = baru;
        }
        size++;
    }

    public ListNode removeFirst() {// menghapus yang di depan
        ListNode bantu = null; // ketika data tidak ada maka null
        if (!isEmpty()) { // jika kosong kembalikan null
            bantu = firstNode;  // jika ada isi perinta ini yang di jalankan
            firstNode = firstNode.getNext();
            size--;

        }
        return bantu;
    }

    public ListNode removeLast() { // menghpus yang di belakang
        ListNode bantu = null; // ketika data tidak ada maka null
        if (!isEmpty()) { // di cek kosong atau tdk
            if (firstNode == lastNode) { // untuk mengecek diapa yang di hapus
                bantu = firstNode;
                firstNode = lastNode = null; // data menunjukkan ke null

            } else {
                bantu = firstNode;
                while (bantu.getNext() != lastNode) { 
                    bantu = bantu.getNext(); // geser bantu 1x ke kanan

                }
                lastNode = bantu; // akhir di sama dng bantu
                bantu = bantu.getNext(); // untuk membantu siapa yang kita hapus
                lastNode.setNext(null);
            }
            size--;
        }
        return bantu;

    }

    public boolean isEmpty() { // cek list kosong atau tidak
        if (firstNode != null && lastNode != null) { // jika pertama tidak sama dengan 0
            return false;

        }
        return true;
    }

    @Override
    public String toString() { // untuk mencetak elem yang ada di list
        String isi = " ";  // untuk mengetahui isinya
        ListNode pointer = firstNode;  // untuk munduru 1 langka
        while (pointer != null) { // untuk mengecek tidak sama dengan null
            isi += pointer.getData() + " ";
            pointer = pointer.getNext();
            // akan di lakukan hingga selesai
        }
        return isi;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

   
    }

