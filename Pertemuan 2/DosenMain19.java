public class DosenMain19 {
    public static void main(String[] args) {
        Dosen19 ds1 = new Dosen19();
        ds1.nama = "Bu Triana";
        ds1.idDosen = "12345";
        ds1.bidangKeahlian = "Teknologi Informasi";
        ds1.tahunBergabung = 2010;
        ds1.statusAktif = true;

        ds1.tampilInformasi();
        ds1.setStatusAktif(true);
        ds1.hitungMasaKerja(2026);
        ds1.ubahKeahlian("Manajemen Bisnis");
        ds1.tampilInformasi();

        Dosen19 ds2 = new Dosen19("Bu Triana","12345", "Manajemen Bisnis", 2010, true );
        ds2.tampilInformasi();
        ds2.setStatusAktif(true);
        ds2.hitungMasaKerja(2026);
        ds1.ubahKeahlian("Teknologi Informasi");
        ds2.tampilInformasi();
    }
}
