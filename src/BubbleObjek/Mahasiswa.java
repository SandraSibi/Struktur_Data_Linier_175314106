/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleObjek;

import java.util.Arrays;

/**
 *
 * @author basisc12
 */
public class Mahasiswa {
     public static Mahasiswa[] bubbleSortObject (Object[] data1) {
        Mahasiswa[] data_1 = (Mahasiswa[]) data1;
        Arrays.sort(data_1);
        
        for (int i = 1; i <= data_1.length-1; i++) {
            for (int j = 0; j <= data_1.length - 1 - i ; j++) {  // -i karena kalau data sudah di urut tidak di kerjakan lagi
                if ((Comparable) data_1[j] == data_1[j + 1]) {
                    Object temp = data_1[j];  // menyimpan data yang di tampung
                    data_1[j] = data_1[j+1]; //  data yang di tampung di ganri dengan data[j+1]
                    data_1[j+1] = (Mahasiswa) temp;
        
    }
              
}
        
           
        }
        return data_1;
    }

   
}
