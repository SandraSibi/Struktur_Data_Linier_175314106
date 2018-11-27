/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh_Queue;

import java.util.Enumeration;
import sun.misc.Queue;

/**
 *
 * @author basisc13
 */
public class ContohQueue {
    public static void main(String[] args) throws InterruptedException {
        Queue a = new Queue();
        a.enqueue(123);
        a.enqueue(345);
        a.dequeue();
        Enumeration name = a.elements();
        while(name.hasMoreElements()){
            System.out.println(name.nextElement());
        }
    }
}
