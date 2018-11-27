/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktert1;

import java.util.Scanner;

/**
 *
 * @author basisc12
 */
public class Main_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim[], nama[];
        int jumlah;
        
        System.out.println("Jumlah Mahasiswa: ");
        jumlah = input.nextInt();
        nama = new String[jumlah];
        nim = new String[jumlah];
        for (int i = 0; i < nama.length; i++) {
            System.out.println("nama mahasiswa");
            nama[i] = input.next();
            System.out.println("masukan NIM :");
            nim[i] = input.next();

        }
        Mahasiswa.setNama(nama);
        Mahasiswa.setNim(nim);
        Mahasiswa.Cetak();
        
    }
}
