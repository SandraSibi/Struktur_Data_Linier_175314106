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
public class SequentialSearch {
    public static int SequentialSearch(int[] Larik, int kunci) {
        int[] data={12,34,24,22,28,100,56,84,57,49,71};
        kunci = 100;
        for (int counter = 0; counter < data.length-1; counter++) {
            if (kunci == Larik[counter]) {
                return counter;
                
            }
        }
        return-1;
    }
}
