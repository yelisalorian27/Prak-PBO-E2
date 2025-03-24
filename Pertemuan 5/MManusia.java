/* Nama File : MManusia.java
 * Deskripsi : Kelas utama untuk menjalankan program utama manusia
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 24 Maret 2025
 */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000);
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000);
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("\nPajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("\nMasa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}