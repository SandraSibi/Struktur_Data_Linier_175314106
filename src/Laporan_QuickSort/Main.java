/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan_QuickSort;

import static Laporan_QuickSort.Test.quickSortInDescendingOrder;

/**
 *
 * @author SandraPc
 */
public class Main {
    public static void main(String[] args) {
        
    
        int numbers[] = {23,5,20,2,0};
 
        //Displaying the numbers before sorting
        System.out.print("Before sorting, numbers are ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
 
        //Sorting in descending order using quick sort
        quickSortInDescendingOrder(numbers,0,numbers.length-1);
 
        //Displaying the numbers after sorting
        System.out.print("Before sorting, numbers are ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]+" ");
        }
    }
    }

