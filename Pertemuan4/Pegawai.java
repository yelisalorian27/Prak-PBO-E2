/* Nama File : Pegawai.java
 * Deskripsi : Kelas untuk merepresentasikan pegawai sebagai induk dosen dan tendik
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 19 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    protected String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tanggal.format(formatter);
    }

    protected String hitungMasaKerja() {
        long tahun = ChronoUnit.YEARS.between(tmt, LocalDate.now());
        long bulan = ChronoUnit.MONTHS.between(tmt.plusYears(tahun), LocalDate.now());
        return tahun + " tahun " + bulan + " bulan";
    }

    public abstract void printInfo();
}

