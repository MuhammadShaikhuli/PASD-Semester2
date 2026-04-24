import java.util.Scanner;
public class MainSurat19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat19 stack = new StackSurat19(10);
        int pilih;

        do {
            System.out.println("\n--- Sistem Admin Prodi: Pengelolaan Surat Izin ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin (Validasi)");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); 
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: "); 
                    String nama = sc.nextLine();
                    System.out.print("Kelas: "); 
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): "); 
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): "); 
                    int dur = sc.nextInt();
                    stack.push(new Surat19(id, nama, kls, jenis, dur));
                    break;

                case 2:
                    Surat19 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat " + diproses.idSurat + " atas nama " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat19 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat teratas: " + terakhir.idSurat + " (" + terakhir.namaMahasiswa + ")");
                    } else {
                        System.out.println("Tidak ada surat dalam tumpukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Keluar..");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih != 5);
    }
}