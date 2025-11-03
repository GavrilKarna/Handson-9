package Task1;

public class IntroToAbstractionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Introduction to Abstraction
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * konsep abstraction dan abstract class.
         */

        // ===== TANPA ABSTRACTION: CARA BIASA =====
        System.out.println("=== TANPA ABSTRACTION ===");

        // Latihan 1: Buat beberapa object hewan dengan cara biasa
        // Masalah: Kita bisa membuat object dari class Hewan yang terlalu umum
        // Padahal di dunia nyata, tidak ada "hewan" tanpa jenis spesifik

        // UNCOMMENT kode di bawah dan perhatikan masalahnya
        // HewanBiasa hewan = new HewanBiasa("Hewan Umum");
        // hewan.bersuara(); // Output apa yang akan keluar?

        HewanBiasa hewan = new HewanBiasa("Hewan Umum");
        hewan.bersuara(); // Terlalu umum!
        hewan.makan();

        // ===== DENGAN ABSTRACTION: MENGGUNAKAN ABSTRACT CLASS =====
        System.out.println("\n=== DENGAN ABSTRACTION ===");

        // Latihan 2: Menggunakan abstract class
        // Buat beberapa object dari subclass Hewan

        // Buat object Kucing
        Kucing kucing = new Kucing("Kitty");
        kucing.bersuara();
        kucing.makan();
        kucing.tidur();

        // Buat object Anjing
        Anjing anjing = new Anjing("Bobby");
        anjing.bersuara();
        anjing.makan();
        anjing.tidur();

        // Buat object Burung
        Burung burung = new Burung("Tweety");
        burung.bersuara();
        burung.makan();
        burung.tidur();

        // ===== DEMONSTRASI ABSTRACTION =====
        System.out.println("\n=== DEMONSTRASI ABSTRACTION ===");
        // Latihan 3: Polymorphic array
        // Buat array bertipe Hewan yang berisi berbagai jenis hewan
        // Iterasi array dan panggil method bersuara()

        Hewan[] hewanArray = new Hewan[3];
        hewanArray[0] = new Kucing("Kitty");
        hewanArray[1] = new Anjing("Bobby");
        hewanArray[2] = new Burung("Tweety");

        for (Hewan h : hewanArray) {
            h.bersuara();
        }

        // ===== KEUNTUNGAN ABSTRACTION =====
        System.out.println("\n=== KEUNTUNGAN ABSTRACTION ===");
        // Tuliskan dalam komentar 5 keuntungan menggunakan abstraction
        /*
         * 1. Mencegah pembuatan objek dari class yang terlalu umum.
         * 2. Memaksa subclass untuk mengimplementasikan method penting.
         * 3. Memudahkan pengembangan kode dengan struktur yang jelas.
         * 4. Mendukung polymorphism (objek bisa diperlakukan sama meski tipenya berbeda).
         * 5. Meningkatkan keamanan kode dan mengurangi duplikasi logika.
         */
    }
}