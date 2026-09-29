import java.util.Scanner;
public class TugasParkir27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa Lama Parkir Anda: ");
        int lamaParkir = sc.nextInt();
        int tarif1 = 2000;
        int tarif2 = 1000;
        int total;

        if (lamaParkir <= 2) {
            System.out.println("Anda Dikenai Tarif: " + tarif1);
        } else {
            total = (lamaParkir - 2) * tarif2 + tarif1;
            System.out.println("Anda Dikenai Tarif: " + total);
        }
    }
}
