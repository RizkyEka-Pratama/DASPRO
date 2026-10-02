import  java.util.Scanner;
public class nestedAksesLab27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif kuliah? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah mahasiswa punya izin dosen? (true/false): ");
        boolean punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah mahasiswa asisten lab? (true/false): ");
        boolean asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            }else{
            System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
        }
        }else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

    sc.close();
    }
}
