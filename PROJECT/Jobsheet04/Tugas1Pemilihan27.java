import java.util.Scanner;
public class Tugas1Pemilihan27 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String pesan;
        String pesan1;
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        pesan = (uktLunas) ? "Pembayaran UKT terverifikasi" : "Pembayaran UKT tidak terverifikasi";
        pesan1 = (uktLunas) ? "Silahkan cetak KRS dan minta tanda tangan DPA" : "tolong bayar UKT terlebih dahulu";
        System.out.println(pesan);
        System.out.println(pesan1);


        
        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // }
        // else   {
        //     System.out.println("Pembayaran UKT tidak terverifikasi");
        //     System.out.println("tolong bayar UKT terlebih dahulu");
        // }
        sc.close();
    }
}
