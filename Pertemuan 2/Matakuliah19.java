public class Matakuliah19 {
    String nama, kodeMK;
    int sks, jumlahJam;

    public Matakuliah19() {
    }

    public Matakuliah19(String nm, String kodeMK, int sks, int jumlahJam) {
        nama = nm;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi () {
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam Per Minggu: " + jumlahJam);
    }

    void ubahSKS (int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah Diubah");
    }

    void tambahJam (int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam > jam){
            jumlahJam -= jam;
        } else System.out.println("Jumlah Jam terlalu kecil untuk dikurangi");
    }
}
