/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;

/**
 *
 * @author basisc12
 */
public class Larik {
    public static int[] bubbleSort(int[] data) {
        for (int i = 1; i <= data.length-1; i++) {
            for (int j = 0; j <= data.length - 1 - i ; j++) {  // -i karena kalau data sudah di urut tidak di kerjakan lagi
                if (data[j] > data[j + 1]) {
                    int temp = data[j];  // menyimpan data yang di tampung
                    data[j] = data[j+1]; //  data yang di tampung di ganri dengan data[j+1]
                    data[j+1] = temp;
                    
                }
 
            }
            
        }
        
    
    return data;
}

    
}
