/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_2;

/**
 *
 * @author basisc12
 */
public class Recursion1V0 {
    public static void main(String[] args) {
        count(0);
        System.out.println();
    }
    public static void count(int index) {
        System.out.println(index);
        if(index < 2)
            count(index+1);
    }
}
