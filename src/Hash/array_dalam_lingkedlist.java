/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;


import java.util.LinkedList;



/**
 *
 * @author basisc13
 */
public class array_dalam_lingkedlist {

    public static void main(String[] args) {
        LinkedList[] daftarNilai = new LinkedList[5];
        
        LinkedList edo = new LinkedList();
        edo.addFirst(80);
        edo.addLast(90);
        edo.addLast(70);
        
        daftarNilai[0] = edo;
        
        LinkedList dea = new LinkedList();
        dea.addFirst(100);
        dea.addLast(60);
        daftarNilai[1] = dea;
        System.out.println();



    }
}
