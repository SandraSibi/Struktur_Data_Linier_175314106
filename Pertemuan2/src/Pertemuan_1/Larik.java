/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1;

/**
 *
 * @author basisc12
 */
public class Larik {
   
    static int [] nilai;
    
    public static void setNilai(int [] nilai){
      Larik.nilai=nilai;
      
    } 
    public static int[] getNilai(){
        return nilai;
        
    }
   static void Cetak(){
       for (int i = 0; i < nilai.length; i++) {
           System.out.println(nilai[i]);
           
       }
        
    }
    public static int SequentialSearch(int[] Larik, int kunci) {  
        for (int counter = 0; counter < nilai.length-1; counter++) {
            if (kunci == Larik[counter]) {
                return counter;
                
            }
        }
        return-1;
    }
 
}
    
   



