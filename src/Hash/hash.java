/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

import java.util.Hashtable;


/**
 *
 * @author basisc13
 */
public class hash {
    public static void main(String[] args) {
        Hashtable nilai = new Hashtable();
        nilai.put(1852621, "Struktur Data Linier");
        nilai.put(1854688, "Algoritma dan Pemrograman");
        System.out.println(nilai.get(1852621));
        System.out.println(nilai.get(1854688));
        
    }
}
