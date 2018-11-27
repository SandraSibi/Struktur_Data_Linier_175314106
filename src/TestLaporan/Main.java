/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLaporan;


import java.util.Scanner;

/**
 *
 * @author basisc12
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Quick Sort Sederhana ");
        int data[] = {12, 34, 24, 22, 28, 100};
        int N = 6;
        int awal = 0, akhir = data.length - 1;

        System.out.print("Data yang belum diurutkan = ");
        System.out.println("");
        for (int i = 0; i < data.length - 1; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Data yang sudah diurutkan = ");

        System.out.println("");
        for (int i = data.length - 1; i > -1; i--) {

            System.out.print(Larik.Quick_sort(data, awal, akhir)[i] + " ");
            System.out.print(" ");

        }
        System.out.println(" ");
        Mahasiswa[] data1 = {new Mahasiswa("Lisa", 175314001),
            new Mahasiswa("Ema", 175314291),
            new Mahasiswa("Rina", 175314280),
            new Mahasiswa("Alan", 175314028)};
        System.out.println("");
        akhir = data1.length - 1;

        Mahasiswa[] cari = (Mahasiswa[]) Larik.QuickSortObject(data1, awal, akhir);
        System.out.println("Sorting Object");
        for (int i = 0; i < data1.length; i++) {
            System.out.println(cari[i].getNim() + " ");

        }

    }

}
