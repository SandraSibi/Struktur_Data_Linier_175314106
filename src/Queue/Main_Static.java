/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author SandraPc
 */
public class Main_Static {

    public static void main(String[] args) {
        Queue_Static queue = new Queue_Static(6);
        System.out.println(" ENQUEUE");
        queue.enqueue(23);
        queue.enqueue(28);
        queue.enqueue(12);
       
        System.out.println(queue.toString());
        System.out.println("size : " + queue.getSize());
        System.out.println(" ");
        
        System.out.println(" DEQUEUE");
        queue.dequeue();
        queue.dequeue();
       
        System.out.println(queue.toString());
        System.out.println("size : " + queue.getSize());
        System.out.println(" ");
        

    }
}
