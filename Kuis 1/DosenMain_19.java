import java.util.Scanner;

public class DosenMain_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen_19 dosen1 = new Dosen_19("12345", "Bu Triana", 2015, "S3", " TeknikInformatika");
        
        System.out.println("DATA DOSEN AWAL");
        dosen1.tampilkanInfo();

        System.out.println("\nMEMPERBARUI DATA DOSEN");
        dosen1.ubahProdi("Sistem Informasi Bisnis");
        dosen1.ubahPendidikan("S3");

        System.out.println("\nDATA DOSEN SETELAH DIPERBARUI");
        dosen1.tampilkanInfo();

        System.out.println("DAFTAR DOSEN");
        dosen1.tampilkanInfo();
        
        System.out.println("----------------------------");
    }
}