import java.util.Scanner;
public class Tugas1PlatNomor19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        String[][] kota = {
            {"Banten"},     
            {"Jakarta"},    
            {"Bandung"},    
            {"Cirebon"},    
            {"Bogor"},      
            {"Pekalongan"}, 
            {"Semarang"},   
            {"Surabaya"},   
            {"Malang"},     
            {"Tegal"}       
        };

        System.out.print("Masukkan Kode Plat Nomor (Huruf Kapital): ");
        char input = sc.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (input == kode[i]) {
                System.out.println("Kota: " + kota[i][0]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, kode plat tidak dikenali.");
        }
    }
}