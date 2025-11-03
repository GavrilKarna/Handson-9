package Task1;

// Abstract class Hewan
public abstract class Hewan {
    // Instance variable
    // protected String nama
    protected String nama;

    // Constructor
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Abstract method - harus diimplementasikan oleh subclass
    public abstract void bersuara();

    // Concrete methods
    public void makan() {
        System.out.println(nama + " sedang makan");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }

    // Method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
    }
}
