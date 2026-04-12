public class Peminjaman_19 {
    Mahasiswa_19 mhs;
    Buku_19 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    //atribut peminjaman

    public Peminjaman_19(Mahasiswa_19 mhs, Buku_19 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda(); 
    }
    //constructor

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }
    //menghitung denda

    void tampilPeminjaman() {
        mhs.tampilMahasiswa();;
        System.out.print(" | ");
        buku.tampilBuku();
        System.out.println(" | Lama Pinjam: " + lamaPinjam + " hari");
        System.out.println("Keterlambatan: " + terlambat + " hari | Total Denda: Rp " + denda);
        System.out.println("---------------------------------------------------------");
    }
    //menampilkan data peminjaman
}