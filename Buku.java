public class Buku {
    private String penulis;
    private String judul;
    private double harga;
    private int nomorPenerbit;

    public Buku(String penulis, String judul, double harga, int nomorPenerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomorPenerbit = nomorPenerbit;
    }

    public double getHarga() {
        return harga;
    }

    public static void main(String[] args) {
        Buku buku1 = new Buku("Penulis 1", "Judul Buku 1", 50.0, 123);
        Buku buku2 = new Buku("Penulis 2", "Judul Buku 2", 40.0, 456);

        double totalHarga = buku1.getHarga() + buku2.getHarga();
        System.out.println("Total Harga Semua Buku: " + totalHarga);
    }
}
