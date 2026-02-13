import java.util.Scanner;
public class Pemilihan19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double Ntugas, Nkuis, Nuts, Nuas, Nakhir;
        String NilaiHuruf;

        System.out.println("--- PROGRAM MENGHITUNG NILAI AKHIR ---");
        System.out.println("======================================");

        do{
            System.out.print("Masukkan Nilai Tugas: ");
            Ntugas = sc.nextDouble();
            if (Ntugas > 100 || Ntugas < 0){
                System.out.println("Nilai Tidak Valid");
            }
        } while (Ntugas > 100 || Ntugas < 0);

        do{
            System.out.print("Masukkan Nilai Kuis: ");
            Nkuis = sc.nextDouble();
            if (Nkuis > 100 || Nkuis < 0){
                System.out.println("Nilai Tidak Valid");
            }
        } while (Nkuis > 100 || Nkuis < 0);

        do{
            System.out.print("Masukkan Nilai UTS: ");
            Nuts = sc.nextDouble();
            if (Nuts > 100 || Nuts < 0){
                System.out.println("Nilai Tidak Valid");
            }
        } while (Nuts > 100 || Nuts < 0);

        do{
            System.out.print("Masukkan Nilai UAS: ");
            Nuas = sc.nextDouble();
            if (Nuas > 100 || Nuas < 0){
                System.out.println("Nilai Tidak Valid");
            }
        } while (Nuas > 100 || Nuas < 0);

        System.out.println("======================================");

        Nakhir = Ntugas*0.2 + Nkuis*0.2 + Nuts*0.3 + Nuas*0.3;

        if (Nakhir > 80 && Nakhir < 100 || Nakhir == 100){
            NilaiHuruf = "A";
        } else if (Nakhir > 73 && Nakhir < 80 || Nakhir == 80){
            NilaiHuruf = "B+";
        } else if (Nakhir > 65 && Nakhir < 73 || Nakhir == 73){
            NilaiHuruf = "B";
        } else if (Nakhir > 60 && Nakhir < 65 || Nakhir == 65){
            NilaiHuruf = "C+";
        } else if (Nakhir > 50 && Nakhir < 60 ||Nakhir == 60){
            NilaiHuruf = "C";
        } else if (Nakhir > 39 && Nakhir < 50 || Nakhir == 50){
            NilaiHuruf = "D";
        } else NilaiHuruf = "E";

        System.out.print("Nilai Akhir: " + Nakhir);
        System.out.print("\nNilai Huruf: " + NilaiHuruf);
        System.out.println("\n======================================");

        if (NilaiHuruf.equals("A") || NilaiHuruf.equals("B+") || NilaiHuruf.equals("B") || 
        NilaiHuruf.equals("A") || NilaiHuruf.equals("C")){
            System.out.println("SELAMAT ANDA LULUS");
        } else System.out.println("MAAF ANDA TIDAK LULUS");
    }
}