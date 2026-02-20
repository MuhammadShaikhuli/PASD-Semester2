public class MatakuliahMain19 {
    public static void main(String[] args) {
        Matakuliah19 mk1 = new Matakuliah19();
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.kodeMK = "12345";
        mk1.sks = 2;
        mk1.jumlahJam = 5;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam (2);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        Matakuliah19 mk2 = new Matakuliah19("PASD", "54321", 2, 7);
        mk2.ubahSKS(3);
        mk2.kurangiJam(1);
        mk2.tampilInformasi();
    }
}
