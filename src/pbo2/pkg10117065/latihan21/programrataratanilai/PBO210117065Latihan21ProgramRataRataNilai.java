package pbo2.pkg10117065.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Mengisi nilai mahasiswa yang banyaknya ditentukan 
 * oleh inputan kita sendiri kemudian menampilkan rata-rata nilainya
 * 
 */
public class PBO210117065Latihan21ProgramRataRataNilai {

    public static void main(String[] args) {
        
//        deklarasi variabel
        int nMhs;
        int nilaiMhs;
        double totalNilai;
        double rataNilai;
        //deklarasi untuk inputan scanner
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
        totalNilai = 0; //inisialisasi total mahasiswa 0
//        looping sesuai dengan jumlah mahasiswa yang telah diinputkan
        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilaiMhs = scn.nextInt();
            totalNilai += nilaiMhs; //menampung totall nilai mahasiswa
        }
        
//        rumus menghitung rata-rata nilai mahasiswa
        rataNilai = totalNilai/nMhs;
        System.out.println("\nMaka, Rata-rata Nilainya adalah "+rataNilai);
        System.out.println("Developed by: Teguh Siswanto");
        
        
    }
    
}
