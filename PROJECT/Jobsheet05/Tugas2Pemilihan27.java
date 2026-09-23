import java.util.Scanner;
public class Tugas2Pemilihan27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa jumlah SKS Anda: ");
        int jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

    }
}
