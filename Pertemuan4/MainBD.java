/* Nama File : MainBD.java
 * Deskripsi : Program utama untuk pengujian bangun datar
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 19 Maret 2025
 */

public class MainBD{
    public static void main(String[] args){
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5, "Biru", "Tebal");
        System.out.println("===== PERSEGI =====");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(10, "Merah", "Tipis");
        System.out.println("===== LINGKARAN =====");
        lingkaran.printInfo();
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
        System.out.println();

        // Menampilkan jumlah objek BangunDatar yang telah dibuat
        BangunDatar.printCounterBangunDatar();
    }
}

