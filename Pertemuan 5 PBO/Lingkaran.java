/* Nama File : Lingkaran.java
 * Deskripsi : Kelas Lingkaran yang dapat di-resize
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 24 Maret 2025
 */

 public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {}

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() { return jari; }
    public void setJari(double jari) { this.jari = jari; }

    public double getDiameter() { return 2 * jari; }

    @Override
    public double getLuas() { return Math.PI * jari * jari; }

    @Override
    public double getKeliling() { return 2 * Math.PI * jari; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    @Override
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari *= (1 + percent / 100.0); // Perbaikan bug
    }
}


