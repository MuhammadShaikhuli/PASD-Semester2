public class MahasiswaMain19 {
    public static void main(String[] args) {
        Mahasiswa19[] daftar = {
            new Mahasiswa19("Ahmad", 78, 82),
            new Mahasiswa19("Budi", 85, 88),
            new Mahasiswa19("Cindy", 90, 87),
            new Mahasiswa19("Dian", 76, 79),
            new Mahasiswa19("Eko", 92, 95),
            new Mahasiswa19("Fajar", 88, 85),
            new Mahasiswa19("Gina", 80, 83),
            new Mahasiswa19("Hadi", 82, 84)
        };

        OperasiNilai19 op = new OperasiNilai19();

        double[] minMax = op.cariMinMaxUTS(daftar, 0, daftar.length - 1);
        
        double rataUas = op.hitungRataUasBF(daftar);

        System.out.println("LAPORAN NILAI MAHASISWA");
        System.out.println("Nilai UTS Tertinggi (DC) : " + minMax[1]);
        System.out.println("Nilai UTS Terendah  (DC) : " + minMax[0]);
        System.out.printf("Rata-rata Nilai UAS (BF) : %.2f\n", rataUas);
    }
}