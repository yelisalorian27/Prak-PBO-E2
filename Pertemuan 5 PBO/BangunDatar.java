/* Nama File : BangunDatar.java
 * Deskripsi : Abstract class untuk berbagai bangun datar
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 24 Maret 2025
 */

 public abstract class BangunDatar {
    // ==== Atribut ====
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar;

    // ==== Konstruktor ====
    protected BangunDatar() {
        counterBangunDatar++;
    }

    protected BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // ==== Metode Abstrak ====
    public abstract double getLuas();
    public abstract double getKeliling();

    // ==== Getter dan Setter ====
    public int getJmlSisi() { return jmlSisi; }
    public void setJmlSisi(int jmlSisi) { this.jmlSisi = jmlSisi; }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public String getBorder() { return border; }
    public void setBorder(String border) { this.border = border; }

    public void printInfo() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // Fungsi untuk membandingkan luas dan keliling
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }
}


