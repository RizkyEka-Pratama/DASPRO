/*
Algoritma
Input: jumlah tabungan awal, lama menabung
Output: bunga, jumlah tabungan akhir
Data lain = prosentase bunga = 0,02
Proses:
Input jumlah tabungan awal, lama menabung
Hitung bunga = lama menabung x prosentase bunga x jumlah tabungan awal
Hitung jumlah tabungan akhir = bunga + jumlah tabungan awal
Output bunga dan jumlah tabungan akhir
Variabel
jml_tabungan_awal=int
lama_menabung=int
presentase_bunga=double
jml_tabungan_akhir=double
bunga=double
*/

import java.util.Scanner;
public class Kasus2_27 {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga =0.02, bunga, jml_tabungan_akhir;

        System.out.println ("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println ("masukkan lama menabung anda");
        lama_menabung= input.nextInt();

        bunga= lama_menabung*presentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;

        System.out.println ("Bunga adalah " +bunga);
        System.out.println ("Jumlah tabungan akhir anda adalah " +jml_tabungan_akhir);

    }
}

