/* Nama File : Manusia.java
 * Deskripsi : Abstract class untuk manusia dengan atribut dasar
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 24 Maret 2025
 */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public abstract double hitungPajak();
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
    }

    public void cetakInfo() {
        System.out.println("\nNama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pendapatan: " + pendapatan);
    }
}