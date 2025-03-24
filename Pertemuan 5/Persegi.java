/* Nama File : Persegi.java
 * Deskripsi : Kelas Persegi yang dapat di-resize
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 24 Maret 2025
 */

 public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() { return sisi; }
    public void setSisi(double sisi) { this.sisi = sisi; }

    @Override
    public double getLuas() { return sisi * sisi; }

    @Override
    public double getKeliling() { return 4 * sisi; }

    public double getDiagonal() { return sisi * Math.sqrt(2); }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi *= (1 + percent / 100.0); // Perbaikan bug
    }
}

