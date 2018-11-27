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
public class Main_Object {

    public static void main(String[] args) {
        LingkedList_Object Data = new LingkedList_Object();

        System.out.println("Tambah di depan");
        Data.addFirst("Sandra");
        Data.addFirst("Okta");
        Data.addFirst("Jesika");
        System.out.println(Data.toString());
        System.out.println("Size : " + Data.getSize());
        System.out.println(" ");

        System.out.println("Tambah di akhir");
        Data.addLast(20);
        Data.addLast(10);
        Data.addLast(90);
        System.out.println(Data.toString());
        System.out.println("Size : " + Data.getSize());
        System.out.println(" ");

        System.out.println("data Search");
        if (Data.Search("Okta") != null) {
            System.out.println(" data ditemukan");
        } else {
            System.out.println(" data tidak ditemukan");
        }
        System.out.println(" ");

        System.out.println("Hapus awal");
        Data.removeFirst();
        System.out.println(Data.toString());
        System.out.println("size : " + Data.getSize());
        System.out.println(" ");

        System.out.println("Hapus akhir");
        Data.removeLast();
        System.out.println(Data.toString());
        System.out.println("size : " + Data.getSize());
        System.out.println(" ");

        System.out.println("Remove");
        Data.removeMid("Sandra");
        System.out.println(Data.toString());
        System.out.println("");

        Mahasiswa mhs1;
        mhs1 = new Mahasiswa("Lisa", 17523481);
       
        Data.addLast(mhs1);
        System.out.println(Data.toString());
        System.out.println(mhs1.getNama() + " \n" + mhs1.getNim());
          System.out.println(" ");
        
        //System.out.println("size : " + Data.getSize());
        System.out.println(" ");

    }

}
