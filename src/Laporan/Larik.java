/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan;

/**
 *
 * @author SandraPc
 */
public class Larik {
    
     public static int SequentialSearch(int[] data, int key) {
        for (int counter = 0; counter <= data.length-1; counter++) {
            if (key == data[counter]) {
                return counter;
                
            }
        }
        return-1;
    }
    
    public static int binarysearch(int Larik[], int key ){

        int idxawal = 0, idxakhir = Larik.length-1;
        
        for (idxawal  = 0;  idxawal < Larik.length ; idxawal++) {
            
            while(idxawal <= idxakhir){
                int idxtengah = (idxawal +  idxakhir)/2;
                if (Larik[idxtengah] == key) {
                    return idxtengah;
                    
                    
                }else if (key < Larik[idxtengah]){
                    idxakhir= idxtengah - 1;
                    
                }else if ( key > Larik[idxtengah]){
                    idxawal = idxtengah + 1;
                    
                }
            }
            
        }
        return - 1;
    }
    
    public static int interpolationSearch(int Larik [], int key){
        int idxawal = 0;
        int idxakhir = Larik.length-1;
        int idxtengah;
        
        while (Larik[idxawal] <= key && Larik[idxakhir] >= key ){
            idxtengah = idxawal + ((key - Larik[idxawal]) * (idxakhir - idxawal))/
            (Larik[idxakhir]-Larik[idxawal]);
            
            if (Larik[idxtengah] < key) {
                idxawal = idxtengah + 1;
                
            } else if (Larik[idxtengah] > key){
                
                    idxakhir = idxtengah - 1;
                
            } else{ 
                    return idxtengah;
                        
        
    } 
        }
    return -1;
}
}


