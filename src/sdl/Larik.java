/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl;

import java.util.Arrays;

/**
 *
 * @author SandraPc
 */
public class Larik {

    static int[] nilai;
    private static int length;

    public static void setNilai(int[] nilai) {
        Larik.nilai = nilai;

    }

    public static int[] getNilai() {
        return nilai;

    }

    static void Cetak() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);

        }

    }

    public static int SequentialSearch(int[] Larik, int kunci) {
        for (int counter = 0; counter <= Larik.length - 1; counter++) {
            if (kunci == Larik[counter]) {
                return counter;

            }
        }
        return -1;
    }

    public static int binarysearch(int Larik[], int key) {

        int idxawal = 0, idxakhir = Larik.length + 1;

        // for (idxawal = 0; idxawal < Larik.length; idxawal++) {

        while (idxawal <= idxakhir) {
            int idxtengah = (idxawal + idxakhir) / 2;
            if (Larik[idxtengah] == key) {
                return idxtengah;


            } else if (key < Larik[idxtengah]) {
                idxakhir = idxtengah - 1;

            } else if (key > Larik[idxtengah]) {
                idxawal = idxtengah + 1;

            }
        }

        //}
        return - 1;
    }

    public static int binarysearchObjeck(Object[] object, Object key) {
        Mahasiswa[] Data = (Mahasiswa[]) object;
        Arrays.sort(Data);

        int idxawal = 0, idxakhir = Data.length - 1;
        int idxtengah;
        // for (idxawal = 0; idxawal < Larik.length; idxawal++) {

        while (idxawal <= idxakhir) {

            idxtengah = (idxawal + idxakhir) / 2;
            if (((Comparable) Data[idxtengah]).compareTo(key) == 0) {
                return idxtengah;

            } else if (((Comparable) Data[idxtengah]).compareTo(key) == 1) {
                idxakhir = idxtengah - 1;

            } else if (((Comparable) Data[idxtengah]).compareTo(key) == -1) {
                idxawal = idxtengah + 1;
            }

            //    }

        }
        return -1;
    }

    public static Mahasiswa[] bubbleSortObject(Object[] data1) {
        Mahasiswa[] data_1 = (Mahasiswa[]) data1;


        for (int i = 1; i <= data_1.length - 1; i++) {
            for (int j = 0; j <= data_1.length - 1 - i; j++) { 
                if (((Comparable) data_1[j]).compareTo(data_1[j + 1]) == 1) {
                    Mahasiswa temp = data_1[j];  // menyimpan data yang di tampung
                    data_1[j] = data_1[j + 1];           //  data yang di tampung di ganri dengan data[j+1]
                    data_1[j + 1] = temp;
                }
            }
        }
        return data_1;
    }

    public static Mahasiswa[] SelectionSortObject(Object[] object) {
        
        Mahasiswa[] data = (Mahasiswa[]) object;
        
        for (int i = 0; i <= data.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= data.length - 1; j++) {
                if ((((Comparable) data[j]).compareTo(data[minIndex])) == -1) {
                    minIndex =  j;
                }
            }
            Mahasiswa temp = data[minIndex];  // menyimpan data yang di tampung
            data[minIndex] = data[i];     //  data yang di tampung di ganti dengan data[j+1]
            data[i] = temp;

        }
        return data;

    }
    public static Mahasiswa[] InsertionSort(Object[] object) {
        
        Mahasiswa[] data1 = (Mahasiswa[]) object;
        
        for (int i = 1; i <= data1.length-1; i++) {   
            for (int test = i; test > 0; test--) {
                
                if (((Comparable) data1[test]).compareTo(data1[test - 1]) == 1) {
                 
                    Mahasiswa tampung = data1[test];
                    data1[test] = data1[test - 1];
                    data1[test - 1] = tampung;
                }
            }
        }

        return data1;
    }
}
//    public static int interpolationSearchObjeck(Object[] Larik, Object key){
//        int idxawal = 0;
//        int idxakhir = Larik.length-1;
//        int idxtengah;
//        
//        while (Larik[idxawal] <= key && Larik[idxakhir] >= key ){
//            idxtengah = idxawal + ((key - Larik[idxawal]) * (idxakhir - idxawal))/
//            (Larik[idxakhir]-Larik[idxawal]);
//            
//            if (Larik[idxtengah] < key) {
//                idxawal = idxtengah + 1;
//                
//            } else if (Larik[idxtengah] > key){
//                
//                    idxakhir = idxtengah - 1;
//                
//            } else{ 
//                    return idxtengah;
//                        
//        
//    } 
//        }
//    return -1;
//}

