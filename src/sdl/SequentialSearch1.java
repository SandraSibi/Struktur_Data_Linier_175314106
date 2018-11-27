/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl;

import Laporan.*;

/**
 *
 * @author SandraPc
 */
public class SequentialSearch1 {
    public static int SeqSearch(int[] Larik, int kunci) {
        for (int i = 0; i < Larik.length; i++) {
            if (kunci == Larik[i]){
                return i;
            }
            
        }
        return - 1;
        
    }
}
