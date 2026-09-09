import java.util.Scanner;
public class MenghitungLuasPersegiPanjang27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int panjang = sc.nextInt();
        int lebar = sc.nextInt(); 
        int luas;
        
        luas=panjang*lebar;

        System.out.println("Luas = " + luas);
    }
}
