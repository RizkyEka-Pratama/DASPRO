import java.util.Scanner;
public class tugas1_27 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan harga laptop: ");
    int harga_laptop = sc.nextInt();
    System.out.print("Masukkan Uang Muka: ");
    int uang_muka = sc.nextInt();
    System.out.print("Masukkan Lama Cicilan: ");
    int lama_cicilan = sc.nextInt();
    int sisa_pinjaman;
    double bunga_per_bulan;
    double cicilan_pokok;
    double total_cicilan;

    sisa_pinjaman = harga_laptop - uang_muka;
    bunga_per_bulan=sisa_pinjaman*0.02;
    cicilan_pokok=sisa_pinjaman/lama_cicilan;
    total_cicilan=cicilan_pokok+bunga_per_bulan;

    System.out.println("Cicilan laptop anda adalah: " + total_cicilan);
}
}
