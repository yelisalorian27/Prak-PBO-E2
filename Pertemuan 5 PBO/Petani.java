/* Nama File : Petani.java
 * Deskripsi : Kelas yang merepresentasikan seorang petani
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 24 Maret 2025
 */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Petani extends Manusia {
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }
}