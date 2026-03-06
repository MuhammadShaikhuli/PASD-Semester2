public class Dosen_19 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    public Dosen_19(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    public void tampilkanInfo() {
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Jenjang Pendidikan: " + jenjangPendidikan);
        System.out.println("Prodi: " + prodi);
        System.out.println("---------------------------");
    }

    public void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
        System.out.println("Prodi dosen " + nama + " telah diubah ke: " + prodi);
    }

    public void ubahPendidikan(String pendidikanBaru) {
        this.jenjangPendidikan = pendidikanBaru;
        System.out.println("Jenjang pendidikan " + nama + " telah diubah ke: " + jenjangPendidikan);
    }
}