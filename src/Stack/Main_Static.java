/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author basisc12
 */
public class Main_Static {

    public static void main(String[] args) {
        Stack_Array_Static sts = new Stack_Array_Static(5);

        System.out.println(" PUSH");
        sts.push(23);
        sts.push(28);
        sts.push(12);
        sts.push(15);
        sts.push(13);

        System.out.println(sts.toString());
        System.out.println("size : " + sts.getSize());
        System.out.println(" ");
        System.out.println(" POP ");
        sts.pop();
        sts.pop();
        System.out.println(sts.toString());
        System.out.println("size : " + sts.getSize());
    }
}
