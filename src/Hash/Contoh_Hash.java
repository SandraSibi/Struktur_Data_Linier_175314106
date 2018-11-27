/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author basisc13
 */
public class Contoh_Hash {
    public static void main(String[] args) {
        int[] a = {20,12,1,3,4};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+ " ");
            
        }
        System.out.println("");
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(4);
        b.add(2);
        b.add(8);
        Collections.sort(b);
        System.out.println(b);
        System.out.println(Collections.max(b));
        System.out.println(Collections.min(b));
        
    }
}
