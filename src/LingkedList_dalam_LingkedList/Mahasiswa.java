/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LingkedList_dalam_LingkedList;

import LingkedList.LingkedList;
import java.util.LinkedList;

/**
 *
 * @author basisc13
 */
public class Mahasiswa {
    private int nim;
    private String nama;
    private LinkedList nilai;

    public Mahasiswa() {
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public LinkedList getNilai() {
        return nilai;
    }
    public void setNilai(LinkedList nilai) {
        this.nilai = nilai;
    }
    public int getNim() {
        return nim;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }

}
