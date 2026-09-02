/*
Algoritma
Input: gaji pokok, jumlah anak
Output: tunjangan anak, gaji bersih
Data lain: besar tunjangan anak = 100000/anak, dana pensiun = 10%, potongan

Proses
Input gaji pokok, jumlah anak
hitung tunjangan anak = jumlah anak x besar tunjangan anak
potongan = dana pensiun x gaji pokok
hitung gaji bersih = gaji pokok + tunjangan anak - potongan

Variabel
gaji pokok = int
jumlah anak = int
tunjangan anak = int
gaji bersih = double
besar tunjangan anak = int
dana pensiun = double
potongan = double
    }
*/
import java.util.Scanner;
public class Kasus1_27 {

    public static void main(String[]args){

        java.util.Scanner input = new Scanner(System.in);

        int gaji_pokok, jml_anak, tnj_anak, besar_tnj_anak;
        double gaji_bersih, dana_pensiun =0.10, potongan;

        System.out.println("Masukkan gaji pokok anda:");
            gaji_pokok = input.nextInt();
        System.out.println("Masukkan jumlah anak anda:");
            jml_anak = input.nextInt();
        System.out.println("Masukkan tunjangan anak:");
            tnj_anak = input.nextInt();

            besar_tnj_anak = jml_anak*tnj_anak;
            potongan = dana_pensiun*gaji_pokok;
            gaji_bersih = gaji_pokok + besar_tnj_anak - potongan;

        System.out.println("Tunjangan anak sebesar:" +besar_tnj_anak);
        System.out.println("Gaji bersih anda sebesar:" +gaji_bersih);
    }
}
