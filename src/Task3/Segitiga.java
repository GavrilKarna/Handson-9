package Task3;

// Implementasikan class Segitiga extends Bentuk
public class Segitiga extends Bentuk {
    private double alas, tinggi;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Override hitungLuas()
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Override hitungKeliling()
    @Override
    public double hitungKeliling() {
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + miring;
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas Segitiga (alas: " + alas + ", tinggi: " + tinggi + "): " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}
