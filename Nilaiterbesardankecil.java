/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaiterbesardankecil;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : Nilai Terbesar dan Terkecil
 */
public class Nilaiterbesardankecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPetugas;
        int banyakMhs;
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasisiwa====");
        System.out.print("Masukan Nama Petugas = ");
        Scanner nama = new Scanner(System.in);
        namaPetugas = nama.next();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa = ");
        banyakMhs = nama.nextInt();
        int[] nilaiMhs = new int[banyakMhs];
        System.out.print("Masukan Nilai Mahasiswa Ke-" + 1 + " = ");
        nilaiMhs[0] = nama.nextInt();
        int nilaiTerbesar = nilaiMhs[0], nilaiTerkecil = nilaiMhs[0];
        for ( int i = 1;i < banyakMhs; i++){
            System.out.print("Masukan Nilai Mahasiswa Ke-" + (i+1)+ " = ");
            nilaiMhs[i] = nama.nextInt();
            if (nilaiMhs[i] > nilaiTerbesar)
                nilaiTerbesar = nilaiMhs[i];
            if (nilaiMhs[i] < nilaiTerkecil)
                nilaiTerkecil = nilaiMhs[i];
                    
        }
              System.out.println("Nilai Terbesar adalah "+nilaiTerbesar);
              System.out.println("Nilai Terkecil adalah "+nilaiTerkecil);
              System.out.println("Petugas : pasya ");
        
        
        
        
    }
    
}
