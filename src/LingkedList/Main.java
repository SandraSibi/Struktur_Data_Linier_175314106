/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LingkedList;

/**
 *
 * @author basisc12
 */
public class Main {

    public static void main(String[] args) {
        LingkedList daftar = new LingkedList();

        System.out.println("Tambah di depan");
        daftar.addFirst(28);
        daftar.addFirst(12);
        daftar.addFirst(15);
        System.out.println(daftar.toString());
        System.out.println("Size : " + daftar.getSize());
        System.out.println(" ");

        System.out.println("Tambah di akhir");
        daftar.addLast(19);
        daftar.addLast(90);
        daftar.addLast(23);
        System.out.println(daftar.toString());
        System.out.println("Size : " + daftar.getSize());
        System.out.println(" ");

        System.out.println("Hapus di depan");
        daftar.removeFirst();
        System.out.println(daftar.toString());
        System.out.println("Size : " + daftar.getSize());
        System.out.println(" ");

        System.out.println("Hapus di akhir");
        daftar.removeLast();
        System.out.println(daftar.toString());
        System.out.println("Size : " + daftar.getSize());

        //case 1
        LingkedList l = new LingkedList();
        l.removeLast();
        System.out.println(l.toString());
        System.out.println("size : " + l.getSize());

        // case 2
        LingkedList ll = new LingkedList();
        ll.addFirst(33);
        ll.removeLast();
        System.out.println(ll.toString());
        System.out.println("size : " + ll.getSize());
        System.out.println("");

        //case 3
        LingkedList lll = new LingkedList();
        lll.addFirst(33);
        lll.addFirst(34);
        lll.addFirst(55);
        lll.addFirst(1);
        lll.removeLast();
        System.out.println(lll.toString());
        System.out.println("size : " + lll.getSize());

    }
}
