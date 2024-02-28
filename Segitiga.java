public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(6, 10);
        System.out.println("Luas Segitiga: " + segitiga.getLuas());
    }
}
