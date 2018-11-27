/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl;

/**
 *
 * @author SandraPc
 */
public class Larik_1 {
    public static int SequentialSearch(Object[] object, Object key) {
        Mahasiswa[] data = (Mahasiswa[]) object;
        for (int i = 0; i < data.length-1; i++) {
            //if (data[i] == key) { 
            if (((Comparable) data[i]).compareTo(key) == 0) { 
                return i;
            }  
        }
        return -1;
    }
  
}


