public class Buku_19 {
    String kodeBuku, judul;
    int tahunTerbit;
    //atribut object buku

    public Buku_19(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }
    //method object buku (constructor)

    void tampilBuku() {
        System.out.print("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
    //method object buku
}