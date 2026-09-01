import java.util.Scanner;

/*
Algoritma
Input: panjang, lebar
Output: keliling
Proses:
input panjang, lebar
kelililing = 2 x (panjang + lebar)
Output keliling

Variabel
Panjang: Int
Lebar: Int
Keliling: Int
*/
public class Kasus1_27 {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;
        System.out.print("Masukkan Panjang:");
        panjang = input.nextInt();
        System.out.print("Masukkan Lebar:");
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);
        System.out.print("Hasil Keliling:");
        System.out.println(keliling);

    }
}