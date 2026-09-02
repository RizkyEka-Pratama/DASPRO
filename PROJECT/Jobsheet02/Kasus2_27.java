/*
Algoritma
Input = panjang tanah, lebar tanah, diameter kolam, sisi taman
Output = luas sisa tanah
Proses
hitung luas tanah = panjang tanah x lebar tanah
hitung jari jari kolam = diameter kolam / 2
hitung luas kolam ikan l = 3,14 x r x r
hitung luas taman bunga p = sisi taman x sisi taman
hitung luas sisa tanah = luas tanah - (luas kolam + luas taman)

Variabel
panjang tanah = int
lebar tanah = int
diameter kolam int
r double
sisi taman = int
luas tanah = double
luas kolam = double
luas taman = double
luas sisa tanah = double

        System.out.println("Masukkan gaji pokok anda:");
            gaji_pokok = input.nextInt();

*/
import java.util.Scanner;
public class Kasus2_27 {
    public static void main(String[]args){

        java.util.Scanner input = new Scanner(System.in);
        int panjang_tanah,lebar_tanah,diameter_kolam,sisi_taman;
        double luas_tanah,luas_kolam,luas_taman,luas_sisa_tanah,jari_jari;

        System.out.print("Masukkan panjang tanah:");
            panjang_tanah = input.nextInt();
        System.out.print("Masukkan lebar tanah:");
            lebar_tanah = input.nextInt();
        System.out.print("Masukkan diameter kolam:");
        diameter_kolam = input.nextInt();
        System.out.print("Masukkan sisi taman:");
        sisi_taman = input.nextInt();

        luas_tanah = panjang_tanah*lebar_tanah;
        jari_jari = diameter_kolam/2.0;
        luas_kolam = 3.14*jari_jari*jari_jari;
        luas_taman = sisi_taman*sisi_taman;
        luas_sisa_tanah = luas_tanah - (luas_kolam+luas_taman);
        System.out.println("Luas sisa tanah adalah:" +luas_sisa_tanah);
    }
}
