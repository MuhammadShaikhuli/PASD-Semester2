import java.util.Scanner;
public class RestoMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList19 antreanList = new DoubleLinkedList19();
        DoubleLinkedList19 laporanList = new DoubleLinkedList19();
        int menu, autoNoAntrian = 1;

        do {
            System.out.println("\n=========================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Total Pendapatan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1: // Tambah antrian
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    antreanList.addAntrean(new Pembeli19(autoNoAntrian++, nama, hp));
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + (autoNoAntrian - 1));
                    break;
                case 2: // cetak antrian
                    antreanList.printAntrean();
                    break;
                case 3: // hapus antrian dan pesan
                    Pembeli19 dipanggil = antreanList.removeAntrean();
                    if (dipanggil != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt(); sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String nPesanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        
                        laporanList.addPesanan(new Pesanan19(kode, nPesanan, harga));
                        System.out.println(dipanggil.namaPembeli + " telah memesan " + nPesanan);
                    } else {
                        System.out.println("Antrean kosong!");
                    }
                    break;
                case 4:
                    laporanList.printLaporanPesanan();
                    break;
                case 5:
                laporanList.hitungTotalPendapatan();
                break;
            }
        } while (menu != 0);
    }
}