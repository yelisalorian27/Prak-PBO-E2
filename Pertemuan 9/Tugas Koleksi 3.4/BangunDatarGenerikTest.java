/**
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 public class BangunDatarGenerikTest {
    public static void main(String[] args) {
        // Lingkaran
        BangunDatarGenerik<Lingkaran> lingkaran = new BangunDatarGenerik<>();
        lingkaran.set(new Lingkaran(7));
        System.out.println("Lingkaran:");
        System.out.println("Luas: " + lingkaran.hitungLuas());
        System.out.println("Keliling: " + lingkaran.hitungKeliling());
        System.out.println();

        // Persegi
        BangunDatarGenerik<Persegi> persegi = new BangunDatarGenerik<>();
        persegi.set(new Persegi(4));
        System.out.println("Persegi:");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());
        System.out.println();

        // Persegi Panjang
        BangunDatarGenerik<PersegiPanjang> pp = new BangunDatarGenerik<>();
        pp.set(new PersegiPanjang(5, 3));
        System.out.println("Persegi Panjang:");
        System.out.println("Luas: " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());
        System.out.println();

        // Segitiga
        BangunDatarGenerik<Segitiga> segitiga = new BangunDatarGenerik<>();
        segitiga.set(new Segitiga(6, 4, 5, 5)); // alas, tinggi, sisi1, sisi2
        System.out.println("Segitiga:");
        System.out.println("Luas: " + segitiga.hitungLuas());
        System.out.println("Keliling: " + segitiga.hitungKeliling());
        System.out.println();
    }
}
