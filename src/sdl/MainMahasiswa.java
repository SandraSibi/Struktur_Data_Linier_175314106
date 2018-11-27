/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl;

/**
 *
 * @author SandraPc
 */
public class MainMahasiswa {

    public static void main(String[] args) {
        System.out.println("     METHOD SORTING");
        System.out.println(" ");

        Mahasiswa[] data = {new Mahasiswa("Lisa", 175314001),
            new Mahasiswa("Ema", 175314291),
            new Mahasiswa("Rina", 175314280),
            new Mahasiswa("Alan", 175314028)};

        System.out.println("BUBBLE SHORT (ASCENDING)");
        System.out.println(" ");
        System.out.print("Data yang belum diurutkan = ");
        System.out.println(" ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(" " + data[i].getNama() + "\t" + data[i].getNim());
        }
        System.out.println(" ");
        System.out.print("Data yang sudah diurutkan = ");
        System.out.println(" ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(" " + Larik.bubbleSortObject(data)[i].getNama() + "\t" + data[i].getNim());
        }

        System.out.println(" ");
        System.out.println("SELECTION SHORT (ASCENDING)");
        Mahasiswa[] mhs = {new Mahasiswa("Lisa", 175314001),
            new Mahasiswa("Ema", 175314291),
            new Mahasiswa("Rina", 175314280),
            new Mahasiswa("Alan", 175314028)};

        System.out.println(" ");
        System.out.print("Data yang belum diurutkan = ");
        System.out.println(" ");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println(" " + mhs[i].getNama() + "\t" + mhs[i].getNim());
        }
        System.out.println(" ");
        System.out.print("Data yang sudah diurutkan = ");
        System.out.println(" ");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println(" " + Larik.SelectionSortObject(mhs)[i].getNama() + "\t" + mhs[i].getNim());
        }

        System.out.println(" ");
        System.out.println("INSERTION SHORT (DESCENDING)");
        Mahasiswa[] mhs1 = {new Mahasiswa("Lisa", 175314001),
            new Mahasiswa("Ema", 175314291),
            new Mahasiswa("Rina", 175314280),
            new Mahasiswa("Alan", 175314028)};
        System.out.println(" ");
        System.out.print("Data yang belum diurutkan = ");
        System.out.println(" ");
        for (int i = 0; i < mhs1.length; i++) {
            System.out.println(" " + mhs1[i].getNama() + "\t" + mhs1[i].getNim());
        }
        System.out.println(" ");
        System.out.print("Data yang sudah diurutkan = ");
        System.out.println(" ");
        for (int i = 0; i < mhs1.length; i++) {
            System.out.println(" " + Larik.InsertionSort(mhs1)[i].getNama() + "\t" + mhs1[i].getNim());
        }

        //     Mahasiswa[] data = {new Mahasiswa ("Budi",175314098),
        //   new Mahasiswa("Redy",175314118),
        //  new Mahasiswa("Frida",175314058),
        // new Mahasiswa("Aldy",175314044),
        //   new Mahasiswa("Sandra",175314106)};
//        for (int i = 0; i < data.length; i++) {
//             System.out.println(" " + data[i].getNim());
//        }
        //     System.out.println(" ");
        //    System.out.println();
        //  data= );
        //     for (int i = 0; i < data.length; i++) {
        //       System.out.println(" " + Larik.SelectionSortObject(data));
    }

//      System.out.println("Algoritma Sequential Search");
//        Mahasiswa key = new Mahasiswa("Aldy",0);  // kita mencari mahasiswa yang bernama Aldy, key ditulis berdasarkan kebutuhan kita yang di cari nama atau nim
//         //jika nama tdk papa diisi 0 karena tdk dipengaruhi
//     
//         Mahasiswa[] tam = Larik.SequentialSearch;
//         for (int i = 0; i < data.length; i++) {
//             System.out.println(" " + tam[i].getNama());
//         Mahasiswa[] Data = {new Mahasiswa ("Budi",175314098),//2
//            new Mahasiswa("Redy",175314118),//4
//            new Mahasiswa("Frida",175314058),//1
//            new Mahasiswa("Aldy",175314044),//0
//            new Mahasiswa("Sandra",175314106)};//3
//        
//        System.out.println("Binary Objek");
//        
//        Mahasiswa[] tam = Larik.bubbleSortObject(data);
//         for (int i = 0; i < data.length; i++) {
//             System.out.println(tam[i].getNama());
//            
}
