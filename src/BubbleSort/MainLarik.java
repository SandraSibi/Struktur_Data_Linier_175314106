/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;

import java.util.Arrays;

/**
 *
 * @author basisc12
 */
public class MainLarik {
    public static void main(String[] args) {
        int[] data = {28, 100, 5, 2};
        
        System.out.print("DATA SEBELUM DI URUTKAN :");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" "+data[i]);
        }
        System.out.println("");
        System.out.print("DATA Setelah DI URUTKAN DARI YANG TERKECIL :");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" "+Larik.bubbleSort(data)[i]);  // (data)[i] data yang di panggil setelah di urutkan, 
        }
        System.out.println("");
        
        System.out.println("");
        System.out.print("DATA Setelah DI URUTKAN DARI YANG TERBESAR:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" "+Larik.bubbleSort(data)[i]);//(data)[i] data yang di panggil setelah di urutkan, 
        }
        System.out.println("");
    }  
}

