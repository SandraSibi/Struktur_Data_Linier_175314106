/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Selection;

/**
 *
 * @author basisc12
 */
public class Larik {

    public static int[] SelectionSort(int[] data) {
        for (int i = 1; i <= data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= data.length - 1; j++) {  // -i karena kalau data sudah di urut tidak di kerjakan lagi
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[i];  // menyimpan data yang di tampung
            data[i] = data[minIndex]; //  data yang di tampung di ganti dengan data[j+1]
            data[minIndex] = temp;

        }
        return data;
    }
   
}
