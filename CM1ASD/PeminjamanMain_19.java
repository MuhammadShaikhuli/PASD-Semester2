import java.util.Scanner;
public class PeminjamanMain_19 {
    Peminjaman_19[] listPinjam = new Peminjaman_19[10];
    int idx = 0;

    void tambahPeminjaman(Peminjaman_19 p) {
        if (idx < listPinjam.length) {
            listPinjam[idx] = p;
            idx++;
        }
    }
    //memasukkan object peminjaman ke array

    void urutDendaBesar() {
        for (int i = 1; i < idx; i++) {
            Peminjaman_19 temp = listPinjam[i];
            int j = i;
            while (j > 0 && listPinjam[j - 1].denda < temp.denda) {
                listPinjam[j] = listPinjam[j - 1];
                j--;
            }
            listPinjam[j] = temp;
        }
    }//Insertion Sort Descending

    int cariNIM(String cari) {
        for (int i=0; i<idx;i++){
            if(listPinjam[i].mhs.nim.equalsIgnoreCase(cari)){
                return i;
            }
        }
        return -1;
    } 
    //sequential search

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeminjamanMain_19 mrb = new PeminjamanMain_19();

        Mahasiswa_19 m1 = new Mahasiswa_19("22001", "Andi", "TI");
        Mahasiswa_19 m2 = new Mahasiswa_19("22002", "Budi", "TI");
        Mahasiswa_19 m3 = new Mahasiswa_19("22003", "Citra", "SIB");
        // Data Inisialisasi Mahasiswa

        Buku_19 b1 = new Buku_19("B001", "Algoritma", 2020);
        Buku_19 b2 = new Buku_19("B002", "Basis Data", 2019);
        Buku_19 b3 = new Buku_19("B003", "Pemrograman", 2021);
        Buku_19 b4 = new Buku_19("B004", "Fisika", 2024);
        // Data Inisialisasi Buku

        Mahasiswa_19[] daftarMhs = {m1,m2,m3};
        Buku_19[] daftarBuku = {b1, b2, b3, b4};
        //inisialisasi array mahasiswa dan buku

        mrb.tambahPeminjaman(new Peminjaman_19(m1, b1, 8));  // Denda 6000, karena terlambat 3 hari
        mrb.tambahPeminjaman(new Peminjaman_19(m2, b2, 4));  // Denda 0, karena tidak terlambat
        mrb.tambahPeminjaman(new Peminjaman_19(m3, b3, 10)); // Denda 10000, karena terlambat 5 hari
        mrb.tambahPeminjaman(new Peminjaman_19(m3, b4, 7)); // Denda 4000, karena terlambat 2 hari
        /*membuat object peminjaman dan memasukkan object peminjaman
        ke dalam array dengan method dari mrb, yaitu tambahPeminjaman */


        int menu;
        do {
            System.out.println("\n========= MENU MANAJEMEN RUANG BACA =========");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Buku");
            System.out.println("3. Tampilkan Data Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Insertion Sort DESC)");
            System.out.println("5. Cari Berdasarkan NIM (Sequential Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (menu) {
                case 1:
                    System.out.println("\n--- Data Mahasiswa ---");
                    for(int i=0; i < daftarMhs.length; i++){
                        daftarMhs[i].tampilMahasiswa();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\n--- Data Buku ---");
                    for(int i=0; i < daftarBuku.length; i++){
                        daftarBuku[i].tampilBuku();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\n--- Data Peminjaman ---");
                    for(int i=0; i<mrb.idx; i++) mrb.listPinjam[i].tampilPeminjaman();
                    break;
                case 4:
                    mrb.urutDendaBesar();
                    System.out.println("\nData berhasil diurutkan berdasarkan denda terbesar.");
                    for(int i=0; i<mrb.idx; i++) mrb.listPinjam[i].tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM yang dicari: ");
                    String cari = sc.nextLine();
                    int hasil = mrb.cariNIM(cari);
                    if (hasil != -1) {
                        System.out.println("Data Ditemukan:");
                        mrb.listPinjam[hasil].tampilPeminjaman();
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + cari + " tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }//pemilihan switch case
        } while (menu != 0);
        //perulangan do while
        sc.close();
    }
}