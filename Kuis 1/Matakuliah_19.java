public class Matakuliah_19 {
    String kodeMK, namaMK;
    int sks;
    
    String jenjangPendidikan = "Sarjana"; 
    String prodi = "Informatika";

    Matakuliah_19(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilkanInfoMK() {
        System.out.println("--- Informasi Mata Kuliah ---");
        System.out.println("Kode MataKuliah: " + kodeMK);
        System.out.println("Nama MataKuliah: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jenjang Pendidikan: " + jenjangPendidikan);
        System.out.println("Prodi: " + prodi);
        System.out.println("-----------------------------");
    }

    public void ubahNamaMK(String nama2) {
        namaMK = nama2;
        System.out.println("Nama Matakuliah berhasil diubah menjadi: " + namaMK);
    }

    public void ubahSks(int sks2) {
        if (sks2 >= 2) {
            sks = sks2;
            System.out.println("SKS berhasil diperbarui.");
        } else {
            System.out.println("Gagal: SKS minimal adalah 2.");
        }
    }

    public void tambahDosen(String namaDosen) {
        System.out.println("Dosen Pengampu '" + namaDosen + "' telah ditambahkan ke " + namaMK);
    }
}