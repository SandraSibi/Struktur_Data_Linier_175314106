/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LingkedList_dalam_LingkedList;

import LingkedList.LingkedList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author basisc13
 */
public class Main {
    // untuk menyimpan data mahasiswa

    public static void main(String[] args) {
        LinkedList daftarMahasiswa = new LinkedList();

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim(175314099);
        mhs1.setNama("Rosa");
        LinkedList nilaiMhs1 = new LinkedList();
        nilaiMhs1.addLast(90);
        nilaiMhs1.addLast(70);
        nilaiMhs1.addLast(100);
        mhs1.setNilai(nilaiMhs1);
        daftarMahasiswa.addLast(mhs1);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim(175314055);
        mhs2.setNama("Damai");
        LinkedList nilaiMhs2 = new LinkedList();
        nilaiMhs2.addLast(80);
        nilaiMhs2.addLast(99);
        nilaiMhs2.addLast(100);
        mhs2.setNilai(nilaiMhs2);
        daftarMahasiswa.addLast(mhs2);

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim(175314110);
        mhs3.setNama("Gagas");
        LingkedList nilaiMhs3 = new LingkedList();
        nilaiMhs3.addLast(60);
        nilaiMhs3.addLast(70);
        nilaiMhs3.addLast(40);
        mhs3.setNilai(nilaiMhs2);
        daftarMahasiswa.addLast(mhs3);
        Iterator data = daftarMahasiswa.iterator();
        while (data.hasNext()) {
            Mahasiswa print = (Mahasiswa) data.next();
            System.out.println(print.getNim());
            System.out.println(print.getNama());
            System.out.println(print.getNilai().toString());
        }
    }
}
