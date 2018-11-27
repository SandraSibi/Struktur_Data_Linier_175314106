/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import sdl.*;

/**
 *
 * @author SandraPc
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
    public int compareTo(Object o) {

        Mahasiswa key = (Mahasiswa) o;

        if (this.nim == key.getNim()) {
            return 0;
        } else if (this.nim > key.getNim()) {
            return 1;
        } else {
            return -1;
            // if(this.nama.compareTo(key.getNama()) == 0){
            //     return 0;
            // }else if (this.nama.compareTo(key.getNama()) > 0){
            //     return 1;
            //  }else {
            //        return -1;
            //  }

        }
    }
}
