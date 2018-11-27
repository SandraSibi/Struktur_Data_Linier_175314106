/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SandraPc
 */
public class Main_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, kunci, n[], data[]={12,34,24,22,28,100,56,84,57,49,71};
        System.out.println("Masukan kunci yang di cari:");
        kunci = input.nextInt();
        n = new int[kunci];
        Arrays.sort(data);

        Larik.setNilai(data);
        System.out.println("");
        System.out.println("sifat nilai :");
        if (Larik.SequentialSearch(data, kunci)==-1) {
            System.out.println("nilai tidak ditemukan");
        }else{
           System.out.println("nilai ditemukan");
            System.out.println("nilai ditemukan pada indek ke :");
            System.out.println(Larik.SequentialSearch(data, kunci));
        }
    }
}
