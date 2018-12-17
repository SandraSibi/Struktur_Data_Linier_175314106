/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleLingkedList;

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
        //daftar.addLast(90);
        //daftar.addLast(23);
        System.out.println(daftar.toString());
        System.out.println("Size : " + daftar.getSize());
        System.out.println(" ");

        System.out.println("data Search");
        System.out.println(daftar.Search(28));
        System.out.println(" ");

        System.out.println("Hapus awal");
        daftar.removeFirst();
        System.out.println(daftar.toString());
        System.out.println("size : " + daftar.getSize());
        System.out.println(" ");

        System.out.println("Hapus akhir");
        daftar.removeLast();
        System.out.println(daftar.toString());
        System.out.println("size : " + daftar.getSize());
        System.out.println(" ");

        System.out.println("Remove");
        daftar.removeMid(28);
        System.out.println(daftar.toString());
        System.out.println("");

    }
}
