import java.util.Scanner;
public class MenghitungTotalBayar27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double potongan, jml_bayar, diskon=0.15;

        double harga = sc.nextDouble();

        potongan=diskon*harga;
        jml_bayar=harga-potongan;
        
        System.out.println("Potongan anda: " + potongan);
        System.out.println("Jumlah yang harus ada bayar adalah Rp. " + jml_bayar);
    }
}
