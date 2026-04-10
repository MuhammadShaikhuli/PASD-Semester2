import java.util.Scanner;

public class MahasiswaDemo_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlah = sc.nextInt();

        MahasiswaBerprestasi_19 list = new MahasiswaBerprestasi_19(jumlah);
        
        for (int i = 0; i<jumlah; i++){
            System.out.println("\nMasukkan Data Mahasiswa ke-" +(i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa_19 m = new Mahasiswa_19(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData Mahasiswa terurut dengan SELECTION SORT  (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData Mahasiswa terurut dengan INSERTION SORT  (ASC)");
        list.insertionSort();
        list.tampil();

        System.out.println("\nData Mahasiswa terurut dengan INSERTION SORT  (DESC)");
        list.insertionSortDescending();
        list.tampil();

        list.tampil();
        System.out.println("-------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-------------------------");
        System.out.println("Masukkan ipk Mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
