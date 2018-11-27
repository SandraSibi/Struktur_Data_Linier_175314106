/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author SandraPc
 */
public class LarikMain {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    int data[] = {12,34,24,22,28,100,56,84,57,49,71};
    int key ;
    
   System.out.println("Masukan kunci yang di cari:");
        key = input.nextInt();
   
    Arrays.sort(data);
        for (int x : data) {
            System.out.print(x+ " "); 
            
        }System.out.println(" \n ");
    
        System.out.println("Sequential Search");
        System.out.println("data " +key+ " berada di index ke = " +Larik.SequentialSearch(data, key));
        System.out.println("");
        
    
        System.out.println(" Binary Seacrh");
        System.out.println("data " + key+ " berada di index ke = " + (Larik.binarysearch(data, key)));
        
        System.out.println("");
        
        System.out.println("Interpolasi Search");
        System.out.println("data " + key + " berada di index ke = " + (Larik.interpolationSearch(data, key)));
        
    }
}