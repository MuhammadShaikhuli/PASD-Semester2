import java.util.Scanner;

public class Tugas2Jadwal19 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);

        tampilkanSemua(jadwal);

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String cariHari = sc.nextLine();
        tampilkanBerdasarkanHari(jadwal, cariHari);

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String cariMK = sc.nextLine();
        tampilkanBerdasarkanMK(jadwal, cariMK);
    }

    // a
    public static void inputJadwal(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("\n--- Input Jadwal Ke-" + (i + 1) + " ---");
            System.out.print("Nama Mata Kuliah : ");
            data[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            data[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            data[i][2] = sc.nextLine();
            System.out.print("Jam (contoh: 08.00-10.00): ");
            data[i][3] = sc.nextLine();
        }
    }

    // b
    public static void tampilkanSemua(String[][] data) {
        System.out.println("\n----------------------------------------------------------------------------");
        System.out.printf("| %-25s | %-15s | %-10s | %-12s |%n", "NAMA MK", "RUANG", "HARI", "JAM");
        System.out.println("----------------------------------------------------------------------------");
        for (String[] baris : data) {
            System.out.printf("| %-25s | %-15s | %-10s | %-12s |%n", baris[0], baris[1], baris[2], baris[3]);
        }
        System.out.println("----------------------------------------------------------------------------");
    }

    // c
    public static void tampilkanBerdasarkanHari(String[][] data, String hari) {
        System.out.println("\nJadwal untuk hari: " + hari);
        boolean ketemu = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("- %-25s (%-10s) [%-12s]%n", data[i][0], data[i][1], data[i][3]);
                ketemu = true;
            }
        }
        if (!ketemu) System.out.println("Tidak ada jadwal pada hari tersebut.");
    }

    // d
    public static void tampilkanBerdasarkanMK(String[][] data, String mk) {
        System.out.println("\nPencarian Mata Kuliah: " + mk);
        boolean ketemu = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].toLowerCase().contains(mk.toLowerCase())) {
                System.out.printf("Ditemukan: %s di %s hari %s jam %s%n", 
                                   data[i][0], data[i][1], data[i][2], data[i][3]);
                ketemu = true;
            }
        }
        if (!ketemu) System.out.println("Mata kuliah tidak ditemukan.");
    }
}