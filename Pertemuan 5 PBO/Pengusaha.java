/* Nama File : Pengusaha.java
 * Deskripsi : Kelas yang merepresentasikan seorang pengusaha
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 24 Maret 2025
 */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Pengusaha extends Manusia {
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
}