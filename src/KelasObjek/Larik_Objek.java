/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasObjek;

/**
 *
 * @author basisc12
 */
public class Larik_Objek implements Comparable {
    public static int binarysearch(int Larik[], int key ){

        int idxawal = 0, idxakhir = Larik.length+1;
        
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

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

