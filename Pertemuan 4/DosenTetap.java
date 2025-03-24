/* Nama File : DosenTetap.java
 * Deskripsi : Kelas untuk merepresentasikan dosen tetap sebagai subkelas dosen
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 19 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTetap extends Pegawai {
    private String fakultas;
    private String nidn;
    private LocalDate bup; // Batas Usia Pensiun

    public DosenTetap(String nidn, String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate bup) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
        this.nidn = nidn;
        this.bup = bup;
    }

    @Override
    public void printInfo() {
        System.out.println("===== Dosen Tetap =====");
        System.out.println("NIDN        : " + nidn);
        System.out.println("NIP         : " + nip);
        System.out.println("Nama        : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT         : " + formatTanggal(tmt));
        System.out.println("Jabatan     : Dosen Tetap");
        System.out.println("Fakultas    : " + fakultas);
        
        long tahunKerja = ChronoUnit.YEARS.between(tmt, LocalDate.now());
        long bulanKerja = ChronoUnit.MONTHS.between(tmt.plusYears(tahunKerja), LocalDate.now());
        System.out.println("Masa Kerja  : " + tahunKerja + " tahun " + bulanKerja + " bulan");

        System.out.println("BUP         : " + formatTanggal(bup));

        System.out.printf("Gaji Pokok  : Rp %,.2f\n", gajiPokok);
        double tunjangan = 0.02 * tahunKerja * gajiPokok;
        System.out.printf("Tunjangan   : 2%% × %d × Rp %,.2f = Rp %,.2f\n",
                tahunKerja, gajiPokok, tunjangan);
    }
}



