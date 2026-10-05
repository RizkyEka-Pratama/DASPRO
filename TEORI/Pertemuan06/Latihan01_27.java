import java.util.Scanner;
public class Latihan01_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1: ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        int bil3 = sc.nextInt();

        System.out.print("Bilangan terbesar: ");
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println(bil1);
            } else {
                System.out.println(bil3);
            }
        } else {
            if (bil2>bil3) {
                System.out.println(bil2);
            }
            else{
                System.out.println(bil3);
            }
        }
        sc.close();
    }
}
