
public class BinarySearchTreeFilm19 {

    NodeFilm19 root;

    public BinarySearchTreeFilm19() {
        root = null;
    }

    // Mengecek apakah pohon masih kosong
    public boolean isEmpty() {
        return root == null;
    }

    // 1. Operasi ADD (Insert Data)
    public void add(Film19 data) {
        root = addRecursive(root, data);
    }

    private NodeFilm19 addRecursive(NodeFilm19 current, Film19 data) {
        if (current == null) {
            return new NodeFilm19(data);
        }

        // Jika kode baru lebih kecil, arahkan ke kiri
        if (data.kodeFilm.compareTo(current.data.kodeFilm) < 0) {
            current.left = addRecursive(current.left, data);

        // Jika kode baru lebih besar, arahkan ke kanan
        } else if (data.kodeFilm.compareTo(current.data.kodeFilm) > 0) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // 2. Operasi FIND (Mencari Data)
    public boolean find(String kodeFilm) {
        NodeFilm19 current = root;
        while (current != null) {
            if (kodeFilm.equals(current.data.kodeFilm)) {
                return true;
            }
            current = kodeFilm.compareTo(current.data.kodeFilm) < 0 ? current.left : current.right;
        }
        return false;
    }

    // 3. Traversal in-Order
    public void traverseInOrder(NodeFilm19 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    // 4. Traversal Pre-Order
    public void traversePreOrder(NodeFilm19 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // 5 Menghitung jumlah Film
    public int hitungJumlahFilm(NodeFilm19 node) {
        if (node == null) {
            return 0;
        }
        return 1 + hitungJumlahFilm(node.left) + hitungJumlahFilm(node.right);
    }

    // 6. Mencari Rating Tertinggi
    public Film19 cariRatingTertinggi(NodeFilm19 node) {
        if (node == null) {
            return null;
        }
        Film19 tertinggi = node.data;
        Film19 kiri = cariRatingTertinggi(node.left);
        Film19 kanan = cariRatingTertinggi(node.right);

        if (kiri != null && kiri.rating > tertinggi.rating) {
            tertinggi = kiri;
        }
        if (kanan != null && kanan.rating > tertinggi.rating) {
            tertinggi = kanan;
        }
        return tertinggi;
    }
}
