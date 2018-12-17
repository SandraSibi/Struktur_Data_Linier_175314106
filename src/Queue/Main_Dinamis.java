/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author basisc12
 */
public class Main_Dinamis {
    public static void main(String[] args) {
        Queue_Dinamis_object queue = new Queue_Dinamis_object();
        Mahasiswa mhs1 = new Mahasiswa("AYU", 271849);
        Mahasiswa mhs2 = new Mahasiswa("KASIH", 273819);
        Mahasiswa mhs3 = new Mahasiswa("ANITA", 234510);
        Mahasiswa mhs4 = new Mahasiswa("PUTRI", 384028);
        Mahasiswa mhs5 = new Mahasiswa("BAGAS", 568939);
        Mahasiswa mhs6 = new Mahasiswa("RINA", 902617);

        System.out.println("  ");
        queue.enqueue(mhs1.getNama());
        queue.enqueue(mhs2.getNama());
        queue.enqueue(mhs3.getNama());
        queue.enqueue(mhs4.getNama());
        queue.enqueue(mhs5.getNama());
        queue.enqueue(mhs6.getNama());
        System.out.println(queue.toString());
        System.out.println(" size : " + queue.Size());
        
        System.out.println(" ");
        
        System.out.println(" POP ");
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.toString());
        System.out.println(" size " + queue.Size());
    }
}
