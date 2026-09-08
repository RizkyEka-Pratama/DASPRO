import java.util.Scanner;
public class tugas2_27 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Lembar: ");
    int jumlah_lembar = sc.nextInt();
    int total_biaya;

    total_biaya=(jumlah_lembar*500)+5000;

    System.out.println(total_biaya);
   } 
}
