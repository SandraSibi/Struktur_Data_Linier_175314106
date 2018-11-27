/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_2;

/**
 *
 * @author basisc12
 */
public class Recursion1V2 {
  public static void main(String[] args) {
        count(0);
        System.out.println();
    }
  
    public static void count(int index) {
        if(index < 2)
        {
            count(index+1);
    }
 System.out.println(index);
}
}
