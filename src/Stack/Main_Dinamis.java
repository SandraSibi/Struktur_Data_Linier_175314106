/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Lenovo
 */
public class Main_Dinamis {

    public static void main(String[] args) {
        Static_Object_Dinamis std = new Static_Object_Dinamis();
        Mahasiswa mhs1 = new Mahasiswa("AYU", 271849);
        Mahasiswa mhs2 = new Mahasiswa("KASIH", 273819);
        Mahasiswa mhs3 = new Mahasiswa("ANITA", 234510);
        Mahasiswa mhs4 = new Mahasiswa("PUTRI", 384028);
        Mahasiswa mhs5 = new Mahasiswa("BAGAS", 568939);
        Mahasiswa mhs6 = new Mahasiswa("RINA", 902617);

        System.out.println(" PUSH ");
        std.push(mhs1.getNama());
        std.push(mhs2.getNama());
        std.push(mhs3.getNama());
        std.push(mhs4.getNama());
        std.push(mhs5.getNama());
        std.push(mhs6.getNama());
        System.out.println(std.toString());
        System.out.println("size : " + std.getsize());

        System.out.println("");

        System.out.println(" POP ");
        std.pop();
        std.pop();
        System.out.println(std.toString());
        System.out.println("size : " + std.getsize());

    }
}
