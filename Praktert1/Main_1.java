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
public class Main_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, byk, n[];
        System.out.println("Masukan banyak nilai: ");
        byk = input.nextInt();
        n = new int[byk];
        for (x = 0; x < n.length; x++) {
            System.out.println("Nilai ke " + x + " : ");
            n[x] = input.nextInt();

        }

        Larik.setNilai(n);
        Larik.Cetak();

    }
}
