/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLaporan;

/**
 *
 * @author SandraPc
 */
public class Larik {

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

    public static Object[] QuickSortObject(Object[] x, int indexAwal, int indexAkhir) {

        Object[] data1 = (Object[]) x;

        if (indexAwal < indexAkhir) {

            int i = indexAwal;
            int j = indexAkhir;

            while (i < indexAkhir && (((Comparable) data1[i]).compareTo(data1[indexAwal]) == -1)) {
                i++;
            }
            while (j > indexAwal && (((Comparable) data1[j]).compareTo(data1[indexAwal]) == 1)) {
                j--;
            }

            if (i < j) {
                Object temp = data1[i];
                data1[i] = data1[j];
                data1[j] = temp;

                while (i < indexAkhir && (((Comparable) data1[i]).compareTo(data1[indexAwal]) == -1)) {
                    i++;
                }

                while (j > indexAwal && (((Comparable) data1[j]).compareTo(data1[indexAwal]) == 1)) {
                    j--;
                }
            }

            Object tampung = data1[indexAwal];
            data1[indexAwal] = data1[j];
            data1[j] = tampung;

            QuickSortObject(data1, indexAwal, j - 1);
            QuickSortObject(data1, j + 1, indexAkhir);

        }
        return data1;
    }

}
