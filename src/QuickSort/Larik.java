/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;


import com.sun.org.apache.bcel.internal.generic.RETURN;
import javax.xml.crypto.Data;

/**
 *
 * @author basisc12
 */
public class Larik {

    // private static int N;
//    
    public static int[] Quick_sort(int[] x, int indexAwal, int indexAkhir) {
//   
        if (indexAwal < indexAkhir) {

            int i = indexAwal;
            int j = indexAkhir;
            while (i < indexAkhir && x[i] < x[indexAwal]) {
                i++;
            }
            while (j > indexAwal && x[j] > x[indexAwal]) {
                j--;

                if (i < j) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;

                    while (i < indexAkhir && x[i] < x[indexAwal]) {
                        i++;
                    }
                    while (j > indexAwal && x[j] > x[indexAwal]) {
                        j--;
                    }
                }
                int tampung = x[indexAwal];
                x[indexAwal] = x[j];
                x[j] = tampung;

                Quick_sort(x, indexAwal, j - 1);
                Quick_sort(x, j + 1, indexAkhir);

            }

        }

        return x;
    }
  //  public static Data[] QuickSortObject(Object[] object){
    //    int indexAwal, indexAkhir;
      //  Data[] data1 = (Object[]) object;
        // int i = 0 ;
         //int j =0;
          //if (((Comparable)data1[i]).compareTo(data1[j]) == -1 ) {

           
      //      while (i < indexAkhir && x[i] < x[indexAwal]) {
        //        i++;
          //  }
            //while (j > indexAwal && x[j] > x[indexAwal]) {
              //  j--;

               // if (i < j) {
                 //   Data temp = data1[i];
                   // data1[i] = data1[j];
                    //data1[j] = temp;

                    //while (i < indexAkhir && data1[i] < data1[indexAwal]) {
                      //  i++;
                    //}
                    //while (j > indexAwal && x[j] > x[indexAwal]) {
                      //  j--;
                    //}
               // }
                //Data tampung = data1[indexAwal];
                //data1[indexAwal] = data1[j];
                //data1[j] = tampung;

                //QuickSortObject(object);
              //  QuickSortObject(data1, indexAwal, j - 1);
              //  Quick_sort(x, j + 1, indexAkhir);

            //}

        }

    //    return data1;
            
    

