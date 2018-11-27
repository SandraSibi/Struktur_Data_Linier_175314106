/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1;

/**
 *
 * @author basisc12
 */
public class Mahasiswa implements Comparable {

    private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public int compareTo(Object o) { // untuk membagikan nim 1 dengan nim yang lain lebih dari atau kurang dari
        Mahasiswa key = (Mahasiswa) o;

        if (this.nim == key.getNim()) {
            return 0;

        } else if (this.nim > key.getNim()) {

            return 1;
        } else {
            return -1;
        }

    }
}
