/* Nama File : DosenTamu.java
 * Deskripsi : Kelas untuk merepresentasikan dosen tamu sebagai subkelas dosen
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 19 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Pegawai {
    private String fakultas;
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu(String nidk, String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String hitungMasaKontrak() {
        long bulan = ChronoUnit.MONTHS.between(LocalDate.now(), tanggalBerakhirKontrak);
        return bulan + " bulan";
    }

    @Override
    public void printInfo() {
        System.out.println("===== Dosen Tamu =====");
        System.out.println("NIDK        : " + nidk);
        System.out.println("NIP         : " + nip);
        System.out.println("Nama        : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT         : " + formatTanggal(tmt));
        System.out.println("Jabatan     : Dosen Tamu");
        System.out.println("Fakultas    : " + fakultas);
        
        long tahunKerja = ChronoUnit.YEARS.between(tmt, LocalDate.now());
        long bulanKerja = ChronoUnit.MONTHS.between(tmt.plusYears(tahunKerja), LocalDate.now());
        System.out.println("Masa Kerja  : " + tahunKerja + " tahun " + bulanKerja + " bulan");

        System.out.println("Masa Kontrak Berakhir: " + hitungMasaKontrak());
        System.out.println("Tanggal Berakhir Kontrak: " + formatTanggal(tanggalBerakhirKontrak));

        System.out.printf("Gaji Pokok  : Rp %,.2f\n", gajiPokok);
        double tunjangan = 0.025 * tahunKerja * gajiPokok;
        System.out.printf("Tunjangan   : 2,5%% × %d × Rp %,.2f = Rp %,.2f\n",
                tahunKerja, gajiPokok, tunjangan);
    }
}


