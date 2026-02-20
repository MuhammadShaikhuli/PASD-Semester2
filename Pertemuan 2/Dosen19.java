public class Dosen19 {
    String idDosen, nama, bidangKeahlian;
    Boolean statusAktif;
    int tahunBergabung;

    public Dosen19() {
    }

    public Dosen19(String nm, String id, String bidang, int bergabung, boolean aktif) {
        nama = nm;
        idDosen = id;
        bidangKeahlian = bidang;
        tahunBergabung = bergabung;
        statusAktif = aktif;
    }

    void tampilInformasi (){
        System.out.println("Nama Dosen: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Status Keaktifan: " + statusAktif);
    }

    void setStatusAktif(boolean status){
        if(status){
            System.out.println("Dosen Aktif Mengajar");
        } else System.out.println("Dosen Tidak Aktif");
    }

    int hitungMasaKerja(int thnSkrg){
        int masaKerja = thnSkrg-tahunBergabung;
        System.out.println(nama +" telah mengajar selama: " +masaKerja +" tahun\n");
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen berubah\n");
    }
}
