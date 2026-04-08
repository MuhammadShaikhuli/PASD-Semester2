public class MahasiswaDemo_19 {
    public static void main(String[] args) {
        MahasiswaBerprestasi_19 list = new MahasiswaBerprestasi_19();
        Mahasiswa_19 m1 = new Mahasiswa_19("123", "Zidan", "2A", 3.2);
        Mahasiswa_19 m2 = new Mahasiswa_19("124", "Ayu", "2A", 3.5);
        Mahasiswa_19 m3 = new Mahasiswa_19("125", "Sofi", "2A", 3.1);
        Mahasiswa_19 m4 = new Mahasiswa_19("126", "Sita", "2A", 3.9);
        Mahasiswa_19 m5 = new Mahasiswa_19("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();
    }
}
