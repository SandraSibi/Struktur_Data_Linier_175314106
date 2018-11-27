/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Selection;

/**
 *
 * @author basisc12
 */
public class Main_Larik {
    public static void main(String[] args) {
        int[] data = {1, 100, 2};
        
        System.out.print("DATA SEBELUM DI URUTKAN :");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" "+data[i]);
        }
        System.out.println("");
        System.out.print("DATA Setelah DI URUTKAN :");
        for (int i = 0; i < data.length; i++) {
          
            System.out.print(" "+Larik.SelectionSort(data)[i]);  // (data)[i] data yang di panggil setelah di urutkan, 
        }
        System.out.println("");
    }  
}
