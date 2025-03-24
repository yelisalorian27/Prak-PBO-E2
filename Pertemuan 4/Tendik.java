/* Nama File : Tendik.java
 * Deskripsi : Kelas untuk merepresentasikan tenaga kependidikan sebagai pegawai
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 19 Maret 2025
 */

import java.time.LocalDate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    private LocalDate hitungBUP() {
        return tanggalLahir.plusYears(55);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP         : " + nip);
        System.out.println("Nama        : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT         : " + formatTanggal(tmt));
        System.out.println("Jabatan     : Tendik");
        System.out.println("Bidang      : " + bidang);
        System.out.println("Masa Kerja  : " + hitungMasaKerja());
        System.out.println("BUP         : " + formatTanggal(hitungBUP()));
        System.out.printf("Gaji Pokok  : Rp %,.2f\n", gajiPokok);
        double tunjangan = 0.01 * ChronoUnit.YEARS.between(tmt, LocalDate.now()) * gajiPokok;
        System.out.printf("Tunjangan   : 1%% × %d × Rp %,.2f = Rp %,.2f\n",
                ChronoUnit.YEARS.between(tmt, LocalDate.now()), gajiPokok, tunjangan);
    }
}


