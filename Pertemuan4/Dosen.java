/* Nama File : Dosen.java
 * Deskripsi : Kelas untuk merepresentasikan dosen sebagai pegawai
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 19 Maret 2025
 */

abstract class Dosen extends Pegawai {
    protected String fakultas;
    
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
    
    @Override
    protected LocalDate hitungBUP() {
        // BUP Dosen adalah 65 tahun
        return tanggalLahir.plusYears(65).withDayOfMonth(1).plusMonths(1);
    }
}

