/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan_QuickSort;

/**
 *
 * @author SandraPc
 */
public class Test {
     public static void quickSortInDescendingOrder (int[] numbers, int low, int high)
    {
 
        int i=low;
        int j=high;
        int temp;
        int middle=numbers[(low+high)/2];
 
        while (i<j)
        {
            while (numbers[i]>middle)
            {
                i++;
            }
            while (numbers[j]<middle)
            {
                j--;
            }
            if (j>=i)
            {
                temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
                i++;
                j--;
            }
        }
 
 
        if (low<j)
        {
            quickSortInDescendingOrder(numbers, low, j);
        }
        if (i<high)
        {
            quickSortInDescendingOrder(numbers, i, high);
        }
    }
}
