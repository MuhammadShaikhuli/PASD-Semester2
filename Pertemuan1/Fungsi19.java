public class Fungsi19 {
    static int hargaAglonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;

    public static void main(String[] args) {
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        }; 

        System.out.println("----------------------------------------------------------");
        System.out.printf("%-15s  %-15s  %-15s%n", "Cabang", "Pendapatan", "Status");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < stockBunga.length; i++) {
            menampilkanPendapatan(i + 1, stockBunga[i]);
        }
        System.out.println("----------------------------------------------------------");
    }

    public static int hitungPendapatan(int[] stok) {
        int total = (stok[0] * hargaAglonema) + 
                    (stok[1] * hargaKeladi) + 
                    (stok[2] * hargaAlocasia) + 
                    (stok[3] * hargaMawar);
        return total;
    }

    public static String tentukanStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void menampilkanPendapatan(int nomorCabang, int[] stok) {
        int pendapatan = hitungPendapatan(stok);
        String status = tentukanStatus(pendapatan);
        
        System.out.printf("RoyalGarden %-2d  Rp %-12d  %-15s%n", nomorCabang, pendapatan, status);
    }
}