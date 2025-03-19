/* Nama File : Main.java
 * Deskripsi : Program utama untuk menjalankan aplikasi
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 19 Maret 2025
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("78647324", "9545647548", "Andi", 
                LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, 
                "Fakultas Sains dan Matematika", LocalDate.of(2055, 6, 1));

        DosenTamu dosenTamu = new DosenTamu("12345678", "9876543210", "Budi",
                LocalDate.of(1990, 3, 15), LocalDate.of(2020, 7, 1), 4500000, 
                "Fakultas Sains dan Matematika", LocalDate.of(2025, 12, 31));

        Tendik tendik = new Tendik("1023456789", "Dewi", LocalDate.of(2000, 5, 5),
                LocalDate.of(2015, 7, 1), 5000000, "Akademik");

        // Cetak informasi tanpa duplikasi header
        dosenTetap.printInfo();
        System.out.println();
        dosenTamu.printInfo();
        System.out.println();
        tendik.printInfo();
    }
}



