import java.util.Scanner;
public class Array19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] matkul = { "CTPS", "KTI","Agama", "Matematika Dasar", "PAMB",
        "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Bahasa indonesia" };

        double[] nilaiAngka = new double[matkul.length]; 
        String[] nilaiHuruf = new String[matkul.length]; 
        double[] bobotNilai = new double[matkul.length];

        System.out.println("--- PROGRAM MENGHITUNG IP SEMESTER ---");
        System.out.println("======================================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        System.out.println("======================================"); 
        System.out.println("Hasil Konversi Nilai"); 
        System.out.println("======================================");

        System.out.printf("%-40s %-15s %-15s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totalBobot = 0;
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-10.2f%n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot += bobotNilai[i];
        }

        double ip = totalBobot / matkul.length;

        System.out.println("==============================");
        System.out.printf("IP : %.2f", ip);
        
        

    }
}