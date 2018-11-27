/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl;

/**
 *
 * @author Personal
 */
public class MainSequential {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Data = {21, 4, 94, 14, 1, 9, 2};
        int key = 9;
        int i = 0; //index bertipe data integer bernilai 0.
        boolean temukan = false; // variabel temukan bertipe data boolen yang bernilai false.

        for (i = 0; i < Data.length; i++) {
            if (key == Data[i]) {
                temukan = true;
                break;
            }
        }
        if (temukan) {
            System.out.println("Data : " + i);
            System.out.println("Ada");
        } else {
            System.out.println("Tidak Ada");
        }

    }

}
