public class Matakuliahmain_19 {
    public static void main(String[] args) {
        
        Matakuliah_19 mk1 = new Matakuliah_19("ASD01", "Algoritma dan Struktur Data", 3);

        mk1.tampilkanInfoMK();

        System.out.println("\nPERUBAHAN MK");
        mk1.ubahNamaMK("Praktikum Algoritma dan Struktur Data");
        mk1.ubahSks(4);
        mk1.tambahDosen("Bu Triana");

        System.out.println("\nINFORMASI MK");
        mk1.tampilkanInfoMK();
    }
}