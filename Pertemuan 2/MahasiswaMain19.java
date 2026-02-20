public class MahasiswaMain19 {
    public static void main(String[] args) {
        Mahasiswa19 mhs1 = new Mahasiswa19();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas ("SI 2K");
        mhs1.updateIpk (3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa19 mhs2 = new Mahasiswa19("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa19 mhsSaikhul = new Mahasiswa19("M Saikhul I", "2141720160", 4.0, "TI 4A");
        mhsSaikhul.updateIpk(4.00);
        mhsSaikhul.tampilkanInformasi();
    }
}
