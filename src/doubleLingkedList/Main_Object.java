/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleLingkedList;

/**
 *
 * @author basisc12
 */
public class Main_Object {

    public static void main(String[] args) {
        LingkedList_Object Data = new LingkedList_Object();

        Mahasiswa mhs1 = new Mahasiswa("Lisa", 17523481);
        Mahasiswa mhs2 = new Mahasiswa("Ema", 175314291);
        Mahasiswa mhs3 = new Mahasiswa("Rina", 175314280);
        Mahasiswa mhs4 = new Mahasiswa("Alan", 175314120);
        Mahasiswa mhs5 = new Mahasiswa("Bagas", 1753106);
        Mahasiswa mhs6 = new Mahasiswa("Ryanto", 175314110);

        System.out.println("Tambah di depan");
        Data.addFirst(mhs1.getNama());
        Data.addFirst(mhs2.getNama());
        Data.addFirst(mhs3.getNama());
        System.out.println(Data.toString());
        System.out.println("Size : " + Data.getSize());
        System.out.println(" ");

        System.out.println("Tambah di akhir");
        Data.addLast(mhs4.getNama());
        Data.addLast(mhs5.getNama());
        Data.addLast(mhs6.getNama());
        System.out.println(Data.toString());
        System.out.println("Size : " + Data.getSize());
        System.out.println(" ");

        System.out.println("data Search");
        if (Data.Search(mhs1.getNama()) != null) {
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
        Data.removeMid(mhs1.getNama());
        System.out.println(Data.toString());
        System.out.println("size : " + Data.getSize());
        System.out.println("");

    }
}
