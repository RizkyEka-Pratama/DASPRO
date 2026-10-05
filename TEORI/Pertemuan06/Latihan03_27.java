import  java.util.Scanner;
public class Latihan03_27 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan merk (Converse, Sketcher, Nike): ");
    String merk=sc.nextLine();
    System.out.print("Masukkan kategori: ");
    String kategori=sc.nextLine();
    System.out.print("Masukkan ukuran sepatu: ");
    int ukuran=sc.nextInt();
    int harga=0;
    String pesan ="";

    if (merk.equals("Converse")) {
        if (kategori.equals("Slip On")) {
            if (ukuran>=36 && ukuran <=40) {
                harga=800000;
            } else {
                pesan="Maaf Sepatu Tidak Ada";
            }
        } else {
            if (ukuran>=40 && ukuran<=44) {
                harga=1200000;
            } else {
                pesan="Maaf Sepatu Tidak Ada";
            }
        }
    } else {
        if (merk.equals("Sketcher")) {
            if (kategori.equals("Woman")) {
                if (ukuran>=36 && ukuran<=41) {
                    harga=1000000;
                } else {
                    pesan="Maaf Sepatu Tidak Ada";
                }
            } else {
                if (ukuran>=41 && ukuran<=44) {
                    harga=1800000;
                } else {
                    pesan="Maaf Sepatu Tidak Ada";
                }
            }
        } else {
            if (merk.equals("Nike")) {
                if (kategori.equals("Kids")) {
                    if (ukuran>=36 && ukuran <=40) {
                        harga=750000;
                    } else {
                        pesan="Maaf Sepatu Tidak Ada";
                    }
                } else {
                    if (ukuran >=40 && ukuran<=44) {
                        harga=1500000;
                    } else {
                        pesan="Maaf Sepatu Tidak Ada";
                    }
                }
            } else {
                pesan="Maaf Sepatu Tidak Ada";
            }
        }
    }
    System.out.println("Harga Sepatu: " + harga);
    System.out.println(pesan);
    }
}

