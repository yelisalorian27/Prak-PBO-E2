/* Nama File : PNS.java
 * Deskripsi : Kelas yang merepresentasikan seorang Pegawai Negeri Sipil
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 24 Maret 2025
 */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PNS extends Manusia {
    private static int counterPNS = 0;
    private String NIP;

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String NIP) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
}