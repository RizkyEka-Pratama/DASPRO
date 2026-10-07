package PROJECT.Jobsheet06;
import java.util.Scanner;
public class StudiKasus2_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, jenisKegitan;
        int jumlahDokumen,peringkat,jumlahDokumen1;
        int pendanaan;
        
        
        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegitan = input.nextLine();
        System.out.print("Masukkan jumlah dokumen: ");
        jumlahDokumen = input.nextInt();
        
        

        if (jenisKegitan.equalsIgnoreCase("belmawa") || jenisKegitan.equalsIgnoreCase("bakorma") || jenisKegitan.equalsIgnoreCase("mandiri")){
            System.out.print("Masukkan peringkat: ");
            peringkat = input.nextInt();
            if (jumlahDokumen<4) {
                jumlahDokumen1=4-jumlahDokumen;
                System.out.println("Dokumen tidak lengkap (kurang " + jumlahDokumen1 + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (peringkat>=1 && peringkat<=3) {
                    System.out.println("Berhak memperoleh dana penghargaan(" + jenisKegitan + " lolos pendanaan)");
                } else {
                    System.out.println("Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3).");
                }
            }
            }else if (jenisKegitan.equalsIgnoreCase("pkm")) {
                System.out.print("Masukkan status pendanaan(1 = lolos/0 = tidak lolos): ");
                pendanaan = input.nextInt();

                if (jumlahDokumen<4) {
                    jumlahDokumen1=4-jumlahDokumen;
                    System.out.println("Dokumen tidak lengkap (kurang " + jumlahDokumen1 + " dokumen). Dana penghargaan tidak diberikan.");
                } else if (pendanaan==1) {
                    System.out.println("Berhak memperoleh dana penghargaan(" + jenisKegitan + " lolos pendanaan)");
                } else {
                    System.out.println("Tidak memperoleh dana penghargaan (hanya untuk yang lolos pendanaan).");
                }
            } else {
                if (jenisKegitan.equalsIgnoreCase("lainnya")) {
                    System.out.println("Tidak memperoleh dana penghargaan(jenis kegiatan tidak termasuk ketentuan).");
                } else {
                    System.out.println("Tidak memperoleh dana penghargaan(jenis kegiatan tidak termasuk ketentuan).");
                }
            } 
        }


    }

