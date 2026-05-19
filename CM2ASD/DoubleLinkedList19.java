public class DoubleLinkedList19 {
    Node19 head, tail;
    int size = 0;

    boolean isEmpty() { 
        return head == null; 
    }

    // Fitur 1: Tambah Antrean (Add Last)
    void addAntrean(Pembeli19 pembeli) {
        Node19 newNode = new Node19(pembeli); //menyimpan object pembeli ke node baru
        if (isEmpty()) {
            head = tail = newNode; //node baru menjadi head dan tail
        } else {
            tail.next = newNode; //tail sebelumnya memiliki next node baru
            newNode.prev = tail; //tail sebelumnya menjadi prev node baru
            tail = newNode; //node baru menjadi tail
        }
        size++;
    }

    // Fitur 2: Cetak Antrean
    void printAntrean() {
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        Node19 current = head;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", 
                current.pembeli.noAntrian, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next;
        }
    }

    // Fitur 3: Hapus Antrean (Remove First)
    Pembeli19 removeAntrean() {
        if (isEmpty()) {
            return null;
        }
        Pembeli19 p = head.pembeli;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return p;
    }

    // Fitur 4: Tambah Pesanan (untuk Laporan)
    void addPesanan(Pesanan19 pesanan) {
        Node19 newNode = new Node19(pesanan);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Fitur 4: Laporan dengan Sorting Manual (Bubble Sort pada Linked List)
    void printLaporanPesanan() {
        if (isEmpty()) return;
        
        // Sorting Manual berdasarkan Nama Pesanan (Bubble Sort)
        for (Node19 i = head; i.next != null; i = i.next) {
            for (Node19 j = i.next; j != null; j = j.next) {
                if (i.pesanan.namaPesanan.compareToIgnoreCase(j.pesanan.namaPesanan) > 0) {
                    // Tukar data pesanan saja
                    Pesanan19 temp = i.pesanan;
                    i.pesanan = j.pesanan;
                    j.pesanan = temp;
                }
            }
        }

        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        Node19 current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", 
                current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
            current = current.next;
        }
    }

    void hitungTotalPendapatan() {
    if (isEmpty()) {
        System.out.println("Total Pendapatan: Rp 0 (Belum ada pesanan)");
        return;
    }
    
    int total = 0;
    Node19 current = head;
    while (current != null) {
        total += current.pesanan.harga; // Menjumlahkan harga dari setiap node
        current = current.next;
    }
    
    System.out.println("=========================================");
    System.out.println("TOTAL PENDAPATAN RESTORAN");
    System.out.println("=========================================");
    System.out.println("Rp " + total);
    System.out.println("=========================================");
}
}