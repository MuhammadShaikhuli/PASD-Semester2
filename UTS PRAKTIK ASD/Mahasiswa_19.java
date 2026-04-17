public class Mahasiswa_19 {
    String nim, nama, prodi;
    //atribut object mahasiswa

    public Mahasiswa_19(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    // method object mahasiswa (constructor)

    void tampilMahasiswa() {
        System.out.print("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
    //method object mahasiswa
}