public class FilmMain19 {

    public static void main(String[] args) {
        BinarySearchTreeFilm19 bst = new BinarySearchTreeFilm19();

        bst.add(new Film19("FL105", "Interstellar", "Sci-Fi", 8.6));
        bst.add(new Film19("FL102", "Coco", "Animation", 8.4));
        bst.add(new Film19("FL108", "Inception", "Sci-Fi", 8.8));
        bst.add(new Film19("FL101", "Up", "Animation", 8.3));
        bst.add(new Film19("FL104", "Parasite", "Thriller", 8.5));
        bst.add(new Film19("FL107", "Spirited Away", "Fantasy", 8.6));

        // Data Film secara in-order
        System.out.println("1. Data film in-order:");
        bst.traverseInOrder(bst.root);

        // Data Film secara pre-order
        System.out.println("\n2. Data film pre-order:");
        bst.traversePreOrder(bst.root);

        // Pencarian Film (FL104, FL110)
        System.out.println("\n3. PEncarian Film berdasarkan Kode Flm: ");
        System.out.println("\nPencarian FL104: " + (bst.find("FL104") ? "ditemukan" : "tidak ditemukan"));
        System.out.println("Pencarian FL110: " + (bst.find("FL110") ? "ditemukan" : "tidak ditemukan"));

        // Menghitung jumlah film
        System.out.println("\n4. Jumlah film: " + bst.hitungJumlahFilm(bst.root));

        // Mencari film dengan rating tertinggi
        System.out.println("\n5. Film dengan rating tertinggi:");
        bst.cariRatingTertinggi(bst.root).tampilInformasi();
    }
}
