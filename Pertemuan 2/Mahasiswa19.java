public class Mahasiswa19 {
    String nama, nim, kelas;
    double ipk;

    public Mahasiswa19() {
    }

    public Mahasiswa19(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi () {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas (String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk (double ipkBaru){
        ipk = ipkBaru;
        if (ipk < 0.0 || ipk > 4.00) {
            System.out.println("IPK tidak valid, harus antara 0.0 dan 4.00 ");
        }
    }

    String nilaiKinerja(){
        if (ipk >= 3.5){
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0){
            return "Kinerja Baik";
        } else if (ipk >= 2.0){
            return "Kinerja Cukup";
        } else
            return "Kinerja Kurang";
    }
}
