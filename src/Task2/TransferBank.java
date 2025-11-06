package Task2;

// Implementasikan class TransferBank implements Pembayaran
public class TransferBank implements Pembayaran {
    private String nomorRekening;

    // Constructor
    public TransferBank(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    // Implementasi method dari interface
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Processing Bank Transfer payment: Rp " + jumlah);
        System.out.println("Payment successful via Bank Transfer");
    }

    @Override
    public String getMetodePembayaran() {
        return "Bank Transfer";
    }
}
