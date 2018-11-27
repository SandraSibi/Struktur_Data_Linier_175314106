/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

import com.sun.org.apache.xerces.internal.impl.xs.util.XInt;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author basisc12
 */
public class Main {
    public static void main(String[] args) {
 
    int data[] = {12,34,24,22,28,100};
    int N = 6;
    int awal= 0 , akhir= data.length-1 ;
   
              System.out.print("Data yang belum diurutkan = ");
              System.out.println("");
              for (int i = 0; i < data.length-1; i++) {
            System.out.print(data[i] + " ");
        }
              
        System.out.println(" ");
        System.out.print("Data yang sudah diurutkan = ");

        
         System.out.println("");
        for (int i = data.length-1; i >-1; i--) {
            
            System.out.print(Larik.Quick_sort(data, awal, akhir)[i]+ " ");
            System.out.print(" ");
            
            
        }
        
    }
}

