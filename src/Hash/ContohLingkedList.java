/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

import java.util.Iterator;
import java.util.LinkedList;





/**
 *
 * @author basisc13
 */
public class ContohLingkedList {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addFirst("111");
        a.addLast("234");
        
        //a.removeFirst()
        
        System.out.println(a.toString());
        Iterator data = a.iterator();
        while(data.hasNext()){
            System.out.println(data.next());
        }
    }
}
