public class StackSurat19 {
    int size, top;
    Surat19[] tumpukan;

    public StackSurat19(int size) {
        this.size = size;
        tumpukan = new Surat19[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size -1;
    }

    public void push(Surat19 srt) {
        if (!isFull()) {
            top++;
            tumpukan[top] = srt;
            System.out.println("DEBUG: Berhasil push surat milik " + tumpukan[top].namaMahasiswa);
        } else {
            System.out.println("Stack penuh! Tidak dapat menerima surat lagi.");
        }
    }

    public Surat19 pop() {
        if (!isEmpty()) {
            Surat19 srt = tumpukan[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat19 peek() {
        if (!isEmpty()) {
            return tumpukan[top];
        } else {
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada posisi tumpukan ke-" + (top - i + 1) + " dari atas");
                System.out.println("ID Surat: " + tumpukan[i].idSurat + " | Durasi: " + tumpukan[i].durasi + " hari");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}